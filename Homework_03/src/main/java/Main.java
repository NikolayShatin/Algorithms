//Домашнее задание
//1. Создать программу, которая переворачивает вводимые строки (читает справа налево).
//2. Создать класс для реализации дека.
//3. Реализовать расширение массива в стеке при заполнении стека.
//4 ***. Реализовать расширение массива в очереди при заполнении очереди.


package lesson3;

public class Main {
    public static void main(String[] args) {
        ReverseString test = new ReverseString("А КОБЫЛЕ ЦЕНА ДАНА, ДА НЕ ЦЕЛЫ БОКА"); // проверяем вывод в обратном порядке
        test.stringToStack();
        ReverseString test2 = new ReverseString("1234567890");
        test2.stringToStack();

        MyDeque<Integer> testDeque = new MyDeque<>(); // проверяем корректность добавления, отображения и удаления элементов
        testDeque.insertFirst(5);
        System.out.println(testDeque);
        testDeque.insertFirst(8);
        System.out.println(testDeque);
        testDeque.insertLast(3);
        System.out.println(testDeque);
        testDeque.insertLast(4);
        System.out.println(testDeque);
        System.out.println(testDeque.peekFirst());
        System.out.println(testDeque.peekLast());
        testDeque.removeFirst();
        System.out.println(testDeque);
        testDeque.removeLast();
        System.out.println(testDeque);


        MyQueue<Integer> test3 = new MyQueue<>(); // создадим очередь со стандартной емкостью 10
        for(int i = 0; i< 17; i++){
            test3.insert(i);
        }
        System.out.println(test3);


    }
}
