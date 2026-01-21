

public class Meal<T extends MealPlan> {

    T meal;

    Meal(T meal) {
        this.meal = meal;
    }

    T getMeal() {
        return meal;
    }
}
