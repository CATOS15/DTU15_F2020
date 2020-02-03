package Lektion1.Stak;

import org.junit.jupiter.api.BeforeAll;

class StakTest {
    static Stak a = new LinkedStak();

    @BeforeAll
    static void init() {
        a.push("Dette");
        a.push("er");
        a.push("en");
        a.push("mærkelig");
        a.push("sætning.");
        a.show();
    }

    @org.junit.jupiter.api.Test
    void push() {
        a.push("YEAH!");
        a.show();
    }

    @org.junit.jupiter.api.Test
    void pop() {
        System.out.println(a.pop());
        a.show();
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        System.out.println(a.isEmpty());
        a.show();
    }

    @org.junit.jupiter.api.Test
    void isFull() {
        System.out.println(a.isFull());
        a.show();
    }

    @org.junit.jupiter.api.Test
    void show() {
        a.show();
    }
}