package com.sasfmlzr.architecturecomponents.custom_view

import android.content.Context
import android.util.AttributeSet
import android.widget.EditText
import com.sasfmlzr.architecturecomponents.R

class CustomOnlyEditTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : EditText(context, attrs) {

    var isError = false

    companion object {
        private val STATE_ERROR = intArrayOf(R.attr.state_error)
    }

    override fun onCreateDrawableState(extraSpace: Int): IntArray {
        var drawableState = super.onCreateDrawableState(extraSpace + 1)
        if (isError) {
            drawableState=  mergeDrawableStates(drawableState,
                STATE_ERROR
            )
        }
        return drawableState
    }

}
