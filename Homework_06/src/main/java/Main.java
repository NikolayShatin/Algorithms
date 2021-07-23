//1. Создать и запустить программу для построения двоичного дерева.
// В цикле построить двадцать деревьев с глубиной в 6 уровней.
// Данные, которыми необходимо заполнить узлы деревьев, представляются в виде чисел типа int.
// Число, которое попадает в узел, должно генерироваться случайным образом в диапазоне от -100 до 100.

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();
        map.put(5, "five");
        map.put(3, "three");
        map.put(9, "nine");
        map.put(4, "four");
        map.put(7, "seven");
        System.out.println(map);

//        map.delete(4);
//        System.out.println(map);

//        map.deleteMin();
//        System.out.println(map.minKey());
//        System.out.println(map.get(4));
        System.out.println(map.contains(10));
        System.out.println(map.height());
        map.delete(9);
        map.delete(5);
        map.delete(7);
        System.out.println(map);
        System.out.println(map.height());
    }
}
