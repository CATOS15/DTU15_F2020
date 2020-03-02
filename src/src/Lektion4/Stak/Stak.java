package Lektion4.Stak;

interface Stak<T> {
    void push(T e);
    T pop();
    boolean isEmpty();
    boolean isFull();
    void show();
}
