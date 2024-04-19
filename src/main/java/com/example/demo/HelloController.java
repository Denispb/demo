package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.TextFlow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HelloController {
    @FXML
    TextField text2;
    @FXML
    TextField text1;
    @FXML
    TextField text3;
    @FXML
    Label label1;
    @FXML
    VBox boxForLabels;





    public static ArrayList<Pryamougolnik> readPryamougolnikFromFile(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        ArrayList<Pryamougolnik> pryamougolniks = new ArrayList<>();
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String p = scanner.nextLine();
            pryamougolniks.add(new Pryamougolnik(n, m, p));
        }
        scanner.close();
        return pryamougolniks;
    }

    public void plochadPryamougolnikov() throws FileNotFoundException {
      String u = text3.getText();
      String filename = u;
        //String filename = "triangle.txt";
        ArrayList<Pryamougolnik> pryamougolniks = readPryamougolnikFromFile(filename);
        text1.setText(String.valueOf(pryamougolniks));

            boxForLabels.getChildren().add(new Label("надпись"));




    }


}



