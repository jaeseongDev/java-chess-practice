package chess.domain.piece;

public class PieceStatus {
    private final PiecePosition position;
    private final Piece piece;

    public PieceStatus(PiecePosition position, Piece piece) {
        this.position = position;
        this.piece = piece;
    }
}
