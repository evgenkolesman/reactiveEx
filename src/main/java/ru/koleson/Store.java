package ru.koleson;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Store {

    private List<String> data = new ArrayList<>();

    public void getByReact(Reactive<String> observe) throws InterruptedException {
        for (String datum : data) {
            Thread.sleep(10);
            observe.receive(datum);
        }
    }

    public List<String> get() throws InterruptedException {
        List<String> rsl = new ArrayList<>();
        for (String datum : data) {
            Thread.sleep(1000);
            rsl.add(datum);
        }
        return rsl;
    }

    public List<String> fillList() {
        IntStream.range(1, 10000).mapToObj(String :: valueOf).forEach(data :: add);
        return data;
    }
}
