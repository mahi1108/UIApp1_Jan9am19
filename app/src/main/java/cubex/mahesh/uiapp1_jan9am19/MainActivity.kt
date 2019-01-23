package cubex.mahesh.uiapp1_jan9am19

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener{
            tv1.setText(et1.getText())
        }

    } // onCreate

   fun getText(v:View) = tv1.setText(et1.getText())
}
