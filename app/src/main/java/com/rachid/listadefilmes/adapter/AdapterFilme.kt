package com.rachid.listadefilmes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rachid.listadefilmes.databinding.FilmeItemBinding
import com.rachid.listadefilmes.model.Filme

class AdapterFilme(private val context: Context , private val listadeFilmes: MutableList<Filme>):
    RecyclerView.Adapter<AdapterFilme.FilmeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
       val itemLista = FilmeItemBinding.inflate(LayoutInflater.from(context),parent, false)
        return FilmeViewHolder(itemLista)
    }

    override fun getItemCount() = listadeFilmes.size

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        holder.capaFilme.setImageResource(listadeFilmes[position].capa!!)
        holder.tituloFilme.text = listadeFilmes[position].titulo
    }

    inner class FilmeViewHolder(binding: FilmeItemBinding): RecyclerView.ViewHolder(binding.root) {

       val capaFilme = binding.capaFilme
        val tituloFilme = binding.tituloFilme

    }
}