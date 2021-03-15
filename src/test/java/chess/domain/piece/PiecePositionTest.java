package chess.domain.piece;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PiecePositionTest {
    @Test
    @DisplayName("체스 말의 포지션을 정상적으로 생성")
    public void init() {
        String x = "a";
        String y = "1";
        assertThatCode(() -> {
            new PiecePosition(x, y);
        }).doesNotThrowAnyException();
    }
}
