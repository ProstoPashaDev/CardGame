package sample;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane pane = new Pane();
        primaryStage.setTitle("Card game");
        MainMenu mainMenu = new MainMenu();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        ArrayList<Node> nodeList = mainMenu.createMainMenu(screenSize.getWidth(), screenSize.getHeight());
        for (int i=0; i<nodeList.size(); i++){
            pane.getChildren().add(nodeList.get(i));
        }
        primaryStage.setScene(new Scene(pane, screenSize.getWidth(), screenSize.getHeight()-55));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
