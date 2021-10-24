package ru.koleson;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var store = new Store();
        store.fillList();
//        List<String> data = store.get();
//        for (String datum : data) {
//            System.out.println(datum);
//        }

        store.getByReact(System.out::println);

    }
}