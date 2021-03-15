package chess.domain.piece;

public enum PieceType {
    ROOK("R", "r"),
    KING("K", "k"),
    QUEEN("Q", "q"),
    BISHOP("B", "b"),
    KNIGHT("N", "n"),
    PAWN("P", "p");

    private final String valueWhenBlack;
    private final String valueWhenWhite;

    PieceType(String valueWhenBlack, String valueWhenWhite) {
        this.valueWhenBlack = valueWhenBlack;
        this.valueWhenWhite = valueWhenWhite;
    }

    public String getValueWhenBlack() {
        return valueWhenBlack;
    }

    public String getValueWhenWhite() {
        return valueWhenWhite;
    }
}
