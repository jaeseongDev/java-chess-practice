package chess.domain;

public enum ChessPiece {
    ROOK("R"),
    KING("K"),
    QUEEN("Q"),
    BISHOP("B"),
    KNIGHT("N"),
    PAWN("P");

    private final String value;

    ChessPiece(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
