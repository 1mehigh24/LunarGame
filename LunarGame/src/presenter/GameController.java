package presenter;

import model.Piece;
import view.GameScreen;

public class GameController {
    private GameScreen gameScreen;

    public GameController(GameScreen screen) {
        this.gameScreen = screen;
    }

    public boolean checkMoveValidity(Piece piece, int newX, int newY) {
        // Check if a move is valid
        return true;
    }

    // Other methods...
}