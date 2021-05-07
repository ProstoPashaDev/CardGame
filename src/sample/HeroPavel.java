package sample;

import javafx.scene.control.Button;

import java.util.ArrayList;

public class HeroPavel {

    public ArrayList createHeroPower(double x, double y){
        ArrayList info = new ArrayList();
        Button heroPower = new Button();
        heroPower.setVisible(false);
        heroPower.setPrefSize(60, 60);
        heroPower.setText("Hero power");
        heroPower.setLayoutX(0);
        heroPower.setLayoutY(0);
        // [Node, mana, ...]
        info.add(heroPower);
        info.add(2);
        return info;
    }

}
