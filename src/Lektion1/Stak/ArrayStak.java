package Lektion1.Stak;

public class ArrayStak implements Stak {
    private String[] s;
    public ArrayStak() {
        s = new String[0];
    }

    public void push(String e) {
        String[] n = new String[s.length + 1];
        copy(s, n);
        n[s.length] = e;
        s = n;
    }

    public String pop() {
        String e = s[s.length - 1];
        String[] n = new String[s.length - 1];
        copy(s, n);
        s = n;
        return e;
    }

    private static void copy(String[] a, String[] b) {
        int size = Math.min(a.length, b.length);
        for (int i = 0; i < size; i++){
            b[i] = a[i];
        }
    }

    public boolean isEmpty() {
        return s.length == 0;
    }

    public boolean isFull() {
        return s.length == Integer.MAX_VALUE - 5;
    }

    public void show() {
        System.out.print("[ ");
        for (int i = s.length - 1; i > 0; i--) {
            System.out.print(s[i] + ", ");
        }
        if(s.length > 0) System.out.println(s[0]);
        System.out.println(" ]");
    }
}
