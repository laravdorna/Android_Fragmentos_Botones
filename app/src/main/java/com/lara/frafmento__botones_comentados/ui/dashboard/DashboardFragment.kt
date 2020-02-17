package com.lara.frafmento__botones_comentados.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.lara.frafmento__botones_comentados.R

class DashboardFragment : Fragment() {

    //aqui se crea el fragmento

    //se instancia el viw model donde se hacen los gets y sets
    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        dashboardViewModel =
            ViewModelProviders.of(this).get(DashboardViewModel::class.java)

        //inflate : Método que se utiliza para construir y añadir las Views a los diseños
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
 //hace que se cargue el contenido dentro del fragmento
        val textView: TextView = root.findViewById(R.id.text_dashboard)

        //
        dashboardViewModel.text.observe(this, Observer {
            textView.text = it
        })


        //devuelve un val
        return root
    }
}