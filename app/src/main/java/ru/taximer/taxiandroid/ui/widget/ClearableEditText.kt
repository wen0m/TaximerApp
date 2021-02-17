package ru.taximer.taxiandroid.ui.widget

import android.content.Context
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.support.v4.content.res.ResourcesCompat
import android.support.v7.widget.AppCompatEditText
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import ru.taximer.taxiandroid.R


class ClearableEditText : AppCompatEditText {
    private lateinit var mClearButtonImage: Drawable
    private lateinit var mCloseButtonImage: Drawable

    constructor(context: Context) : super(context) {
        setupButton()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        setupButton()
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        setupButton()
    }

    fun changeButtonImage(case : Boolean) {
        if (!case) {
            mCloseButtonImage = ResourcesCompat.getDrawable(resources,
                    R.drawable.ic_icon_marker_yellow, null)!!
        } else
            mCloseButtonImage = ResourcesCompat.getDrawable(resources,
                    R.drawable.ic_icon_pickup_small, null)!!
        setCompoundDrawablesRelativeWithIntrinsicBounds(mCloseButtonImage, null, mClearButtonImage, null)
    }

    private fun setupButton() {
        mClearButtonImage = ResourcesCompat.getDrawable(resources,
                R.drawable.places_ic_clear, null)!!

        setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, mClearButtonImage, null)

        addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s?.isEmpty()!!){
                    setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, null, null)
                }else{
                    mClearButtonImage = ResourcesCompat.getDrawable(resources,
                            R.drawable.places_ic_clear, null)!!
                    setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, mClearButtonImage, null)
                    setSelection(text.length)
                }
            }
        })

        setOnTouchListener(View.OnTouchListener { _, event ->
            val bounds = mClearButtonImage.bounds
//            val tapArea: Int = 10
//            var x = (event.x + tapArea).toInt()
//            var y = (event.y - tapArea).toInt()
//            x = width - x
//            if (x <= 0) x += tapArea
//            if (y <= 0) y = event.y.toInt()
            val tappedX = event.getX() > (getWidth() - getPaddingRight() - bounds.width())
            if (event.action == MotionEvent.ACTION_UP) {
                if (tappedX) {
                    this.setText("")
                    return@OnTouchListener true
                }
            }
            return@OnTouchListener false
        })
    }


    private fun getBounds(index: Int, drawable: Drawable, view: View): Rect {
        val drawableBounds = drawable.bounds
        val bounds = Rect()

        when (index) {
            0 -> bounds.offsetTo(view.paddingLeft,
                    view.height / 2 - bounds.height() / 2)                      //left

            1 -> {}

            2 -> bounds.offsetTo(view.width - view.paddingRight - bounds.width(), //right
                    view.height / 2 - bounds.height() / 2)

            3 -> {}
        }

        return bounds
    }

}