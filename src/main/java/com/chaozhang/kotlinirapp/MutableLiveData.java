package com.chaozhang.kotlinirapp;

public class MutableLiveData<T> extends LiveData<T> {

    public MutableLiveData(T value) {
        super(value);
    }
}

