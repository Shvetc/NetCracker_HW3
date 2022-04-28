package com.netcracker.horstmannbigjava.ch9.p9_1;

import java.util.ArrayList;

public class Knight extends ChessPiece {
    public Knight(String position) {
        super(position);
    }

    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> validMoves = new ArrayList<>();
        int prevIndexOfColumn = indexOfColumn - 1;
        int nextIndexOfColumn = indexOfColumn + 1;
        int prevPrevIndex = indexOfLine - 2;
        for (int i = 0; i < 2; i++) {
            if (isCorrectPosition(nextIndexOfColumn, prevPrevIndex) &&
                    isCorrectPosition(prevIndexOfColumn, prevPrevIndex)) {
                validMoves.add(convertPosition(nextIndexOfColumn, prevPrevIndex));
                validMoves.add(convertPosition(prevIndexOfColumn, prevPrevIndex));
            }
            prevPrevIndex = indexOfLine + 2;
        }

        prevPrevIndex = indexOfLine - 1;
        nextIndexOfColumn++;
        prevIndexOfColumn--;
        for (int i = 0; i < 2; i++) {
            if (isCorrectPosition(nextIndexOfColumn, prevPrevIndex) &&
                    isCorrectPosition(prevIndexOfColumn, prevPrevIndex)) {
                validMoves.add(convertPosition(nextIndexOfColumn, prevPrevIndex));
                validMoves.add(convertPosition(prevIndexOfColumn, prevPrevIndex));
            }

            prevPrevIndex = indexOfLine + 1;
        }

        return validMoves;
    }
}
