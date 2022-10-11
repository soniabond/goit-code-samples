package module6.lesson1;

public class Player {
    private int hitPower = 10;
    private int hp = 100;

    public void damage(int hitPower) {
        if(hitPower < this.hp) {
            this.hp -= hitPower;
        } else {
            this.hp = 0;
        }
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public int getHitPower() {
        return hitPower;
    }

    public int getHp() {
        return hp;
    }
}
