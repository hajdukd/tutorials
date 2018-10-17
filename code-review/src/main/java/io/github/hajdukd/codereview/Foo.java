package io.github.hajdukd.codereview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Foo {

    private List<Long> numbers;

    public void add(long i) {

        if (numbers == null)
            numbers = new ArrayList<>();
    }

    public void remove(int i) {

        if (numbers != null)
            numbers.remove(i);
    }

    public long sum() {

        return numbers == null ? 0 :
                numbers.stream().collect(Collectors.summarizingLong(Long::longValue)).getSum();
    }
}
