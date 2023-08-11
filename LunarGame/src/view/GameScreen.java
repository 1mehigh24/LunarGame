package view;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;

//.

    public class GameScreen extends GridPane {
        // This is a 5x5 grid
        private ImageView[][] grid = new ImageView[5][5];
        private BorderPane view;
        private GridPane gameBoard;
        public GameScreen() {
            // Initialize grid and add ImageViews
            // ...
            view = new BorderPane();

            gameBoard = new GridPane();
            // TODO: Set up the game board. This will be more complex and requires understanding of the game logic.

            Button abandonButton = new Button("Abandon");
            Button restartButton = new Button("Restart");

            view.setCenter(gameBoard);
            view.setBottom(abandonButton);
        }

        // Additional methods, event handlers, etc.
        // ...
        public BorderPane getView() {
            return view;
        }
    }


