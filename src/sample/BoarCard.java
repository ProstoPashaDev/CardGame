package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BoarCard {
    int health = 1;
    int damage = 1;
    String discription = "Charge";
    public ArrayList<Node> createCardInDeck(double x, double y, ArrayList<Node> deck){
        ArrayList<Node> nodelist = new ArrayList<>();
        Button boar = new Button();
        boar.setVisible(false);
        boar.setPrefSize(150, 150);
        boar.setLayoutX(x/15);
        boar.setLayoutY(75);
        boar.setText("Boar");
        Button boar2 = new Button();
        boar2.setVisible(false);
        boar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                boar.setDisable(true);
                boar2.setVisible(true);
                boar2.setPrefSize(200, 50);
                boar2.setLayoutX(x-250);
                boar2.setLayoutY(275+(275*deck.size()));
                boar2.setText("Boar");
                deck.add(boar);
                boar2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        boar2.setVisible(false);
                        boar.setDisable(false);
                    }
                });
            }
        });
        nodelist.add(boar);
        nodelist.add(boar2);
        return nodelist;
    }
}
