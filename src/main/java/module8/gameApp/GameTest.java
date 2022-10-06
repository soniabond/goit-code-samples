package module8.gameApp;

public class GameTest {
    public static void main(String[] args) {
        Movable duck = new Duck();
        Player player = new Player();
        MoveModule moveModule = new MoveModule();
        moveModule.moveCharacter(duck);
        moveModule.moveCharacter(player);


        FightModule fightModule = new FightModule();
        fightModule.fightCharacter(player);
    }
}
