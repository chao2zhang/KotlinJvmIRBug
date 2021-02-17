package com.chaozhang.kotlinirapp;

import androidx.annotation.Nullable;

public abstract class LiveData<T> {

    private volatile Object mData;

    public LiveData(T value) {
        mData = value;
    }

    @Nullable
    public T getValue() {
        return (T) mData;
    }
}
