package com.adesoftware.advancecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.view.View
import android.widget.EditText
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression

class AdvanceCalculatorActivity : AppCompatActivity() {

    private lateinit var previousCalculation: TextView
    private lateinit var display: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advance_calculator)

        previousCalculation = findViewById(R.id.previous_cal_view)
        display = findViewById(R.id.display_edit_text)

        display.showSoftInputOnFocus = false
    }

    private fun updateText(stringToAdd: String) {
        val oldString: String = display.text.toString()

        val cursorPosition: Int = display.selectionStart
        val leftString: String = oldString.substring(0, cursorPosition)
        val rightString: String = oldString.substring(cursorPosition)


        display.setText(String.format("%s%s%s", leftString, stringToAdd, rightString))
        display.setSelection(cursorPosition + stringToAdd.length)
    }

    fun zeroBtnPush(view: View) {
        updateText(resources.getString(R.string.zeroText))
    }

    fun oneBtnPush(view: View) {
        updateText(resources.getString(R.string.oneText))
    }

    fun twoBtnPush(view: View) {
        updateText(resources.getString(R.string.twoText))
    }

    fun threeBtnPush(view: View) {
        updateText(resources.getString(R.string.threeText))
    }

    fun fourBtnPush(view: View) {
        updateText(resources.getString(R.string.fourText))
    }

    fun fiveBtnPush(view: View) {
        updateText(resources.getString(R.string.fiveText))
    }

    fun sixBtnPush(view: View) {
        updateText(resources.getString(R.string.sixText))
    }

    fun sevenBtnPush(view: View) {
        updateText(resources.getString(R.string.sevenText))
    }

    fun eightBtnPush(view: View) {
        updateText(resources.getString(R.string.eightText))
    }

    fun nineBtnPush(view: View) {
        updateText(resources.getString(R.string.nineText))
    }

    fun decimalBtnPush(view: View) {
        updateText(resources.getString(R.string.decimalText))
    }

    fun addBtnPush(view: View) {
        updateText(resources.getString(R.string.addText))
    }

    fun subtractBtnPush(view: View) {
        updateText(resources.getString(R.string.subtractText))
    }

    fun multiplyBtnPush(view: View) {
        updateText(resources.getString(R.string.multiplyText))
    }

    fun divideBtnPush(view: View) {
        updateText(resources.getString(R.string.divideText))
    }

    fun openParentBtnPush(view: View) {
        updateText(resources.getString(R.string.parenthesesOpenText))
    }

    fun closeParentBtnPush(view: View) {
        updateText(resources.getString(R.string.parenthesesCloseText))
    }

    fun clearBtnPush(view: View) {
        display.setText("")
    }

    fun equalsBtnPush(view: View) {
        val userExpression: String = display.text.toString()

        val expression: Expression = Expression(userExpression)
        val result: String = expression.calculate().toString()
        display.setText(result)
        display.setSelection(result.length)
    }

    fun backspaceBtnPush(view: View) {
        val cursorPosition: Int = display.selectionStart
        val textLength: Int = display.text.length
        if (cursorPosition != 0 && textLength != 0) {
            val selection: SpannableStringBuilder = display.text as SpannableStringBuilder
            selection.replace(cursorPosition-1, cursorPosition, "")
            display.text = selection
            display.setSelection(cursorPosition-1)
        }
    }

    fun trigSinBtnPush(view: View) {
        updateText(resources.getString(R.string.trigSinText))
    }

    fun trigCosBtnPush(view: View) {
        updateText(resources.getString(R.string.trigCosText))
    }

    fun trigTanBtnPush(view: View) {
        updateText(resources.getString(R.string.trigTanText))
    }

    fun trigArcSinBtnPush(view: View) {
        updateText(resources.getString(R.string.trigArcSinText))
    }

    fun trigArcCosBtnPush(view: View) {
        updateText(resources.getString(R.string.trigArcCosText))
    }

    fun trigArcTanBtnPush(view: View) {
        updateText(resources.getString(R.string.trigArcTanText))
    }

    fun logBtnPush(view: View) {
        updateText(resources.getString(R.string.logText))
    }

    fun naturalLogBtnPush(view: View) {
        updateText(resources.getString(R.string.naturalLogText))
    }

    fun squareRootBtnPush(view: View) {
        updateText(resources.getString(R.string.squareRootText))
    }

    fun eBtnPush(view: View) {
        updateText(resources.getString(R.string.eText))
    }

    fun piBtnPush(view: View) {
        updateText(resources.getString(R.string.piText))
    }

    fun absoluteBtnPush(view: View) {
        updateText(resources.getString(R.string.absoluteValueText))
    }

    fun primeBtnPush(view: View) {
        updateText(resources.getString(R.string.isPrimeFunctionText))
    }

    fun squareBtnPush(view: View) {
        updateText(resources.getString(R.string.xSquaredText))
    }

    fun powerBtnPush(view: View) {
        updateText(resources.getString(R.string.xPowerYText))
    }
}