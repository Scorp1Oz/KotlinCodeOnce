package com.example.registration

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()

        items.add(Item(1, "sofa","Диван","Ну диван и диван", "Что тут еще сказать?", 100))
        items.add(Item(2, "light","Спальня","СПАТЬ!!!", "Что тут еще сказать?", 299))
        items.add(Item(3, "kitchen","Кухня","Любимое место в доме", "Что тут еще сказать?", 312))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
        }


    }