package com.chaozhang.kotlinirapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MainActivity", fetchCards().toString())
    }

    private fun fetchCards(): LiveData<Resource<List<Card>?>> {
        val cards = MutableLiveData(Resource(JavaCollectionTemplate(listOf(Card()))))
        return Transformations.map(cards) { resource ->
            Resource.map(resource, resource?.data?.elements)
        }
    }
}

private class Card : JavaDataTemplate<Card>