package net.stellarain.lessons.birdsimulator;

public abstract class Duck
{
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    
    Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior)
    {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    
    public void fly()
    {
        flyBehavior.fly();
    }
    
    public void quack()
    {
        quackBehavior.quack();
    }
}
