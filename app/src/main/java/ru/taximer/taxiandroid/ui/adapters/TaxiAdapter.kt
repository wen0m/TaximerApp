package ru.taximer.taxiandroid.ui.adapters


import android.support.v7.util.SortedList
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.util.SortedListAdapterCallback
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.makeramen.roundedimageview.RoundedImageView
import ru.taximer.taxiandroid.R
import ru.taximer.taxiandroid.network.models.SearchTaxiModel
import ru.taximer.taxiandroid.utils.displayImage


interface OnTaxiHolderListener {
    fun onAppSelect(type: Int, installUrl: String, openUrl: String, appId: String, taxoparkId: String, taxinameEng: String)
}

interface TaxiCallHolderListener {
    fun onPhoneCall()
}

class TaxiAdapter(val callback: OnTaxiHolderListener, val phoneback: TaxiCallHolderListener) : RecyclerView.Adapter<TaxiViewHolder>(), OnTaxiHolderListener, TaxiCallHolderListener {

    private val data: SortedList<SearchTaxiModel> = SortedList(SearchTaxiModel::class.java, object : SortedListAdapterCallback<SearchTaxiModel>(this)
    {
        override fun areItemsTheSame(item1: SearchTaxiModel?, item2: SearchTaxiModel?): Boolean {
            return item1?.taxopark_id == item2?.taxopark_id
        }

        override fun compare(o1: SearchTaxiModel?, o2: SearchTaxiModel?): Int {
            return o1?.order!!.compareTo(o2?.order!!)
        }

        override fun areContentsTheSame(oldItem: SearchTaxiModel?, newItem: SearchTaxiModel?): Boolean {
            return oldItem == newItem
        }
    })

    override fun onBindViewHolder(holder: TaxiViewHolder, position: Int) {
        holder.bind(data.get(position), this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaxiViewHolder {
        return TaxiViewHolder.create(LayoutInflater.from(parent.context), parent)
    }

    fun addItem(item: SearchTaxiModel) {
        data.add(item)
    }

    fun clear() {
        data.clear()
        notifyDataSetChanged()
    }


    override fun onAppSelect(type: Int, installUrl: String, openUrl: String, appId: String, taxoparkId: String, taxinameEng: String) {
        callback.onAppSelect(type, installUrl, openUrl, appId, taxoparkId, taxinameEng)
    }

    override fun onPhoneCall() {
        phoneback.onPhoneCall()
    }

    override fun getItemCount() = data.size()
}


class TaxiViewHolder private constructor(root: View) : RecyclerView.ViewHolder(root) {
    companion object {
        fun create(inflater: LayoutInflater, parent: ViewGroup) =
                TaxiViewHolder(inflater.inflate(R.layout.application_item, parent, false))
    }

    var appIcon: RoundedImageView = itemView.findViewById<View>(R.id.app_icon) as RoundedImageView
    var goAppIcon: RoundedImageView = itemView.findViewById<View>(R.id.arrow) as RoundedImageView
    var goCallIcon: RoundedImageView = itemView.findViewById<View>(R.id.call) as RoundedImageView
    var appName: TextView = itemView.findViewById<View>(R.id.app_name) as TextView
    var appValue: TextView = itemView.findViewById(R.id.price) as TextView
    var appLabel: TextView = itemView.findViewById(R.id.label) as TextView
    var appTime: TextView = itemView.findViewById(R.id.time) as TextView

    var model: SearchTaxiModel? = null
    var listener: OnTaxiHolderListener? = null

    init {
        root.setOnClickListener {
            listener?.onAppSelect(
                    model?.call_type ?: 1,
                    model?.installation_link ?: "",
                    model?.application_link ?: "",
                    model?.android_app_id ?: "",
                    model?.taxopark?.id?.toString() ?: "",
                    model?.taxopark?.name_en ?: ""
            )
        }
    }

    fun bind(model: SearchTaxiModel, listener: OnTaxiHolderListener) {
        this.listener = listener
        this.model = model
        appName.text = this.model?.taxopark?.name
        appIcon.displayImage(this.model?.taxopark?.img_url, R.mipmap.ic_launcher)
        appValue.text = this.model?.taxopark_price
        appTime.text = this.model?.wait_time?.div(60).toString().plus(" мин")

        if (model.call_type == 2) {
            goAppIcon.visibility = View.INVISIBLE
            goCallIcon.visibility = View.VISIBLE
        }

        if (model.isBest) {
            appLabel.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.ic_like_icon, 0)
            appLabel.visibility = View.VISIBLE
            appLabel.text = this.model?.label
        } else {
            appLabel.visibility = View.GONE
            appLabel.text = null

            if (model.label == "Каршеринг") {
                appLabel.visibility = View.VISIBLE
                appLabel.text = model.label
                appLabel.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, null, null)

            }
        }
    }
}

