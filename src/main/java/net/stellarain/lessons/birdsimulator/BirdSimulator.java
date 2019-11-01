package net.stellarain.lessons.birdsimulator;

public class BirdSimulator
{
    public static void main(String args[])
    {
        Duck duck = new BasicDuck();
        duck.fly();
        duck.quack();

        Duck duck2 = new FancyDuck();
        duck2.fly();
        duck2.quack();
    }
}
