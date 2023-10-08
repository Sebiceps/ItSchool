package session11.homework.first_challange;

public abstract class Parent {
    abstract void message();
}

class child extends Parent {
@Override
    void message(){
    System.out.println("This is the first subclass");
}

}

class secondChild extends Parent{
    @Override
    void message(){
        System.out.println("This is the second subclass");
    }
}

