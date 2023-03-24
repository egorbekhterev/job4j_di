package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Egor Bekhterev
 * @date: 24.03.2023
 * @project: job4j_di
 */
public class SpringDI {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
        ui.askStr("2 + 2 = ?");

        /* Повторно получили bean, т.к. режим создания объектов prototype, создается новый объект при вызове
        * из контекста, поэтому print() выполняется для пустого объекта. */
        ui = context.getBean(StartUI.class);
        ui.print();
    }
}
