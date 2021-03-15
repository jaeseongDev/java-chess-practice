package chess;

import chess.view.InputView;
import chess.view.OutputView;

public class ConsoleChessApplication {

    public static final String INPUT_END = "end";
    public static final String INPUT_START = "start";

    public static void main(String[] args) {
        OutputView.printStartGame();
        String startOrEnd = InputView.inputStartOrEnd();
        if (startOrEnd.equals(INPUT_END)) {
            return;
        }
        if (startOrEnd.equals(INPUT_START)) {

        }
    }
}
