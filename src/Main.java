import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> shopping = new ArrayList();

        ArrayList<String> groceries = new ArrayList();

        groceries.add("tomatoes");
        groceries.add("Onions");
        groceries.add("Garlic");

        ArrayList<String> food = new ArrayList();

        food.add("Dengu");
        food.add("Bread");
        food.add("Flour");

        ArrayList<String> drinks = new ArrayList();

        drinks.add("Soda");
        drinks.add("Beer");
        drinks.add("Milk");

        shopping.add(groceries);
        shopping.add(food);
        shopping.add(drinks);

        System.out.println(shopping.get(1).get(2));
    }
}