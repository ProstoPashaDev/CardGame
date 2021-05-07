package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BoarCard {
    int health = 1;
    int damage = 1;
    String discription = "Charge";
    public Button createCardInDeck(double x, double y){
        Button boar = new Button();
        boar.setVisible(false);
        boar.setPrefSize(80, 80);
        boar.setLayoutX(0);
        boar.setLayoutY(0);
        boar.setText("Boar");
        boar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //boar.setDisable(true);
            }
        });
        return boar;
    }
}
