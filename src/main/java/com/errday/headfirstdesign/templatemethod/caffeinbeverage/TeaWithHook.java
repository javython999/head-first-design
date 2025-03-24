package com.errday.headfirstdesign.templatemethod.caffeinbeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("tea brew");
    }

    @Override
    void addCondiments() {
        System.out.println("add lemon");
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

        System.out.println("if you want to add lemon? (y/n)");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return answer;
    }
}
