package org.yi;

import org.yi.dto.*;

public class Main {
    public static void main(String[] args) {
        RestaurantManagementSystem restaurantManagementSystem = new RestaurantManagementSystem();
        Dish fires = new Dish("French Fries", 2.99, FoodType.VEGE);
        Beverage coke = new Beverage("Coke", 1.99, false);
        Combo cokeAndFries = new Combo("Coke & Fries");
        cokeAndFries.addDish(fires);
        cokeAndFries.addBeverage(coke);

        restaurantManagementSystem.addCombo(cokeAndFries);

        System.out.println(restaurantManagementSystem);
    }
}