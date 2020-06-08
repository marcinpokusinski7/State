package sample.stateDirectory;

import java.awt.*;

public class Mechanics {
    private State state;
    private boolean move = false;
    public Mechanics(){

        setMove(true);
    }
    public void changeState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public void setMove(boolean move){
        this.move = move;
    }

    public boolean isMoving(){
        return move;
    }




}
