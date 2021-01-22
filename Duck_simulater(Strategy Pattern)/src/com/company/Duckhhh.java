package com.company;

public class Duckhhh extends Duck {
   Duckhhh(){
super();
   }


    @Override
    protected String display() {
        return "Iam Duckhhh";
    }
    protected void gotshot(){
       this.myFlybehaviour=new Noflying();
    }
}
