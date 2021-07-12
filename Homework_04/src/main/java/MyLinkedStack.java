public class MyLinkedStack<E> {
    private MyLinkedList<E> list = new MyLinkedList<>();


    public void push(E item) { // вставка элемента в стек
        list.insertLast(item);
    }

    public E pop() {
        return list.removeLast(); // удаление элемента из стека
    }

    public E peek() { // посмотерть элемент из стека
        return list.getLast();
    }


    public boolean isEmpty() { // проверка что пустой
        return list.isEmpty();
    }

    public int size() { // найти размер
        return list.size();
    }

    @Override
    public String toString() { // чтобы выводилось через sout
        return list.toString();
    }

}
