//1. Создать и запустить программу для построения двоичного дерева.
// В цикле построить двадцать деревьев с глубиной в 6 уровней.
// Данные, которыми необходимо заполнить узлы деревьев, представляются в виде чисел типа int.
// Число, которое попадает в узел, должно генерироваться случайным образом в диапазоне от -100 до 100.

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();
        map.put(5, "five");
        map.put(3, "three");
        map.put(2, "nine");
        map.put(1, "four");
//        map.put(8, "seven");
//        map.put(7, "seven");
//        map.put(26, "seven");
//        map.put(76, "seven");
//        map.put(16, "seven");
//        map.put(36, "seven");
//        map.put(96, "seven");
//        map.put(46, "seven");
//        map.put(86, "seven");
//        map.put(15, "seven");
//        map.put(100, "seven");
        System.out.println(map);

//        map.delete(4);
//        System.out.println(map);

//        map.deleteMin();
//        System.out.println(map.minKey());
//        System.out.println(map.get(4));
        System.out.println(map.contains(1));
        System.out.println(map.height());
        //map.delete(9);
        // map.delete(5);
        //map.delete(7);
        //System.out.println(map);
        //System.out.println(map.height());
        System.out.println(map.isBalanced());
        System.out.println(map.height());
    }
}
