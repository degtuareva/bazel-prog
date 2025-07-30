package app.src.main.java.org.example.app;

import mylib.src.main.java.org.example.mylib.Util;

public class Main {
    public static void main(String[] args) {
        String text = "Hello, World!";

        String reversed1 = Util.customReverse(text);
        System.out.println("Reversed (Commons Lang): " + reversed1);

        String reversed2 = Util.customReverse(text);
        System.out.println("Reversed (Custom Util): " + reversed2);
    }
}
