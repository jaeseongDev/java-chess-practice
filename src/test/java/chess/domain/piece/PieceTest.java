package chess.domain.piece;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PieceTest {
    @Test
    @DisplayName("색깔을 가진 체스말을 제대로 생성하는 지")
    public void init() {
        PieceColor color = PieceColor.BLACK;
        PieceType type = PieceType.KING;
        assertThatCode(() -> {
            new Piece(type, color);
        }).doesNotThrowAnyException();
    }
}
