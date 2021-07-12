package lesson3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyQueue<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;


    public MyQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyQueue() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insert(T item) {
        if (isFull()) {
            reCapacity();
       //     throw new RuntimeException("queue is full");
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public T remove() {
        T temp = peek();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return list[begin];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(list) + " b = " + begin + " e = " + end;
    }

    public void reCapacity() {
        int newCapacity = list.length + size / 2 + 1;
        T[] tempArr = (T[]) new Object[newCapacity];
        if (begin < end) {
            System.arraycopy(list, 0, tempArr, 0, size);
        } else {
            System.arraycopy(list, begin, tempArr, 0, size-begin);
            //System.arraycopy(list, 0, tempArr, size-begin-1, end+1);
        }
        list = tempArr;
        begin = 0;
        end = size;
    }


}
