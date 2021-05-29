package cat.copernic.esther.morales.crudfragment

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import cat.copernic.esther.morales.crudfragment.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {



    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }

    private fun missatgeEmergent(titol: String, missatge: String) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(titol)
        builder.setMessage(missatge)
        builder.setPositiveButton("Aceptar") { dialog, which ->
        }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }


}