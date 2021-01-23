package th.ac.su.ict.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var op = findViewById<EditText>(R.id.op)
        var po = findViewById<EditText>(R.id.po)
        var kamtob = findViewById<TextView>(R.id.kamtob)
        val cilk = findViewById<Button>(R.id.cilk)
        val vat = findViewById<CheckBox>(R.id.vat)

        cilk.setOnClickListener {
            var price = op.text.toString().toInt()
            var cent = po.text.toString().toInt()


            if (vat.isChecked){
                val totalInt = (price-(price*cent/100.0)) + (price-(price*cent/100.0))*0.07
                kamtob.text = totalInt.toString()
            }
            else{
                val totalInt = price-(price*cent/100.0)
                kamtob.text = totalInt.toString()
            }



        }

    }
}