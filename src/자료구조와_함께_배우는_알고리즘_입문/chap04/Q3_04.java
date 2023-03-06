package 자료구조와_함께_배우는_알고리즘_입문.chap04;

public class Q3_04 {

    private int[] stk;
    private int capacity;
    private int ptrL;
    private int ptrR;

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    public Q3_04(int maxlen) {
        ptrL = 0;
        ptrR = maxlen-1;
        capacity = maxlen;

        try{
            stk = new int[capacity];
        }catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int pushA(int x) throws OverflowIntStackException {
        if(ptrL >= capacity || ptrR < ptrL) {
            throw  new OverflowIntStackException();
        }

        return stk[ptrL++] = x;
    }

    public int pushB(int x) throws OverflowIntStackException {
        if(ptrR >= 0 || ptrL > ptrR) {
            throw  new OverflowIntStackException();
        }

        return stk[ptrR] = x;
    }

    public int popA() throws EmptyIntStackException {
        if(ptrL <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[--ptrL];
    }

    public int popB() throws EmptyIntStackException {
        if(ptrR >= capacity) {
            throw new EmptyIntStackException();
        }
        return stk[--ptrR];
    }

    public int peekA() throws EmptyIntStackException {
        if (ptrL <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[ptrL - 1];
    }

    public int peekB() throws EmptyIntStackException {
        if (ptrR >= capacity) {
            throw new EmptyIntStackException();
        }
        return stk[ptrR - 1];
    }

    public void claerA() {
        ptrL = 0;
    }

    public void claerB() {
        ptrR = capacity-1;
    }

    public int indexOfA(int x) {
        for(int i = ptrL -1; i >= 0; i--) {
            if(stk[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int indexOfB(int x) {
        for(int i = ptrR +1; i <= capacity-1; i++) {
            if(stk[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int sizeA() {
        return ptrL;
    }

    public int sizeB() {
        return ptrR;
    }

    public boolean isEmptyA() {
        return ptrL <= 0;
    }

    public boolean isEmptyB() {
        return ptrR >= capacity;
    }

    public boolean isFullA() {
        return ptrL >= capacity || ptrL > ptrR;
    }

    public boolean isFullB() {
        return ptrR <= 0 || ptrR < ptrL;
    }

    public void dumpA() {
        if(ptrL <= 0) {
            System.out.println("스택이 비어 있습니다.");
        }else {
            for(int i = 0; i < ptrL; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }

    public void dumpB() {
        if(ptrR <= 0) {
            System.out.println("스택이 비어 있습니다.");
        }else {
            for(int i = capacity-1; i > ptrR; i--) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }

}
