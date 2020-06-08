package sample.stateDirectory;

import sample.Controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ButtonA extends State {

    ButtonA(Mechanics mechanics) {
        super(mechanics);
    mechanics.setMove(false);
    }

    @Override
    public String move() {
        if(mechanics.isMoving()){
            mechanics.changeState();
            return "jade w lewo";

        }else {

            return "stoi w miejscu";
        }
    }


}
