import java.util.ArrayList;

public class KnapsackProblem {

    private int knapsackWeigth;

    private ArrayList<Item> combinations = new ArrayList<>();
    private ArrayList<Item> allCombinations = new ArrayList<>();

    public KnapsackProblem(int knapsackWeigth) {
        this.knapsackWeigth = knapsackWeigth;
    }

    public int maxCostInKnapsack(ArrayList<Item> totake) {

        if (totake.isEmpty()) {
            return 0;
        }

        totake = usefullThings(totake); // удаляем все лишнее


        for (Item item:totake) {

            combinations.add(item);
        }


        if (isPossibilityToPut(totake)) {

        }


        return 0;
    }


    private ArrayList<Item> usefullThings(ArrayList<Item> totake) {
        // проверяем, какие вещи нам подходят, все ненужное удаляем
        totake.removeIf(item -> !(item.getWeigth() <= knapsackWeigth && item.getWeigth() > 0 && item.getCost() > 0));
        return totake;
    }


    private createVariants (ArrayList <Item> totake){
        for (int i = 0; i<totake.size(); i++){
           new ArrayList<Item>().add(totake.get(i));
        }
        return createVariants ()
    }


}
