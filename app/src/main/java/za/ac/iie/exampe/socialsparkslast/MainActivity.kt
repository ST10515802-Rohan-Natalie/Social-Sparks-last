package za.ac.iie.exampe.socialsparkslast

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val TOD = findViewById<EditText>(R.id.TOD)
        val BtnSug = findViewById<Button>(R.id.BtnSug)
        val BtnRes = findViewById<Button>(R.id.BtnRes)
        val TVresult = findViewById<TextView>(R.id.TVresult)

        BtnSug.setOnClickListener {

            val Time = TOD.text.toString()

            if ( Time == "Morning"){
                TVresult.text = "Morning good fello, wants on the agenda"
            }
            else if (Time == "Mid Morning"){
                TVresult.text = "Late early riser? Lets get up"
            }
            else if (Time == "Afternoon"){
                TVresult.text = "Well, half the day is gone but lets get up"
            }
            else if (Time == "Afternoon snack "){
                TVresult.text = "You must have gone to bed late, but lets take it slow today"
            }
            else if(Time == "Dinner"){
                TVresult.text = "Go back to bed, lets wake up tomorrow"
            }
            else if(Time == "After Dinner"){
                TVresult.text = "Lets get a midnight snack"
            }
            else{
                TVresult.text = "PLease input a time of da, such as Morning/Afternoon etc."
            }

            BtnRes.setOnClickListener {
                TOD.text.clear()
                TVresult.text = ""
            }
        }

    }
}