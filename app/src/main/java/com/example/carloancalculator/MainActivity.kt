package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.EditText
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.app.ComponentActivity
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T





class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){

            val input: List<String> =
                listOf(editText.text.toString(), editText2.text.toString(), editText3.text.toString(), editText4.text.toString())

            val value:List<Double> = listOf(input.get(0).toDouble(), input.get(1).toDouble(), input.get(2).toDouble(), input.get(3).toDouble())

            val carLoan:Double = value.get(0) - value.get(1)
            val interest:Double = carLoan * value.get(3) * value.get(2)
            val monthlyRepayment:Double = (carLoan + interest)/ value.get(2) / 12

            textView10.text = "Car Loan                       :  %.2f \n Interest                        :  %.2f \n Monthly Repayment :  %.2f".format(carLoan, interest, monthlyRepayment)
        }
    }

    private fun clickHandlerFunction(viewThatIsClicked: View) {

    }










}
