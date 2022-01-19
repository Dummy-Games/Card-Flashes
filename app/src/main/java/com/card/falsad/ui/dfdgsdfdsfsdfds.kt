package com.card.falsad.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.card.falsad.R

class dfdgsdfdsfsdfds : Fragment(R.layout.gfdgdfgfdf) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn).setOnClickListener {
            findNavController().popBackStack()
        }
    }
}
