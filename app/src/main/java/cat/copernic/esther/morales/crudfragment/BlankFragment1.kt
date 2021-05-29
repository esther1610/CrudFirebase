package cat.copernic.esther.morales.crudfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import cat.copernic.esther.morales.crudfragment.R.id.action_blankFragment1_to_blankFragment2
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.fragment_blank1.*
import kotlinx.android.synthetic.main.fragment_blank2.*
import java.util.*

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment1 : Fragment() {
  //  private  lateinit var _binding: BlankFragment1
   // private  var _binding: BlankFragment1Binding?=null
   // private val binding get() = _binding!!
    // TODO: Rename and change types of parameters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {


        }
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
      //  Inflate the layout for this fragment
              //  return inflater.inflate(R.layout.fragment_blank1, container, false)
     //   _binding = BlankFragment1Binding.inflate(inflater, container, false)

        //val view = binding.root
       // return view


        return inflater.inflate(R.layout.fragment_blank1, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

      buttonIr.setOnClickListener(){
          findNavController().navigate(action_blankFragment1_to_blankFragment2)
      }



    }


}