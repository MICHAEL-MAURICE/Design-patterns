package com.company;

public class Ducktoy extends Duck {
    Ducktoy(){
        super();
        this.myFlybehaviour=new Noflying();
    }


    @Override
    protected String display() {
        return "Iam Ducktoy";
    }
}
