package com.chaozhang.kotlinirapp;

import androidx.annotation.NonNull;

import java.util.function.Function;

public class Transformations {
    @NonNull
    public static <X, Y> LiveData<Y> map(
            @NonNull LiveData<X> source,
            @NonNull final Function<X, Y> mapFunction) {
        return new MutableLiveData<>(mapFunction.apply(source.getValue()));
    }
}
