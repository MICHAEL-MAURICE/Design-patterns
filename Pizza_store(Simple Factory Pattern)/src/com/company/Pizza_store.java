package com.company;

public class Pizza_store {
    Pizzafactory factory;
    Pizza_store(Pizzafactory factory){
        this.factory=factory;
    }
    Pizza orderPizza(String ... type){
        Pizza pizza=factory.creatPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.ToString();


        return pizza;


    }



}
