package com.company;

abstract class parent{
    public parent(){
        System.out.println("I am a constructor of base class");
    }

    public void sayHello(){
        System.out.println("Hello, how are you?");
    }

    abstract public void greet();
}

class child1 extends parent{
    @Override
    public void greet(){
        System.out.println("Good morning!");
    }
}

abstract class child3 extends parent{
}

public class Abstract {
}
