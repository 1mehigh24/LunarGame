package models;


    public class Piece {
        public enum Type {
            SHUTTLE, BOT
        }

        private Type type;
        private String color;
        private int posX, posY;

        public Piece(Type type, String color) {
            this.type = type;
            this.color = color;
        }

        // Getter and Setter methods
        // ...

        public void move(int newX, int newY) {
            this.posX = newX;
            this.posY = newY;
        }
    }


