import static java.lang.Math.abs;

public class Knight extends Piece {
    public Knight(String color) {
        super(color, PieceType.KNIGHT);
    }

    @Override
    public boolean isValidMove(Cell start, Cell end) {
        if (!start.isValidCell() || !end.isValidCell()) {
            return false;
        }
        return true;
    }
}
