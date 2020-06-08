package sample.stateDirectory;

import javafx.scene.control.Button;
import sample.Controller;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ButtonD extends State{

    ButtonD(Mechanics mechanics) {
        super(mechanics);
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
        return null;
    }

    @Override
    public String goRight() {
        return null;
    }



}
