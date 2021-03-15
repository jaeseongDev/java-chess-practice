package domain;

import chess.domain.ChessPiece;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ChessPieceTest {
    @ParameterizedTest
    @DisplayName("체스 말을 정상적으로 생성하는 지 테스트")
    @CsvSource(value = {"ROOK:R", "KING:K", "QUEEN:Q", "BISHOP:B", "KNIGHT:N", "PAWN:P"}, delimiter = ':')
    public void init(ChessPiece chessPiece, String value) {
        assertThat(chessPiece.getValue()).isEqualTo(value);
    }
}
