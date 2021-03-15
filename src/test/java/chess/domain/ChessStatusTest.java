package chess.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class ChessStatusTest {
    @Test
    @DisplayName("체스판 위에 있는 체스말을 제대로 생성하는 지")
    public void init() {
        String position = "b2";
        boolean isBlack = true;
        ChessPiece chessPiece = ChessPiece.KING;
        assertThatCode(() -> {
            new ChessStatus(position, isBlack, chessPiece);
        }).doesNotThrowAnyException();
    }
}
