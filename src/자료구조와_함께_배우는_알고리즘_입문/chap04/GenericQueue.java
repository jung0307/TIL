package 자료구조와_함께_배우는_알고리즘_입문.chap04;

public class GenericQueue<E> {

    private E[] que;
    private int capacity;
    private int num;
    private int front;
    private int rear;

    public GenericQueue(int max) {
        capacity = max;

        que = (E[]) new Object[capacity];
        front = rear = num = 0;
    }

    public static class OverflowGenericQueueException extends RuntimeException {
        OverflowGenericQueueException() {};
    }

    public static class EmptyGenericQueueException extends RuntimeException {
        EmptyGenericQueueException() {};
    }

    public E enque(E x) throws OverflowGenericQueueException {
        if(num >= capacity) {
            throw new OverflowGenericQueueException();
        }
        que[rear++] = x;
        num++;
        if(rear == capacity) {
            rear = 0;
        }
        return x;
    }

    public E deque() throws EmptyGenericQueueException {
        if(num <= 0) {
            throw new EmptyGenericQueueException();
        }
        E x = que[front++];
        num--;
        if(front == capacity) {
            front = 0;
        }
        return x;
    }

    public E peek() throws EmptyGenericQueueException {
        if(num <= 0) {
            throw new EmptyGenericQueueException();
        }

        return que[front];
    }

    public int indexOf(E x) {
        for(int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if(que[idx].equals(x)) {
                return idx;
            }
        }
        return -1;
    }

    public int search(E x) {
        for(int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if(que[idx].equals(x)) {
                return i + 1;
            }
        }
        return -1;
    }

    public int size() {
        return num;
    }

    public int getCapacity() {
        return capacity;
    }

    public void clear() {
        front = rear = num = 0;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= capacity;
    }

    public void dump() {
        if(num <= 0) {
            System.out.println("현재 큐가 비어있습니다.");
        }
        for(int i = 0; i < num; i++) {
            System.out.print(que[(i + front) % capacity].toString() + " ");
        }
        System.out.println();

    }
}
