import static java.lang.Math.abs;

public class Pawn extends Piece {
    public Pawn(String color, PieceType pieceType) {
        super(color, pieceType);
    }

    @Override
    public boolean isValidMove(Cell start, Cell end) {
        if (!start.isValidCell() || !end.isValidCell()) {
            return false;
        }
        if (end.getPiece() != null) {
            if (color.equals(Color.WHITE)) {
                if (end.Y - start.Y != 1 || abs(start.X - end.X) != 1) {
                    return false;
                }
            } else {
                if (end.Y - start.Y != -1 || abs(start.X - end.X) != 1) {
                    return false;
                }
            }
        } else {
            if (color.equals(Color.WHITE)) {
                if (end.Y - start.Y != 1 || abs(start.X - end.X) != 0) {
                    return false;
                }
            } else {
                if (end.Y - start.Y != -1 || abs(start.X - end.X) != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
