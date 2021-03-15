package chess.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class ChessStatusTest {
    // 위치
    // 하얀색인지 검정색인지
    // ChessPiece 자료구조 들고있어야 돼 (움직이는 로직 포함해야 되거든)
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
