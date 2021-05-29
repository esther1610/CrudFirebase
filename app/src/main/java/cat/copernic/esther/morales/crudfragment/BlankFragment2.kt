package cat.copernic.esther.morales.crudfragment

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil.*

import androidx.navigation.fragment.findNavController
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseApp.initializeApp


import kotlinx.android.synthetic.main.fragment_blank1.*
import kotlinx.android.synthetic.main.fragment_blank2.*
import kotlinx.android.synthetic.main.fragment_blank2.view.*
import androidx.databinding.DataBindingUtil
import cat.copernic.esther.morales.crudfragment.databinding.FragmentBlank2Binding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.util.*


/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment2 : Fragment() {

    var firebaseDatabase: FirebaseDatabase? = null
    var databaseReference: DatabaseReference? = null

    private var mParam1: String? = null
    private var mParam2: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    lateinit var mascota : Mascota
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {


var binding=DataBindingUtil.inflate<FragmentBlank2Binding>(layoutInflater, R.layout.fragment_blank2, container, false)

        mascota = Mascota()
        binding.mascota=mascota

        binding.butonGuardarBtnnn.setOnClickListener(){

            if(txtNombreMascota.equals("")||txtRazaMascota.equals("")||txtNacimientoMascota.equals("")||editChipNumber.equals("")||
                    editTextPeso.equals("")){
                validacion()
            } else {

                mascota.nom=binding.txtNombreMascota.text.toString()
                mascota.rassa=binding.txtRazaMascota.toString()
                mascota.dataNaixement=binding.txtNacimientoMascota.text.toString()
                mascota.numCgip=binding.editChipNumber.text.toString()
                mascota.pes=binding.editTextPeso.text.toString()


                limpiarCajas()

            }

            val opdiag = OperaciondBDfirebase_mascota()
            opdiag.guardar(mascota)

        }
        return binding.root
    }



    fun validacion() {

        if (txtNombreMascota.equals("")) {
            txtNombreMascota.setError("Required")
        } else if (txtRazaMascota.equals("")) {
            txtRazaMascota.setError("Required")
        } else if (txtNacimientoMascota.equals("")) {
            txtNacimientoMascota.setError("Required")
        } else if (editChipNumber.equals("")) {
            editChipNumber.setError("Required")
        }else if (editTextPeso.equals("")){
            editTextPeso.setError("Required")
        }
    }


    private fun limpiarCajas() {

        txtNombreMascota.setText("")
        txtRazaMascota.setText("")
        txtNacimientoMascota.setText("")
        editChipNumber.setText("")
        editTextPeso.setText("")
    }

}
