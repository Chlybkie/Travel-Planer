package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Załaduj FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/main.fxml"));
        AnchorPane root = fxmlLoader.load();

        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Travel Planner");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}