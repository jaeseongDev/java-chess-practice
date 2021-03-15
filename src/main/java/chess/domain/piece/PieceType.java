package chess.domain.piece;

import chess.domain.piece.moveStrategy.*;

public enum PieceType {
    ROOK("R", "r", new RookMoveStrategy()),
    KING("K", "k", new KingMoveStrategy()),
    QUEEN("Q", "q", new QueenMoveStrategy()),
    BISHOP("B", "b", new BishopMoveStrategy()),
    KNIGHT("N", "n", new KnightMoveStrategy()),
    PAWN("P", "p", new PawnMoveStrategy());

    private final String valueWhenBlack;
    private final String valueWhenWhite;
    private final MoveStrategy moveStrategy;

    PieceType(String valueWhenBlack, String valueWhenWhite, MoveStrategy moveStrategy) {
        this.valueWhenBlack = valueWhenBlack;
        this.valueWhenWhite = valueWhenWhite;
        this.moveStrategy = moveStrategy;
    }

    public String getValueWhenBlack() {
        return valueWhenBlack;
    }

    public String getValueWhenWhite() {
        return valueWhenWhite;
    }
}
