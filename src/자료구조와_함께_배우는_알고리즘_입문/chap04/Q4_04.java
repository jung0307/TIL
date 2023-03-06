package 자료구조와_함께_배우는_알고리즘_입문.chap04;

public class Q4_04 {

    private int[] que;
    private int capacity;
    private int num;
    private int ptr;

    public class EmptyIntArrayException extends RuntimeException {
        public EmptyIntArrayException() {}
    }

    public class OverflowIntArrayException extends RuntimeException {
        public OverflowIntArrayException() {}
    }

    public Q4_04(int maxlen) {
        capacity = maxlen;
        ptr = 0;

        try{
            que = new int[capacity];
        }catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int enQueue(int x) throws OverflowIntArrayException {
        if(ptr >= capacity) {
            throw  new OverflowIntArrayException();
        }

        return que[ptr++] = x;
    }

    public int deQueue() throws EmptyIntArrayException {
        if(ptr <= 0) {
            throw new EmptyIntArrayException();
        }
        int temp = que[0];
        ptr--;

        for(int i = 0; i < ptr; i++) {
            que[i] = que[i+1];
        }

        return temp;
    }

    public int peek() throws EmptyIntArrayException {
        if (ptr <= 0) {
            throw new EmptyIntArrayException();
        }
        return que[ptr - 1];
    }

    public void claer() {
        ptr = 0;
    }

    public int indexOf(int x) {
        for(int i = 0; i < ptr; i++) {
            if(que[i] == x) {
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
            System.out.println("큐가 비어 있습니다.");
        }else {
            for(int i = 0; i < ptr; i++) {
                System.out.print(que[i] + " ");
            }
            System.out.println();
        }
    }

}
