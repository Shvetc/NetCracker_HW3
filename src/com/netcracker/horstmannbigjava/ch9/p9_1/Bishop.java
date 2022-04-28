package com.netcracker.horstmannbigjava.ch9.p9_1;

import java.util.ArrayList;

public class Bishop extends ChessPiece {

    public Bishop(String position) {
        super(position);
    }

    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> validMoves = new ArrayList<>();
        int downLeftIndex = 1;
        int currentColumnIndex = 1;
        int upLeftIndex = indexOfLine + indexOfColumn - 1;

        while (upLeftIndex >= downLeftIndex) {
            if (isCorrectPosition(currentColumnIndex, upLeftIndex) && (upLeftIndex != indexOfLine)) {
                validMoves.add(convertPosition(currentColumnIndex, upLeftIndex));
            }
            currentColumnIndex++;
            upLeftIndex--;
        }
        currentColumnIndex = 8;

        int upRightIndex = indexOfLine + (8 - indexOfColumn);
        while (upRightIndex >= downLeftIndex) {
            if (isCorrectPosition(currentColumnIndex, upRightIndex) && (upRightIndex != indexOfLine)) {
                validMoves.add(convertPosition(currentColumnIndex, upRightIndex));
            }
            currentColumnIndex--;
            upRightIndex--;
        }
        return validMoves;
    }
}
