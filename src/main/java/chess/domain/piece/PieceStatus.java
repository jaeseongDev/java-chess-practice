package chess.domain.piece;

public class PieceStatus {
    private final String position;
    private final Piece chessPiece;

    public PieceStatus(String position, Piece chessPiece) {
        this.position = position;
        this.chessPiece = chessPiece;
    }
}
