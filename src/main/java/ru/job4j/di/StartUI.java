package ru.job4j.di;

import org.springframework.stereotype.Component;

/**
 * @author: Egor Bekhterev
 * @date: 23.03.2023
 * @project: job4j_di
 */
@Component
public class StartUI {

    private final Store store;

    private final ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }

    public String askStr(String question) {
        return consoleInput.askStr(question);
    }
}
