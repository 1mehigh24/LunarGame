package com.example.lunarlanding;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.yourpackage.utils.DatabaseHelper;
import com.yourpackage.controllers.SelectionController;



import java.io.IOException;

public class HelloApplication extends Application {
   
    public static void main(String[] args) {
        launch();
    }
    package com.yourpackage;


    public class Main extends Application {

        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage primaryStage) {
            // Initialize your database. This should only be done once.
            DatabaseHelper.initializeDatabase();

            // Create the selection screen as the initial screen
            SelectionController selectionController = new SelectionController();
            Scene selectionScene = new Scene(selectionController.getView(), 800, 600);  // You can set your preferred width and height

            // Set the scene in the primary stage
            primaryStage.setTitle("Lunar Landing Game");
            primaryStage.setScene(selectionScene);
            primaryStage.show();
        }

        @Override
        public void stop() {
            // Here, you could close database connections or handle other cleanup as needed.
        }
    }

}