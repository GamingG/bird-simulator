package net.stellarain.lessons.birdsimulator;

public class BasicQuack implements QuackBehavior
{
    @Override
    public void quack()
    {
        System.out.println("Quack!");
    }
}
