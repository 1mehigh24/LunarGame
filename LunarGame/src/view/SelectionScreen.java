package view;


import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

    public class SelectionScreen extends VBox {
        private ListView<String> challengesListView;
        public Button startButton;
        public Button statsButton;

        public SelectionScreen() {
            challengesListView = new ListView<>();
            startButton = new Button("Start");
            statsButton = new Button("Statistics");
            this.getChildren().addAll(challengesListView, startButton, statsButton);
        }
        // Getter methods for buttons to allow event handling from a controller
        public Button getStartButton() {
            return startButton;
        }

        public Button getStatsButton() {
            return statsButton;
        }
        // Additional methods, event handlers, etc.
        // ...
    }


