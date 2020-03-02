package Lektion4.Stak;

public class ArrayStak<T> implements Stak<T> {
    private T[] s;
    private T dummy;
    private int size;
    private int index = 0;
    public ArrayStak(int size) {
        //s = new T[n];
        this.size = size;
        s = (T[])java.lang.reflect.Array.newInstance(
                dummy.getClass().getComponentType(), size);
    }

    public void push(T e) {
        if(index < size)
            s[index++] = e;
    }

    public T pop() {
        if(index > 0) {
            T e = s[index--];
            return e;
        }
        return null;
    }

    public boolean isEmpty() {
        return s.length == 0;
    }

    public boolean isFull() {
        return index == size;
    }

    public void show() {
        System.out.print("[ ");
        for (int i = s.length - 1; i > 0; i--) {
            System.out.print(s[i].toString() + ", ");
        }
        if(s.length > 0) System.out.println(s[0].toString());
        System.out.println(" ]");
    }
}
