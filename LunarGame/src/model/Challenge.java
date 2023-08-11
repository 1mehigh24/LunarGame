package model;


import java.util.List;

    public class Challenge {
        private String level;
        private int number;
        private List<Piece> pieces;
        private boolean solved;

        public Challenge(String level, int number, List<Piece> pieces) {
            this.level = level;
            this.number = number;
            this.pieces = pieces;
            this.solved = false;
        }

        // Getter and Setter methods
        // ...

        public void loadChallenge() {
            // Load challenge based on level and number, positioning pieces accordingly
        }
    }


