package com.chaozhang.kotlinirapp;

import androidx.annotation.Nullable;

import java.util.List;

public class JavaCollectionTemplate<E extends JavaDataTemplate<E>> {

    @Nullable
    public final List<E> elements;

    public JavaCollectionTemplate(@Nullable List<E> elements) {
        this.elements = elements;
    }
}
