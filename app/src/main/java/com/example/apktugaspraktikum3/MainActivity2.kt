package com.example.apktugaspraktikum3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: ClsAdapter
    lateinit var listData: ArrayList<Datapeserta>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(intent)

            finish()
        }


        recycle = findViewById(R.id.idrecycle)
        listData = ArrayList()

        val layoutManager = GridLayoutManager(this, 1)
        recycle.layoutManager = layoutManager
        recycleAdapter = ClsAdapter(listData, this)

        recycle.adapter = recycleAdapter
        listData.add(Datapeserta("Alucard", "AssasinFighter", "Universal", R.drawable.a2))
        listData.add(Datapeserta("Fanny", "Assasin", "Pysichal", R.drawable.f1))
        listData.add(Datapeserta("Gusion", "AssasinMage", "Universal", R.drawable.g1))
        listData.add(Datapeserta("Hayabusa", "Assasin", "Pysichal", R.drawable.h1))
        listData.add(Datapeserta("Moskov", "Marksman", "Pysichal", R.drawable.m2))
        listData.add(Datapeserta("Zilong", "AssasinFighter", "Universal", R.drawable.z1))
        listData.add(Datapeserta("Aldous", "Fighter", "Universal", R.drawable.a1))
        listData.add(Datapeserta("Dyroth", "Fighter", "Pysichal", R.drawable.d1))
        listData.add(Datapeserta("Link", "Assasin", "Universal", R.drawable.l1))
        listData.add(Datapeserta("Lylia", "Mage", "Magic", R.drawable.l2))


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_activity, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val layoutManager1 = GridLayoutManager(this, 2)
        val layoutManager2 = GridLayoutManager(this, 1)
        when (item.itemId){
            R.id.tbgrid -> recycle.layoutManager = layoutManager1
            R.id.tblist -> recycle.layoutManager = layoutManager2
            R.id.tbclose -> finish()
        }
        return true
    }
}