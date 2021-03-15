package chess.domain;

public class ChessStatus {
    private final String position;
    private final boolean isBlack;
    private final ChessPiece chessPiece;

    public ChessStatus(String position, boolean isBlack, ChessPiece chessPiece) {
        this.position = position;
        this.isBlack = isBlack;
        this.chessPiece = chessPiece;
    }


}
