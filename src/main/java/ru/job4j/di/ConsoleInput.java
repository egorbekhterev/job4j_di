package ru.job4j.di;

import org.springframework.stereotype.Component;

import java.util.Scanner;

/**
 * @author: Egor Bekhterev
 * @date: 23.03.2023
 * @project: job4j_di
 */
@Component
public class ConsoleInput {

    private final Scanner scanner = new Scanner(System.in);

    public String askStr(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
}
