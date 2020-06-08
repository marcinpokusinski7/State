package sample;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import sample.stateDirectory.Mechanics;

public class Controller {
    private Mechanics mechanics;

    @FXML
    public Button btnw, btna, btns, btnd;
    @FXML
    public Label output;

   public void initialize(){
        btna.setOnAction(actionEvent -> {
            output.setText(mechanics.getState().goLeft());
        });
       btnw.setOnAction(actionEvent -> {
           output.setText(mechanics.getState().goLeft());
       });
       btns.setOnAction(actionEvent -> {
           output.setText(mechanics.getState().goLeft());
       });
       btnd.setOnAction(actionEvent -> {
           output.setText(mechanics.getState().goLeft());
       });






    }





}
