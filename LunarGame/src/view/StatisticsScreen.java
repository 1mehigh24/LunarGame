package view;

import javafx.scene.control.TableView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class StatisticsScreen extends VBox {
    private TableView<String> statsTable; // Just an example; you'd want to use a model class here, not a String.

    public Button backButton;

    public StatisticsScreen() {
        Label titleLabel = new Label("Game Statistics");

        statsTable = new TableView<>();
        // Optionally, if you want columns in your table, you'll define them here.
        // For now, we'll skip them for simplicity but it's essential for a real-world application.

        backButton = new Button("Back");

        this.getChildren().addAll(titleLabel, statsTable, backButton);

        // If you want to handle the back button press, you'd add an event handler here.
        // backButton.setOnAction(e -> handleBackButton());
    }

    // Optionally, the handler method for the backButton if needed.
    private void handleBackButton() {
        this.backButton = new Button("Back");
        // Logic for what happens when the back button is pressed.
    }

    // Additional methods to update the table based on new data, and other functionalities.
}
