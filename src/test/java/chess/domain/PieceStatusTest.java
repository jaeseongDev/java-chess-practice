package chess.domain;

import chess.domain.piece.Piece;
import chess.domain.piece.PieceColor;
import chess.domain.piece.PieceStatus;
import chess.domain.piece.PieceType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PieceStatusTest {
    @Test
    @DisplayName("체스판 위에 있는 체스말을 제대로 생성하는 지")
    public void init() {
        String position = "b2";
        Piece chessPiece = new Piece(PieceType.KING, PieceColor.BLACK);
        assertThatCode(() -> {
            new PieceStatus(position, chessPiece);
        }).doesNotThrowAnyException();
    }
}
