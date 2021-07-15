import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class KnapsackProblem {

    private int knapsackWeigth; // вес рюкзака
    private int n; // количество предметов в рюкзаке


    private ArrayList<Item> totake;

    public KnapsackProblem(int knapsackWeigth, ArrayList<Item> totake) { // конструктор с весом рюкзака
        this.knapsackWeigth = knapsackWeigth;
        this.totake = totake;
    }

    public int maxCostInKnapsack() {


        totake = usefullThings(totake); // удаляем все лишнее, получаем новый массив
        n = totake.size(); //получаем количество предметов в рюкзаке

        return bestCombination(n-1, knapsackWeigth);
    }


    private ArrayList<Item> usefullThings(ArrayList<Item> totake) {// проверяем, какие вещи нам подходят, все ненужное удаляем

        totake.removeIf(item -> !(item.getWeigth() <= knapsackWeigth && item.getWeigth() > 0 && item.getCost() > 0));
        return totake;
    }


private int bestCombination (int n,int knapsackWeigth) { //подаем на вход количество предметов
        if(n<0){ // если предметы закончились
            return 0;
        }
        if(totake.get(n).getWeigth()>knapsackWeigth){
            return bestCombination(n-1, knapsackWeigth);
        }

        else {
            return Math.max(bestCombination(n-1, knapsackWeigth), bestCombination(n-1, knapsackWeigth-totake.get(n).getWeigth())+totake.get(n).getCost());
        }
}

}