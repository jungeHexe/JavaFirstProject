package com.first;

public class Main {

    public static void main(String[] args) {
         Pets myPet = new Pets("Барсик", 3, "рыжий");
         myPet.getVoice();

         Cat myCat = new Cat("Барсик");
         System.out.println(myCat.getAge());
         myCat.getVoice();

         Dog myDog = new Dog("Шарик");
         System.out.println(myDog.getName());

         System.out.printf("%s (%s) \n", "я","мы"); /*позволяет форматировать вывод, первое - это шаблон для вывода*/
    }
}
