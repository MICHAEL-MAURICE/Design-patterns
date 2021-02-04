package com.company;

public class Customer_simulater {


    public static void main(String[] args) {
	// write your code here
        Pizzafactory factory=new Random_one_pizza_factory();
        Pizza_store pizza=new Pizza_store(factory);
        pizza.orderPizza();
        System.out.println(pizza);
    }
}
