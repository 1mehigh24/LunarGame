package views;


import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

    public class SelectionScreen extends VBox {
        private ListView<String> challengesListView;
        private Button startButton;
        private Button statsButton;

        public SelectionScreen() {
            challengesListView = new ListView<>();
            startButton = new Button("Start");
            statsButton = new Button("Statistics");
            this.getChildren().addAll(challengesListView, startButton, statsButton);
        }

        // Additional methods, event handlers, etc.
        // ...
    }


