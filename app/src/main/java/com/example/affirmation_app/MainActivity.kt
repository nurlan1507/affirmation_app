package com.example.affirmation_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmation_app.adapter.ItemAdapter
import com.example.affirmation_app.data.Datasource
import com.example.affirmation_app.databinding.ActivityMainBinding
import com.example.affirmation_app.model.Affirmation

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dataset:List<Affirmation> = Datasource().loadAffirmations()
        val recyclerView:RecyclerView = binding.recyclerView
        recyclerView.adapter = ItemAdapter(this,dataset)
        recyclerView.setHasFixedSize(true)
    }
}