package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment


class FragmentOne : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(context, "onAttach() is called", Toast.LENGTH_SHORT).show()


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Called when the fragment is created
        Toast.makeText(context, "onCreate() is Called", Toast.LENGTH_SHORT).show()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Called to create the view hierarchy associated with the fragment
        Toast.makeText(context, "onCreateView() is called", Toast.LENGTH_SHORT).show()
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(context, "onStart() is called", Toast.LENGTH_SHORT).show()

    }


    override fun onResume() {
        super.onResume()
        Toast.makeText(context, "onResume() is called", Toast.LENGTH_SHORT).show()

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(context, "onPause() is called", Toast.LENGTH_SHORT).show()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(context, "onDestroyView() is called", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(context, "onDestroy() is called", Toast.LENGTH_SHORT).show()

    }

    override fun onDetach() {
        super.onDetach()
        Toast.makeText(context, "onDetach() is called", Toast.LENGTH_SHORT).show()

    }

}