package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


import java.util.*;

public class Controller {

    @FXML
    public Stage stage;


    public Button characterReverseButton;
    public Button upperCaseButton;
    public Button lowerCaseButton;
    public Button spotButton;
    public Button repeatButton;
    public Button devowelizeButton;
    public Button asciifyButton;
    public Button tokenReverseButton;
    public Button sortAtoZButton;
    public Button sortZtoAButton;
    public Button encolourAButton;
    public Button encolourBButton;
    public Button invisibleButton;
    public Button visibleButton;
    public Button shrinkButton;
    public Button replacerandomlyButton;
    public Button defaultplacesButton;
    public Button fullScreenButton;
    public Button minimizeButton;
    public Button quitButton;
    public Pane pane;


    @FXML
    TextField textFieldA;
    @FXML
    TextField textFieldB;

    public void characterReverseButton() {
        textFieldB.setText(new StringBuilder(textFieldA.getText()).reverse().toString());
    }

    public void upperCaseButton() {
        textFieldB.setText(textFieldA.getText().toUpperCase());
    }

    public void lowerCaseButton() {
        textFieldB.setText(textFieldA.getText().toLowerCase());
    }

    public void spotButton() {
        StringBuilder sb = new StringBuilder();
        String sep = "";
        for (char c : textFieldA.getText().toCharArray()) {
            sb.append(sep).append(c);
            sep = ".";
        }
        textFieldB.setText(String.valueOf(sb));
    }

    public void repeatButton() {
        String repeated = new String(new char[2]).replace("\0", textFieldA.getText());
        textFieldB.setText(repeated);
    }

    public void devowelizeButton() {
        textFieldB.setText(textFieldA.getText().replaceAll("[AEIOUaeiou]", ""));
    }

    public void asciifyButton() {
        String word = textFieldA.getText();
        word = word.replaceAll("�", "C");
        word = word.replaceAll("�", "c");
        word = word.replaceAll("�", "G");
        word = word.replaceAll("�", "g");
        word = word.replaceAll("�", "O");
        word = word.replaceAll("�", "o");
        word = word.replaceAll("�", "S");
        word = word.replaceAll("�", "s");
        word = word.replaceAll("�", "U");
        word = word.replaceAll("�", "u");
        word = word.replaceAll("�", "I");
        word = word.replaceAll("�", "i");

        textFieldB.setText(word);
    }

    public void tokenReverseButton() {
        String[] split = textFieldA.getText().split(" ");
        String result = "";
        for (int i = split.length - 1; i >= 0; i--) {
            result += (split[i] + " ");
        }
        textFieldB.setText(result);
    }

    public void sortAtoZButton() {

        char[] chars = textFieldA.getText().toLowerCase().toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        textFieldB.setText(sorted);

    }

    public void sortZtoAButton() {
        char[] chars = textFieldA.getText().toLowerCase().toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        textFieldB.setText(sorted);
        textFieldB.setText(new StringBuilder(textFieldB.getText()).reverse().toString());


    }


    public void encolourAButton() {
        Random random = new Random();
        int i = random.nextInt(5);
        String[] colors = new String[5];
        colors[0] = "#FFFFFF";
        colors[1] = "#DC143C";
        colors[2] = "#00FFFF";
        colors[3] = "#00008B";
        colors[4] = "#7FFF00";
        textFieldA.setStyle("-fx-background-color:" + colors[i] + " ;");
    }

    public void encolourBButton() {
        textFieldB.setBackground(textFieldA.getBackground());
    }

    public void invisibleButton() {
        textFieldA.setVisible(false);
        textFieldB.setVisible(false);
    }

    public void visibleButton() {
        textFieldA.setVisible(true);
        textFieldB.setVisible(true);
    }

    public void shrinkButton() {

        textFieldA.setPrefWidth(textFieldA.getText().length() * 9);
        textFieldB.setPrefWidth(textFieldB.getText().length() * 9);
    }

    public void replacerandomlyButton() {
    	
    	

    }

    public void defaultplacesButton() {

    }

    public void fullScreenButton() {
        stage = (Stage) fullScreenButton.getScene().getWindow();
        stage.setMaximized(true);
    }


    public void minimizeButton() {
        stage = (Stage) minimizeButton.getScene().getWindow();
        stage.setMaximized(false);
    }

    public void quitButton() {
        System.exit(0);
    }


}