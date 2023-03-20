package org.example;

public class Main {
    public static void main(String[] args) {
        Birds bird1 = new Birds();
        bird1.fly();
        BaldEagle  eagle1 = new BaldEagle();
        eagle1.fly();
        eagle1.size(6.5);
        eagle1.size(3.0,8.0);
    }
}