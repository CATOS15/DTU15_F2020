package Lektion1.Stak;

public class LinkedStak implements Stak {
    private class Element {
        Element(String s) {data = s;}
        Element next, previous;
        String data;
    }
    private Element begin, end;

    public LinkedStak() {
        begin = null;
        end = null;
    }

    public void push(String e) {
        Element el = new Element(e);
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

    public String pop() {
        String result = end != null ? end.data : "";
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
        Element e = end;
        while(e != null) {
            System.out.print(e.data) ;
            if(e.previous != null) System.out.println(", ");
            e = e.previous;
        }
        System.out.println(" ]");
    }

}
