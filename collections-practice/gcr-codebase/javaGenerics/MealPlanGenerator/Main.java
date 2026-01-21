

public class Main {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = new Meal<>(new HighProteinMeal());

        MealUtil.generateMeal(vegMeal.getMeal());
        MealUtil.generateMeal(veganMeal.getMeal());
        MealUtil.generateMeal(ketoMeal.getMeal());
        MealUtil.generateMeal(proteinMeal.getMeal());
    }
}
