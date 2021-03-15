package chess.domain.piece;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PieceOnBoardTest {
    @Test
    @DisplayName("체스의 포지션을 정상적으로 생성하는 지 테스트")
    public void init() {
        assertThatCode(() -> {
            new PiecePosition('a', '2');
            Piece piece = new Piece(PieceType.BISHOP, PieceColor.BLACK);
            new PieceOnBoard(new PiecePosition('a', '2'), piece);
        }).doesNotThrowAnyException();
    }
}
