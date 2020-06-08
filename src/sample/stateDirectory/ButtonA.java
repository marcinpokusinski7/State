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
    public String goForward() {
        return null;
    }

    @Override
    public String goBackward() {
        return null;
    }

    @Override
    public String goLeft() {
        if(mechanics.isMoving()){

            return "jade w lewo";

        }else {
            mechanics.changeState(new ButtonD(mechanics));
            return "stoi w miejscu";
        }
    }

    @Override
    public String goRight() {
        return null;
    }



}
