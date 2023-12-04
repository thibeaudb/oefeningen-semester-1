public class Restaurant {
    public static void main(String[] args) {
        FoodItem spaghetti = new FoodItem();
        spaghetti.name = "spaghetti";
        spaghetti.time = 15;
        spaghetti.kindOfMeal = "hoofdgerecht";
        spaghetti.vegetarian = true;
        System.out.println("Naam van het gerecht: " + spaghetti.name);
        System.out.println("Tijd: " + spaghetti.time + "min");
        System.out.println("Type gerecht: " + spaghetti.kindOfMeal);
        if (spaghetti.vegetarian = true) {
            System.out.println("Ja");
        } else {
            System.out.println("Nee");
        }
    }
}
