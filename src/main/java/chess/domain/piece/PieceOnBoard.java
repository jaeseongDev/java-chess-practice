package chess.domain.piece;

public class PieceOnBoard {
    private final PiecePosition position;
    private final Piece piece;

    public PieceOnBoard(PiecePosition position, Piece piece) {
        this.position = position;
        this.piece = piece;
    }
}
