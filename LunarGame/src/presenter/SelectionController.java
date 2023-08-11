package presenter;


import com.yourpackage.views.SelectionScreen;

public class SelectionController {
    private SelectionScreen selectionScreen;

    public SelectionController(SelectionScreen screen) {
        this.selectionScreen = screen;
    }

    public void loadGameScreen() {
        // Logic to switch to GameScreen
    }

    public void loadStatisticsScreen() {
        // Logic to switch to StatisticsScreen
    }
}
