package com.company;

public abstract class Duck {
    private int id;
    private String name;
    private static int count=0;
    protected Flybehaviour myFlybehaviour;
    Duck(){
       this.id=count++;
       this.name=" Duck"+'-'+this.id;
       this.myFlybehaviour= new Flywithwings();
    }

    public String swim(){
        return "Hey iam swiming !!";
    }
    protected abstract String display();
    public void perform(){
        System.out.println("Hello Iam"+this.name);
        System.out.println(this.display());
        System.out.println(this.swim());
        System.out.println(this.myFlybehaviour.Fly());
    }
}
