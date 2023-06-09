package ru.job4j.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Egor Bekhterev
 * @date: 23.03.2023
 * @project: job4j_di
 */
@Component
@Scope("prototype")
public class Store {

    private final List<String> data = new ArrayList<>();

    public void add(String value) {
        data.add(value);
    }

    public List<String> getAll() {
        return data;
    }
}
