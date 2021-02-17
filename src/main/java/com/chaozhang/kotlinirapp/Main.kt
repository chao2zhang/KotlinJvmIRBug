package com.chaozhang.kotlinirapp

fun main(args: Array<String>) {
    println(fetchCards())
}

private fun fetchCards(): LiveData<List<Card>> {
    val cards = MutableLiveData(Resource(JavaCollectionTemplate(listOf(Card()))))
    return Transformations.map(cards) { resource ->
        resource?.data?.elements
    }
}

class Resource<out T>(@JvmField val data: T?)

private class Card
