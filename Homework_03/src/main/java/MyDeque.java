package lesson3;

import java.util.Arrays;

public class MyDeque<T> {

    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    public MyDeque(int capacity) { // конструктор с заданием начальной емкости
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() { // конструктор без

        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insertLast(T item) { // добавление в конец
        if (isFull()) {
            throw new RuntimeException("deque is full");
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertFirst(T item) { // добавление в начало
        if (isFull()) {
            throw new RuntimeException("deque is full");
        }
        size++;
        begin = prevIndex(begin);
        list[begin] = item;
    }

    public T removeLast() { // удаляем последний элемент
        T temp = peekLast();
        size--;
        list[prevIndex(end)] = null;
        end = prevIndex(end);
        return temp;
    }

    public T removeFirst() { // удаляем первый элемент
        T temp = peekFirst();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T peekFirst() {// показать первый элемент
        if (isEmpty()) {
            throw new RuntimeException("deque is empty");
        }
        return list[begin];
    }

    public T peekLast() {// показать последний элемент
        if (isEmpty()) {
            throw new RuntimeException("deque is empty");
        }
        return list[prevIndex(end)];
    }



    private int nextIndex(int index) {
        return (index + 1) % list.length;
    } // следующий индекс

    private int prevIndex(int index) {return (list.length + index - 1) % list.length; } // прндыдущий индекс

    public boolean isFull() {
        return size == list.length;
    } // проверка заполнен массив или нет

    public boolean isEmpty() {
        return size == 0;
    } // проверка пустой массив или нет

    public int size() {
        return size;
    } // геттер на количество заполненных ячеек массива

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (int i = begin; i !=end; i = nextIndex(i)){
            temp.append(list[i]).append(", ");
        }
        if (temp.length() == 0) {
            temp.append("[]");
        } else{
            temp.insert(0, "[");
            temp.setLength(temp.length()-2);
            temp.append("]");
        }
        return temp.toString();
    }

}


// 0 1 2 3 4
//       b
//     e
// 5 4   2 3