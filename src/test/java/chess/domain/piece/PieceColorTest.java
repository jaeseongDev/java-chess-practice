package chess.domain.piece;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class PieceColorTest {
    @ParameterizedTest(name = "{displayName}")
    @DisplayName("색깔로 BLACK과 WHITE를 가지고 있는 지 테스트")
    @CsvSource(value = {"WHITE", "BLACK"})
    public void containsBlackAndWhite(PieceColor color) {
        assertThat(PieceColor.values()).contains(color);
    }
}
