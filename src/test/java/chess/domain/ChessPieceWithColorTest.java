package chess.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class ChessPieceWithColorTest {
    @Test
    @DisplayName("색깔을 가진 체스말을 제대로 생성하는 지")
    public void init() {
        ChessPieceColor color = ChessPieceColor.BLACK;
        ChessPiece chessPiece = ChessPiece.KING;
        assertThatCode(() -> {
            new ChessPieceWithColor(chessPiece, color);
        }).doesNotThrowAnyException();
    }
}
