package com.company;

import javax.swing.*;

public class Simple_pizza_factory implements Pizzafactory {
  public  Pizza creatPizza (String ... mytype){

        String type;
        if (mytype.length>1)
            type = mytype[0];
        else
            type="chess";

             Pizza pizza=null;
if(type.equals("chess"))
    pizza=new Chess_pizza();
else if(type.equals("pepperoni"))
    pizza=new Pepperoni_pizza();




        return pizza;


    }
}
