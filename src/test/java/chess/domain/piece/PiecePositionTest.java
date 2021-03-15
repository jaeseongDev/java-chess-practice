package chess.domain.piece;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class PiecePositionTest {
    @ParameterizedTest(name = "{displayName}")
    @DisplayName("x가 1~8, y가 a~h에 해당하는 값일 경우에 정상적으로 인스턴스 생성하는 지 테스트")
    @CsvSource(value = {"1:a", "2:b", "7:g", "8:h"}, delimiter = ':')
    public void init(char x, char y) {
        assertThatCode(() -> {
            new PiecePosition(x, y);
        }).doesNotThrowAnyException();
    }

    @ParameterizedTest(name = "{displayName}")
    @DisplayName("x가 1~8, y가 a~h에 해당하는 값을 벗어나는 경우에 예외 발생")
    @CsvSource(value = {"1:i", "2:j", "0:a", "9:a"}, delimiter = ':')
    public void init_ThrowException(char x, char y) {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new PiecePosition(x, y);
        });
    }
}
