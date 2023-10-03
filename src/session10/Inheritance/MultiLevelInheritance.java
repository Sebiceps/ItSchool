package session10.Inheritance;

public class MultiLevelInheritance {
}

class Grandparent{
    void dance(){
        System.out.println("Grandpa sould not dance");
    }
}

class Parent extends Grandparent {
    @Override
    void dance() {
        System.out.println("Parent can dance");
    }
}

class Child extends Parent {
    @Override
    void dance() {
        System.out.println("Child can dance too");
    }
}