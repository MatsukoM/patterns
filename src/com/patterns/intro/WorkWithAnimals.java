package com.patterns.intro;

public class WorkWithAnimals
{
    static int justANum = 10;
    
    public static void main(String[] args)
    {
        Dog fido = new Dog();
        fido.setName("fido");
        System.out.println(fido.getName());
        fido.digHole();

        ChangeObjectName(fido);
        System.out.println(fido.getName());

        Animal doggy = new Dog();
        Animal kitty = new Cat();

        System.out.println("Doggy says: " + doggy.getSound());
        System.out.println("Kitty says: " + kitty.getSound());

        Animal[] animals = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;
        animals[2] = new Dog();
        animals[3] = new Cat();

        for (int i = 0; i < animals.length; i++)
        {
            System.out.println(animals[i].getSound());
        }

        speakAnimal(doggy);

        ((Dog)doggy).digHole();

        Giraffe giraffe = new Giraffe();
        giraffe.setName("Frank");
        System.out.println(giraffe.getName());

        Living monkey = new Monkey();
        monkey.setName("John");
        System.out.println(monkey.getName());
    }

    public static void ChangeObjectName(Dog dog)
    {
        dog.setName("Marcus");
    }

    public static void speakAnimal(Animal randAnimal)
    {
        System.out.println("Animal says: " + randAnimal.getSound());
    }
}
