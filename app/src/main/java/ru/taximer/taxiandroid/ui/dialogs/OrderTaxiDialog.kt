package ru.taximer.taxiandroid.ui.dialogs

import android.app.AlertDialog
import android.app.Dialog
import android.app.DialogFragment
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.makeramen.roundedimageview.RoundedImageView
import ru.taximer.taxiandroid.R

class OrderTaxiDialog: DialogFragment() {
    val ARG_DESC = "Dialog.DESCRIPTION"
    var descriptionText: String = ""

    companion object {
        fun newInstance(content: String): OrderTaxiDialog {
            val f = OrderTaxiDialog()

            val args = Bundle()
            args.putString("Dialog.DESCRIPTION", content)
            f.arguments = args

            return f
        }
    }

    interface GetOrder {
        fun getOrder()
        fun onCancel()
    }

    var taxiIcon: ImageView? = null
    var taxiName: TextView? = null
    var description: TextView? = null
    var callDriverBtn: Button? = null
    var cancelBtn: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        descriptionText = arguments.getString("Dialog.DESCRIPTION")
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        var _view: View = getActivity().getLayoutInflater().inflate(R.layout.call_taxi_dialog, null)

        this.taxiIcon = _view.findViewById(R.id.taxiIcon)
        this.taxiName = _view.findViewById(R.id.taxiName)
        this.description = _view.findViewById(R.id.description)
        this.callDriverBtn = _view.findViewById(R.id.callDriverBtn)
        this.cancelBtn = _view.findViewById(R.id.cancelBtn)

        this.description?.text = arguments.getString(ARG_DESC)

        this.cancelBtn?.setOnClickListener {
            (activity as GetOrder).onCancel()
        }

        this.callDriverBtn?.setOnClickListener {
            (activity as GetOrder).getOrder()
        }

        var alert = AlertDialog.Builder(activity)
        alert.setView(_view)
        return alert.create()
    }

    fun refreshDescriptionText(desc: String) {
        this.description?.text = desc
    }
}