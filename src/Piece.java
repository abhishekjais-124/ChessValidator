public abstract class Piece {
    protected String color;
    protected PieceType pieceType;
    private boolean isAlive;

    public Piece(String color, PieceType pieceType) {
        this.color = color;
        this.pieceType = pieceType;
        this.isAlive = true;
    }

    public abstract boolean isValidMove(Cell start, Cell end);

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
