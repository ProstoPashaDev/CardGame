package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;
public class MainMenu {
    Button heroPavelBtn = new Button();
    Button heroPanBtn = new Button();
    Button heroHaleraBtn = new Button();
    Button heroArtemBtn = new Button();
    Label chooseHero = new Label();

    ArrayList<Node> createMainMenu(double x, double y){
        chooseHero = createChooseHeroTxt(x, y);
        ArrayList<Node> nodelist = createHeroPavelBtn(x, y);
        nodelist.addAll(createHeroHaleraBtn(x, y));
        nodelist.addAll(createHeroArtemBtn(x, y));
        nodelist.addAll(createHeroPanBtn(x, y));
        nodelist.addAll(createBtnMyCollection(x, y, createBtnPlay(x, y)));
        nodelist.add(chooseHero);
        return nodelist;
    }
    public Button createBtnPlay(double x, double y){
        Button playBtn = new Button();
        playBtn.setPrefSize(70, 50);
        playBtn.setLayoutX(x/2);
        playBtn.setLayoutY(y/2-130);
        playBtn.setText("Play");
        return playBtn;
    }
    public ArrayList<Node> createBtnMyCollection(double x, double y, Button playBtn){
        ArrayList<Node> nodelist = new ArrayList<>();
        Button myCollectionBtn = new Button();
        myCollectionBtn.setPrefSize(90, 50);
        myCollectionBtn.setLayoutX(x/2);
        myCollectionBtn.setLayoutY(y/2-65);
        myCollectionBtn.setText("My collection");

        myCollectionBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                playBtn.setVisible(false);
                myCollectionBtn.setVisible(false);
                chooseHero.setVisible(true);
                heroPavelBtn.setVisible(true);
                heroHaleraBtn.setVisible(true);
                heroArtemBtn.setVisible(true);
                heroPanBtn.setVisible(true);
            }
        });
        nodelist.add(playBtn);
        nodelist.add(myCollectionBtn);
        return nodelist;
    }
    public Label createChooseHeroTxt(double x, double y){
        chooseHero.setText("Choose hero");
        chooseHero.setLayoutX(x/2);
        chooseHero.setLayoutY(y/5);
        chooseHero.setVisible(false);
        return chooseHero;
    }
    public ArrayList<Node> createHeroPavelBtn(double x, double y){
        ArrayList<Node> nodelist = new ArrayList<>();
        heroPavelBtn.setVisible(false);
        heroPavelBtn.setPrefSize(250, 250);
        heroPavelBtn.setLayoutX(x/5);
        heroPavelBtn.setLayoutY(y/5+100);
        ArrayList<Node> cardlist = createNewDeck(x, y);
        heroPavelBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                heroHaleraBtn.setVisible(false);
                heroArtemBtn.setVisible(false);
                heroPanBtn.setVisible(false);
                chooseHero.setVisible(false);
                heroPavelBtn.setDisable(true);
                heroPavelBtn.setLayoutX(x-250);
                heroPavelBtn.setLayoutY(30);
                heroPavelBtn.setPrefSize(200, 200);
                cardlist.get(0).setVisible(true);
            }
        });
        nodelist.add(heroPavelBtn);
        nodelist.addAll(cardlist);
        return nodelist;
    }
    public ArrayList<Node> createHeroHaleraBtn(double x, double y){
        ArrayList<Node> nodelist = new ArrayList<>();
        heroHaleraBtn.setVisible(false);
        heroHaleraBtn.setPrefSize(250, 250);
        heroHaleraBtn.setLayoutX(x/5+350);
        heroHaleraBtn.setLayoutY(y/5+100);
        heroHaleraBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                heroPavelBtn.setVisible(false);
                heroArtemBtn.setVisible(false);
                heroPanBtn.setVisible(false);
                chooseHero.setVisible(false);
                heroHaleraBtn.setDisable(true);
                heroHaleraBtn.setLayoutX(x-250);
                heroHaleraBtn.setLayoutY(30);
                heroHaleraBtn.setPrefSize(200, 200);

            }
        });
        nodelist.add(heroHaleraBtn);
        return nodelist;
    }
    public ArrayList<Node> createHeroArtemBtn(double x, double y){
        ArrayList<Node> nodelist = new ArrayList<>();
        heroArtemBtn.setVisible(false);
        heroArtemBtn.setPrefSize(250, 250);
        heroArtemBtn.setLayoutX(x/5+700);
        heroArtemBtn.setLayoutY(y/5+100);
        heroArtemBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                heroPavelBtn.setVisible(false);
                heroHaleraBtn.setVisible(false);
                heroPanBtn.setVisible(false);
                chooseHero.setVisible(false);
                heroArtemBtn.setDisable(true);
                heroArtemBtn.setLayoutX(x-250);
                heroArtemBtn.setLayoutY(30);
                heroArtemBtn.setPrefSize(200, 200);

            }
        });
        nodelist.add(heroArtemBtn);
        return nodelist;
    }
    public ArrayList<Node> createHeroPanBtn(double x, double y){
        ArrayList<Node> nodelist = new ArrayList<>();
        heroPanBtn.setVisible(false);
        heroPanBtn.setPrefSize(250, 250);
        heroPanBtn.setLayoutX(x/5+1050);
        heroPanBtn.setLayoutY(y/5+100);
        heroPanBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                heroPavelBtn.setVisible(false);
                heroHaleraBtn.setVisible(false);
                heroArtemBtn.setVisible(false);
                chooseHero.setVisible(false);
                heroPanBtn.setDisable(true);
                heroPanBtn.setLayoutX(x-250);
                heroPanBtn.setLayoutY(30);
                heroPanBtn.setPrefSize(200, 200);

            }
        });
        nodelist.add(heroPanBtn);
        return nodelist;
    }
    public ArrayList<Node> createNewDeck(double x, double y){
        ArrayList<Node> nodelist = new ArrayList<>();
        BoarCard boarCard = new BoarCard();
        Button boar = boarCard.createCardInDeck(x, y);
        nodelist.add(boar);
        return nodelist;
    }
}
