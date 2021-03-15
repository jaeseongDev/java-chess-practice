package chess.domain.piece;

public class PieceStatus {
    private final String position;
    private final Piece piece;

    public PieceStatus(String position, Piece piece) {
        this.position = position;
        this.piece = piece;
    }
}
