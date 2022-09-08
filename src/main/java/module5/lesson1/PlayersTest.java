package module5.lesson1;

public class PlayersTest {


    public static void main(String[] args) {
        Player player = new Player();
        SuperPlayer superPlayer = new SuperPlayer();
        System.out.println("player.getHp() = " + player.getHp());
        System.out.println("superPlayer.getHp() = " + superPlayer.getHp());
        player.damage(superPlayer.getSuperHitPower());
        System.out.println("player.isAlive() = " + player.isAlive());
        System.out.println("superPlayer.isAlive() = " + superPlayer.isAlive());


        System.out.println("player.getHp() = " + player.getHp());
        System.out.println("superPlayer.getHp() = " + superPlayer.getHp());
        superPlayer.damage(player.getHitPower());
        System.out.println("player.isAlive() = " + player.isAlive());
        System.out.println("superPlayer.isAlive() = " + superPlayer.isAlive());

        System.out.println("player.getHp() = " + player.getHp());
        System.out.println("superPlayer.getHp() = " + superPlayer.getHp());
        player.damage(superPlayer.getSuperHitPower());
        System.out.println("player.isAlive() = " + player.isAlive());
        System.out.println("superPlayer.isAlive() = " + superPlayer.isAlive());
    }
}
