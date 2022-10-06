package module8.gameApp;

public class Player implements Movable, Fightable {
    @Override
    public void move() {
        System.out.println("Player walks!");
    }

    @Override
    public void fight() {
        System.out.println("Player fights!");
    }
}
