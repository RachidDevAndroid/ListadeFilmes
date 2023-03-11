package com.rachid.listadefilmes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.rachid.listadefilmes.adapter.AdapterFilme
import com.rachid.listadefilmes.databinding.ActivityListaFilmesBinding
import com.rachid.listadefilmes.model.Filme

class ListaFilmes : AppCompatActivity() {
    private lateinit var binding: ActivityListaFilmesBinding
    private lateinit var adapterFilme: AdapterFilme
    private val listaFilmes: MutableList<Filme> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityListaFilmesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val recyclerViewFilmes = binding.recyclerViewFilmes
        recyclerViewFilmes.layoutManager = GridLayoutManager(this, 4)
        recyclerViewFilmes.setHasFixedSize(true)

        adapterFilme = AdapterFilme(this, listaFilmes)
        recyclerViewFilmes.adapter = adapterFilme

          igetFilmes()

        supportActionBar !!.hide()




    }

    private fun igetFilmes(){
        val filme1 = Filme(R.drawable.filme1,"Thor Amor E trovão")
        listaFilmes.add(filme1)

        val filme2 = Filme(R.drawable.filme2,"Sonic O filme")
        listaFilmes.add(filme2)

        val filme3 = Filme(R.drawable.filme3,"Coringa")
        listaFilmes.add(filme3)

        val filme4 = Filme(R.drawable.filme4,"Meu MAlvado Favorito 3")
        listaFilmes.add(filme4)

        val filme5 = Filme(R.drawable.filme5,"Homem-Aranha Sem Volta Para Casa")
        listaFilmes.add(filme5)

        val filme6 = Filme(R.drawable.filme6,"O Contador")
        listaFilmes.add(filme6)

        val filme7 = Filme(R.drawable.filme7,"Velozes e Furiosos 8")
        listaFilmes.add(filme7)

        val filme8 = Filme(R.drawable.filme8,"Pixels O filme")
        listaFilmes.add(filme8)

        val filme9 = Filme(R.drawable.filme9,"Adão Negro")
        listaFilmes.add(filme9)

        val filme10 = Filme(R.drawable.filme10,"Homem-Formiga Quantumania")
        listaFilmes.add(filme10)

        val filme11 = Filme(R.drawable.filme11,"Pânico VI")
        listaFilmes.add(filme11)

        val filme12 = Filme(R.drawable.filme12,"Sonic 2")
        listaFilmes.add(filme12)



    }

}