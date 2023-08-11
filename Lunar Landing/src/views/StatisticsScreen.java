package views;


import javafx.scene.control.TableView;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class StatisticsScreen extends VBox {
    private TableView<String> statsTable;
    private Button backButton;

    public StatisticsScreen() {
        statsTable = new TableView<>();
        backButton = new Button("Back");
        this.getChildren().addAll(statsTable, backButton);
    }

    // Additional methods, event handlers, etc.
    // ...
}

