package bhavesh.vsl.intentdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dial.setOnClickListener {
            var i = Intent()

            /* To open the Dial Screen [ START ] */
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel:"+et1.text.toString())
            /* To open the Dial Screen [ START ] */

            /* Open Browser [ START ]
            i.action = Intent.ACTION_VIEW
            i.data = Uri.parse(et1.text.toString())
            Open Browser [ End ] */

           /* Open Specific Type files [ START ] */
           // i.action = Intent.ACTION_GET_CONTENT
           // i.type = "image/*"
           //i.type = "audio/*"
           // i.type = "video/*"

            /* Open Specific Type files [ END ] */
            startActivity(i)
        } // dial.OnclickListner()


        // Now WatsApp button
        watsapp.setOnClickListener {
                var packageName = "com.whatsapp"
                var i = packageManager.getLaunchIntentForPackage(packageName)
                startActivity(i)

        } // watsapp.OnclickListner()

        // Redbus Button [ START ]
        redbus.setOnClickListener {
            var packageName = "in.redbus.android"
            var i = packageManager.getLaunchIntentForPackage(packageName)

            if(i!=null){
                startActivity(i)
            }else{
                var i1 = Intent()
                i1.action = Intent.ACTION_VIEW
                i1.data = Uri.parse("https://play.google.com/store/apps/details?id=in.redbus.android")
                startActivity(i1)
            }
            // Redbus Button [ END ]
        } // Red Bus Onclick [ END]


        // Next Activity Button [ START ]
        nextBtn.setOnClickListener {
            var iNext = Intent(this@MainActivity, NextActivity::class.java)
            iNext.putExtra( "person_name", et2.text.toString())
            startActivity(iNext)
        }
        // Next Activity Button [ END ]



    } // MainActivity()
}
