package com.netcracker.horstmannbigjava.ch9.p9_1;

import java.util.ArrayList;

public class King extends ChessPiece {
    public King(String position) {
        super(position);
    }

    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> validMoves = new ArrayList<>();
        for (int i = indexOfLine - 1; i <= indexOfLine + 1; i++) {
            for (int j = indexOfColumn - 1; j <= indexOfColumn + 1; j++) {
                if (i == indexOfLine && j == indexOfColumn) {
                    continue;
                }
                if (isCorrectPosition(i, j)) {
                    validMoves.add(convertPosition(j, i));
                }
            }
        }
        return validMoves;
    }
}
