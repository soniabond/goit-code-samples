package module8.gameApp;

import java.io.Serializable;

public class Duck implements Movable {
    @Override
    public void move() {
        System.out.println("Duck flies!");
    }
}
