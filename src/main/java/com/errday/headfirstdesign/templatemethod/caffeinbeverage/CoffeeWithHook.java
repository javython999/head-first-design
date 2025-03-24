package com.errday.headfirstdesign.templatemethod.caffeinbeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("brew coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("add sugar and milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }

        return false;
    }

    private String getUserInput() {
        String answer = "no";
        System.out.println("if you want to add sugar and milk? (y/n)");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return answer;
    }
}
