package com.example.assignment2_javafx;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainExcelApplication extends Application {
    // Entry point of the JavaFX application
    @Override
    public void start(Stage stage) throws IOException {
        //Load the FXML file for the main application window
        FXMLLoader fxmlLoader = new FXMLLoader(MainExcelApplication.class.getResource("excel-view.fxml"));

        // Create a scene from the loaded FXML file, set X and Y dimensions
        Scene scene = new Scene(fxmlLoader.load(), 400, 300);

        //Set the title of the main application window
        stage.setTitle("Excel Formulas Window");

        //Set the scene for the stage and make it visible
        stage.setScene(scene);
        stage.show();
    }

    //Main method to launch the JavaFX application
    public static void main(String[] args) {
        launch();
    }
}


