package Arraylist;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public  static void main(String[] args) {
//       ArrayList<String> groceryList = new ArrayList<>();
//
//
//        ArrayList<String> bakeryList = new ArrayList<>();
//        bakeryList.add("garlic bread");
//        bakeryList.add("donuts");
//
//        ArrayList<String> produceList = new ArrayList<>();
//        produceList.add("tomatoes");
//        produceList.add("zucchini");
//        produceList.add("peppers");
//
//
//        ArrayList<String> drinksList = new ArrayList<>();
//        drinksList.add("soda");
//        drinksList.add("coffee");
//
//        groceryList.add(String.valueOf(bakeryList));
//        groceryList.add(String.valueOf(produceList));
//        groceryList.add(String.valueOf(drinksList));
//
//        System.out.println(groceryList.size());
       //
        // System.out.println(groceryList.get(2));

        //for (int i = 0; i<= groceryList.size()-1;i++){
          //  System.out.println(groceryList.get(i));


        ArrayList<String> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(String.valueOf(bakeryList));
        groceryList.add(String.valueOf(produceList));
        groceryList.add(String.valueOf(drinksList));

        // Access the first element in groceryList
        String firstElement = groceryList.get(0);

        // Convert the firstElement back to an ArrayList
        ArrayList<String> firstInnerList = convertStringToArrayList(firstElement);

        // Access a specific element in the inner list
        if (firstInnerList != null && !firstInnerList.isEmpty()) {
            String specificElement = firstInnerList.get(0);
            System.out.println("Specific element: " + specificElement);
        } else {
            System.out.println("Inner list is empty or null");
        }
    }

    // Helper method to convert a string to an ArrayList
    private static ArrayList<String> convertStringToArrayList(String str) {
        // Assuming the format is "[element1, element2, ...]"
        String[] elements = str.substring(1, str.length() - 1).split(", ");
        return new ArrayList<>(Arrays.asList(elements));
    }
}





