package 자료구조와_함께_배우는_알고리즘_입문.chap04;

public class Q2_04<E> {

    private E[] stk;
    private int capacity;
    private int ptr;

    public static class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    public static class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    public Q2_04(int maxlen) {
        ptr = 0;
        capacity = maxlen;

        try{
            stk = (E[])new Object[capacity];
        }catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public E push(E e) throws OverflowIntStackException {
        if(ptr >= capacity) {
            throw  new OverflowIntStackException();
        }

        return stk[ptr++] = e;
    }

    public E pop() throws EmptyIntStackException {
        if(ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

    public E peek() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[ptr - 1];
    }

    public void claer() {
        ptr = 0;
    }

    public int indexOf(E e) {
        for(int i = ptr -1; i >= 0; i--) {
            if(stk[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr >= capacity;
    }

    public void dump() {
        if(ptr <= 0) {
            System.out.println("스택이 비어 있습니다.");
        }else {
            for(int i = 0; i < ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }

}
