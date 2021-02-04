package com.company;

import java.util.Random;

public class Random_one_pizza_factory implements Pizzafactory {
    @Override
    public Pizza creatPizza(String... type) {
        Random random=new Random();
        int ran=random.nextInt(2);
        Pizza pizza=null;
        if (ran==0)
            pizza=new Chess_pizza();
        else if (ran==1)
            pizza=new Pepperoni_pizza();

        return pizza;
    }
}
