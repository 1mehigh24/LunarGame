package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import view.SelectionScreen;
import view.StatisticsScreen;

public class Game extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private StackPane root; // To switch between scenes easily
    private SelectionScreen selectionScreen;
    private StatisticsScreen statisticsScreen;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        root = new StackPane();
        Scene mainScene = new Scene(root, WIDTH, HEIGHT);

        selectionScreen = new SelectionScreen();
        statisticsScreen = new StatisticsScreen();

        // Set default screen to SelectionScreen
        root.getChildren().add(selectionScreen);

        // Button actions
        selectionScreen.startButton.setOnAction(e -> {
            // Logic to load and start the challenge
            // For instance:
            // Challenge challenge = ...; // Load challenge from ListView selection
            // challenge.loadChallenge();
            // Then maybe switch to a game screen
        });

        selectionScreen.statsButton.setOnAction(e -> {
            root.getChildren().remove(selectionScreen);
            root.getChildren().add(statisticsScreen);
        });

        statisticsScreen.backButton.setOnAction(e -> {
            root.getChildren().remove(statisticsScreen);
            root.getChildren().add(selectionScreen);
        });

        primaryStage.setTitle("Game Application");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
}
