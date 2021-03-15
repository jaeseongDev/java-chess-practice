package chess.domain;

public class ChessPieceWithColor {
    private final ChessPiece chessPiece;
    private final ChessPieceColor color;

    public ChessPieceWithColor(ChessPiece chessPiece, ChessPieceColor color) {
        this.chessPiece = chessPiece;
        this.color = color;
    }
}
