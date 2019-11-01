package net.stellarain.lessons.birdsimulator;

public class FancyDuck extends Duck
{
    public FancyDuck()
    {
        super(new BasicFly(), new FancyQuack());
    }
}
