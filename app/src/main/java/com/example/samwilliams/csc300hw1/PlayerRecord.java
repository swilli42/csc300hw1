package com.example.samwilliams.csc300hw1;

public class PlayerRecord
{
    private String name;
    private int age;
    private int jersey_number;
    private int height_in_feet;
    private int height_in_inches;

    public PlayerRecord(String name, int age, int jersey_number, int height_in_feet, int height_in_inches)
    {
        this.name = name;
        this.age = age;
        this.jersey_number = jersey_number;
        this.height_in_feet = height_in_feet;
        this.height_in_inches = height_in_inches;
    }

    public void display()
    {
        System.out.println(this.name + " " + this.age + " " + this.jersey_number +
                " (" + this.height_in_feet + " " + this.height_in_inches + ") ");
    }
}
