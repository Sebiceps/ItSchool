package session12.change_behavior_at_runtime;

public class Sword implements Weapon {

    @Override
    public void use() {
        System.out.println("Swinging the sword!");
    }
}