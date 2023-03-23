package ru.job4j.di;

/**
 * @author: Egor Bekhterev
 * @date: 23.03.2023
 * @project: job4j_di
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
        ui.askStr("2 + 2 = ?");
    }
}
