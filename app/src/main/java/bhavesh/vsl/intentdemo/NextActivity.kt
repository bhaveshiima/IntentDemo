package bhavesh.vsl.intentdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        var s = intent.getStringExtra("person_name")
        tv1.text = "Welcome $s, <br> to Welcome to Vikram sarabhai Library"

        // Back Button [ START ]
        btnBack.setOnClickListener {
            var i = Intent(this@NextActivity, MainActivity::class.java)
            startActivity(i)
        }
        // Back Button [ End ]
    }
}
