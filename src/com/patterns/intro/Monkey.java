package com.patterns.intro;

public class Monkey implements Living
{
    private String name;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    @Override
    public void setName(String newName)
    {
        name = newName;
    }
    
    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setWeight(int newWeight)
    {
        weight = newWeight;
    }
    
    @Override
    public int getWeight()
    {
        return weight;
    }

    @Override
    public void setFavFood(String newFavFood)
    {
        favFood = newFavFood;
    }
    
    @Override
    public String getFavFood()
    {
        return favFood;
    }

    @Override
    public void setSpeed(double newSpeed)
    {
        speed = newSpeed;
    }
    
    @Override
    public double getSpeed()
    {
        return speed;
    }

    @Override
    public void setSound(String newSound)
    {
        sound = newSound;
    }
    
    @Override
    public String getSound()
    {
        return sound;
    }
}
