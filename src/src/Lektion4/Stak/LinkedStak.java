package Lektion4.Stak;

public class LinkedStak<T> implements Stak<T> {
    private class Element<T> {
        Element(T s) {data = s;}
        Element next, previous;
        T data;
    }
    private Element<T> begin, end;

    public LinkedStak() {
        begin = null;
        end = null;
    }

    public void push(T e) {
        Element<T> el = new Element<T>(e);
        if(begin == null) {
            begin = end = el;
            el.next = null;
            el.previous = null;
        } else {
            end.next = el;
            el.previous = end;
            el.next = null;
            end = el;
        }
    }

    public T pop() {
        T result = end != null ? end.data : null;
        if(end != null) {
            if(end.previous == null) {
                begin = null;
            } else {
                end.previous.next = null;
            }
            end = end.previous;
        }
        return result;
    }

    public boolean isEmpty() {
        return begin == null;
    }

    public boolean isFull() {
        return false;
    }

    public void show() {
        System.out.print("[ ");
        Element<T> e = end;
        while(e != null) {
            System.out.print(e.data.toString()) ;
            if(e.previous != null) System.out.println(", ");
            e = e.previous;
        }
        System.out.println(" ]");
    }
}
