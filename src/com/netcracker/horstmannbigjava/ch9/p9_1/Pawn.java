package com.netcracker.horstmannbigjava.ch9.p9_1;

import java.util.ArrayList;

public class Pawn extends ChessPiece {
    public Pawn(String position, int typeOfChessPiece) {
        super(position, typeOfChessPiece);
    }

    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> validMoves = new ArrayList<>();
        for (int i = indexOfColumn - 1; i <= indexOfColumn + 1; i++) {
            int tempIndexOfLine = indexOfLine + 1;
            if (typeOfChessPiece == 0) {
                tempIndexOfLine = indexOfLine - 1;
            }
            if (isCorrectPosition(i, tempIndexOfLine)) {
                validMoves.add(convertPosition(i, tempIndexOfLine));
            }
        }

        return validMoves;
    }
}
