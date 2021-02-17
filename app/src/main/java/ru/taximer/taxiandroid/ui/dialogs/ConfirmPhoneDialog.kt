package ru.taximer.taxiandroid.ui.dialogs

import android.app.AlertDialog
import android.app.Dialog
import android.app.DialogFragment
import android.os.Bundle
import android.telephony.PhoneNumberFormattingTextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.makeramen.roundedimageview.RoundedImageView
import ru.taximer.taxiandroid.R


class ConfirmPhoneDialog: DialogFragment() {
    val ARG_CONFIRM = "Dialog.CONFIRM"
    val ARG_ORDER = "Dialog.ORDER"
    var TAG = "FullScreenDialog"

    var phoneBar: EditText? = null
    var codeBar: EditText? = null
    var confirmBtn: Button? = null
    var confirmationInfoTxt: TextView? = null
    var confirmNumberTextView: TextView? = null
    var anotherTextView: TextView? = null

    var orderIcon: RoundedImageView? = null
    var orderTextView: TextView? = null
    var numerTextView: TextView? = null
    var orderBtn: Button? = null
    var changeNumber: TextView? = null

    interface SendCode {
        fun onSendCodeResult(phone: String)
        fun onCodeConfirm(code: String)
        fun onOrderResult()
        fun changeNumberResult()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(this.arguments)
    }


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        var args = arguments

        var _view: View = getActivity().getLayoutInflater().inflate(R.layout.confirm_phone_dialog, null)

        this.phoneBar = _view.findViewById(R.id.phoneBox)
        this.codeBar = _view.findViewById(R.id.getCodeBox)
        this.confirmBtn = _view.findViewById(R.id.sendCodeBtn)
        this.confirmNumberTextView = _view.findViewById(R.id.taxiName)
        this.anotherTextView = _view.findViewById(R.id.textView5)

        this.orderIcon = _view.findViewById(R.id.orderIcon)
        this.orderTextView = _view.findViewById(R.id.textView6)
        this.numerTextView = _view.findViewById(R.id.numberTextView)
        this.orderBtn = _view.findViewById(R.id.callDriverBtn)
        this.changeNumber = _view.findViewById(R.id.changeNumber)

//        if (args.get(ARG_CONFIRM) == true) {
//            this.phoneBar?.visibility = View.VISIBLE
//            this.codeBar?.visibility = View.VISIBLE
//            this.confirmBtn?.visibility = View.VISIBLE
//            this.confirmNumberTextView?.visibility = View.VISIBLE
//            this.anotherTextView?.visibility = View.VISIBLE
//
//            this.orderIcon?.visibility = View.GONE
//            this.orderTextView?.visibility = View.GONE
//            this.numerTextView?.visibility = View.GONE
//            this.orderBtn?.visibility = View.GONE
//            this.changeNumber?.visibility = View.GONE
//        }
//
//        if (args.get(ARG_ORDER) == true) {
            this.orderIcon?.visibility = View.VISIBLE
            this.orderTextView?.visibility = View.VISIBLE
            this.numerTextView?.visibility = View.VISIBLE
            this.orderBtn?.visibility = View.VISIBLE
            this.changeNumber?.visibility = View.VISIBLE

            this.phoneBar?.visibility = View.GONE
            this.codeBar?.visibility = View.GONE
            this.confirmBtn?.visibility = View.GONE
            this.confirmNumberTextView?.visibility = View.GONE
            this.anotherTextView?.visibility = View.GONE
//        }


        this.phoneBar?.addTextChangedListener(PhoneNumberFormattingTextWatcher("+7"))
        this.confirmBtn?.setOnClickListener {
            (activity as SendCode).onSendCodeResult(phoneBar?.text.toString())
            this.confirmBtn?.isEnabled = false
            this.phoneBar?.isFocusable = false
            this.codeBar?.isFocusable = true
        }

        this.codeBar?.setOnEditorActionListener { textView, i, keyEvent ->
            if (i == EditorInfo.IME_ACTION_DONE || i == EditorInfo.IME_ACTION_SEARCH) {
                (activity as SendCode).onCodeConfirm(textView.text.toString()) //TODO sic!!!
                true
            } else false
        }

        this.orderBtn?.setOnClickListener {
            (activity as SendCode).onOrderResult()
        }

        var alert = AlertDialog.Builder(activity)
        alert.setView(_view)
        return alert.create()
    }


//    override fun onStart() {
//        super.onStart()
//        val dialog = dialog
//        if (dialog != null) {
//            val width = ViewGroup.LayoutParams.MATCH_PARENT
//            val height = ViewGroup.LayoutParams.MATCH_PARENT
//            dialog.window.setLayout(width, height)
//        }
//    }
}