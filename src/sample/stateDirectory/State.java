package sample.stateDirectory;

import sample.Controller;

public abstract class State {
    Mechanics mechanics;

    State(Mechanics mechanics){
       this.mechanics = mechanics;
    }

    public abstract String move();

}
