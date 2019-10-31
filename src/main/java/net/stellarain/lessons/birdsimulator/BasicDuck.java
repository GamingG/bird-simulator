package net.stellarain.lessons.birdsimulator;

public class BasicDuck extends Duck
{
    public BasicDuck()
    {
        super(new BasicFly(), new BasicQuack());
    }
}
