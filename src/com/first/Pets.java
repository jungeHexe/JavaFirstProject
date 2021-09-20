package com.first;

public class Pets {
    private String name;
    private int age = 3;
    private String color = "рыжий";
    Pets(String name, int n, String color){
        this.name = name;
        this.age = n;
        this.color = color;
    }

    public Pets(String name) {
        this.name = name;
    }

    public String getName(){
        return  this.name;
    }
    public int getAge(){
        return  this.age;
    }

    void getVoice(){
        System.out.println("I say 'i love you' ");
    }
}

class Cat extends Pets{

    Cat(String name){
        super(name);
    }

    @Override
    void getVoice(){
        System.out.println("Meow-meow");
    }
}

class Dog extends Pets{

    Dog(String name){
        super(name);
    }
     @Override
    void getVoice(){
         System.out.println("Woof-woof");
     }
}




