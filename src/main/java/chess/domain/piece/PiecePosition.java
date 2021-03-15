package chess.domain.piece;

public class PiecePosition {
    private static final char MIN_X_POSITION = 'a';
    private static final char MAX_X_POSITION = 'h';
    public static final char MIN_Y_POSITION = '1';
    public static final char MAX_Y_POSITION = '8';
    private final char x;
    private final char y;

    public PiecePosition(char x, char y) {
        validatePosition(x, y);
        this.x = x;
        this.y = y;
    }

    private void validatePosition(char x, char y) {
        if (x < MIN_X_POSITION || x > MAX_X_POSITION) {
            throw new IllegalArgumentException("가로의 범위에 해당하는 값만 넣어야 합니다.");
        }
        if (y < MIN_Y_POSITION || y > MAX_Y_POSITION) {
            throw new IllegalArgumentException("세로의 범위에 해당하는 값만 넣어야 합니다.");
        }
    }
}
