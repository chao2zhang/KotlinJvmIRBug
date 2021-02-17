package com.chaozhang.kotlinirapp

class Resource<out T>(@JvmField val data: T?) {

    companion object {

        @JvmStatic
        fun <T, R> map(input: Resource<T>?, outputData: R): Resource<R>? = if (input == null) {
            null
        } else {
            Resource(outputData)
        }
    }
}
