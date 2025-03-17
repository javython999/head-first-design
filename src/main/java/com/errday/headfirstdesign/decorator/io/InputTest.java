package com.errday.headfirstdesign.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) {
        int c;

        try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/main/resources/test.text")))) {

            while((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
