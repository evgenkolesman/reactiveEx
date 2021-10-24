package ru.koleson;

public interface Reactive<T> {
    void receive(T model);
}
