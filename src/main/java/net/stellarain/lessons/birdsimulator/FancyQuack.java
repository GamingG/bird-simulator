package net.stellarain.lessons.birdsimulator;

public class FancyQuack implements QuackBehavior
{
    @Override
    public void quack()
    {
        System.out.println("Gentlemanly Quack!");
    }
}
