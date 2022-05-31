/*
 * Solid principles
 * Solid is an acronym for the first five Object Oriented design (OOD)
 * S -
 * O -
 * L -
 * I - Interface Segregation Principle - a client should never be forced to implement an interface that it does not use
 * D -
 */

package nonViolations;

interface VegRestaurant {
    void vegMeals();
}

interface NonVegRestaurant {
    void nonVegMeals();
}

class ABCVegRestaurant implements VegRestaurant {
    @Override
    public void vegMeals() {
        System.out.println("Veg Meals");
    }
}

class ABCNonVegRestaurant implements VegRestaurant, NonVegRestaurant {
    @Override
    public void vegMeals() {
        System.out.println("Veg Meals");
    }

    @Override
    public void nonVegMeals() {
        System.out.println("Non Veg Meals");
    }
}

public class SolidI {
    public static void main(String[] args) {

    }
}
