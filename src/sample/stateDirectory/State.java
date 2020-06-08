package sample.stateDirectory;

import sample.Controller;

public abstract class State {
    Mechanics mechanics;

    State(Mechanics mechanics){
       this.mechanics = mechanics;
    }

    public abstract String goForward();
    public abstract String goBackward();
    public abstract String goLeft();
    public abstract String goRight();
}
