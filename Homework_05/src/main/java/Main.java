//1. Написать программу по возведению числа в степень с помощью рекурсии.
//2. Написать программу «Задача о рюкзаке» с помощью рекурсии.


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

//    public static int getFactorial(int f) { // вычисление факториала
//        if (f <= 1) {
//            return 1;
//        }
//        else {
//            return f * getFactorial(f - 1);
//        }
//    }
//
//
//
//    public static int getCombinationCount (int n){ // расчет количества возможных сочетаний (порядок элементов не учитывается)
//        int comb_count = 0;
//        for (int i = 1; i<=n; i++){
//            comb_count+=getFactorial(n)/(getFactorial(i)*getFactorial(n-i));
//        }
//        return comb_count;
//    }


//    static void showPermutations(ArrayList<Item> item) {
//        for (int i = 0; i < item.size(); i++) {
//            for (int j = 0; j < item.size() - 1; j++) {
//                System.out.println(item);
//                Item tmp = item.get(j);
//                item.set(j,item.get(j+1));
//                item.set(j+1,tmp);
//            }
//        }
//    }




    public static void main(String[] args) {
//        int n = 3;
//        ArrayList<ArrayList<Item>> allCombinations =new ArrayList<>(); // массив для хранения комбинаций
//
//        for(int i = 0; i < getCombinationCount(n); i++){
//            allCombinations.add(new ArrayList<Item>());
//        }


        Exponentiation ex = new Exponentiation();
        int result = ex.expNumber(2, 30);
        System.out.println(result);





        ArrayList<Item> totake = new ArrayList<>();
        Item item1 = new Item(1, 10);
        Item item2 = new Item(2, 25);
        Item item3 = new Item(3, 300);
        Item item4 = new Item(4, 43);
        Item item5 = new Item(5, 51);
        Item item6 = new Item(6, 60);
        totake.add(item1);
        totake.add(item2);
        totake.add(item3);
        totake.add(item4);
        totake.add(item5);
        totake.add(item6);


        KnapsackProblem knapsack  = new KnapsackProblem(11, totake);
        System.out.println(knapsack.maxCostInKnapsack());


//        showPermutations(totake);

//        for (int i = 0; i < 6; i++) {
//            System.out.println("Итерация " + i);
//            System.out.println(allCombinations);
//            allCombinations.get(i).add(totake.get(i));
//
//            System.out.println(allCombinations);
//            System.out.println(allCombinations.get(i).get(0).getWeigth());
//            System.out.println();
//            //combinations.clear();
//
//        }
//
////        for (int i = 0; i < 1; i++) {
////            System.out.println(allCombinations);
////        }


    }

}
