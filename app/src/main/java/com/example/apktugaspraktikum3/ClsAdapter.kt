package com.example.apktugaspraktikum3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ClsAdapter (private val Datadata: ArrayList<Datapeserta>, private val context: Context
): RecyclerView.Adapter<ClsAdapter.CourseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClsAdapter.CourseViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.activity_data,
            parent, false
        )
        return CourseViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ClsAdapter.CourseViewHolder, position: Int) {
        holder.nama.text = Datadata.get(position).Nama
        holder.nim.text = Datadata.get(position).Tipe
        holder.umur.text = Datadata.get(position).Level
        holder.foto.setImageResource(Datadata.get(position).foto)
    }
    override fun getItemCount(): Int {
        return Datadata.size
    }
    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto: ImageView = itemView.findViewById(R.id.idfoto)
        val nama: TextView = itemView.findViewById(R.id.idnama)
        val nim: TextView = itemView.findViewById(R.id.idnim)
        val umur: TextView = itemView.findViewById(R.id.idumur)
    }
}