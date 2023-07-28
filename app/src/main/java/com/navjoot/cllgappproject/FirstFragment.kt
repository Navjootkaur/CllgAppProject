package com.navjoot.cllgappproject

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.navjoot.cllgappproject.databinding.ActivityMainBinding
import com.navjoot.cllgappproject.databinding.FragmentFirstBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {
 lateinit var binding: FragmentFirstBinding
    private var param1: String? = null
    private var param2: String? = null
    lateinit var mainActivity: MainActivity
    lateinit var baseAdapterClass: BaseAdapterClass
    var itemList = mutableListOf<ItemDataClassEntity>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentFirstBinding.inflate(layoutInflater)
        baseAdapterClass = BaseAdapterClass(itemList)
        binding.listItemView.adapter = baseAdapterClass
        baseAdapterClass = BaseAdapterClass(itemList)
        binding.listItemView.adapter = baseAdapterClass
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      /*  binding.fab.setOnClickListener {
            var dialog = Dialog(this)
            dialog.setContentView(R.layout.add_dialog)
            dialog.show()
            var etaddName = dialog.findViewById<EditText>(R.id.etaddName)
            var etaddQuantity = dialog.findViewById<EditText>(R.id.etaddQuantity)
            var btnAdd = dialog.findViewById<Button>(R.id.btnAdd)

            btnAdd.setOnClickListener {
                if (etaddName.text.toString().isNullOrEmpty()) {
                    etaddName.error = "Enter item name"
                }
                else if (etaddQuantity.text.toString().isNullOrEmpty()) {
                    etaddQuantity.error = "Enter Item Quantity"
                }
            }

        }*/

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}