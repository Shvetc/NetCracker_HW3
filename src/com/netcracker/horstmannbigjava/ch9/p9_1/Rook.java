package com.netcracker.horstmannbigjava.ch9.p9_1;

import java.util.ArrayList;

public class Rook extends ChessPiece {

    public Rook(String position) {
        super(position);
    }

    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> validMoves = new ArrayList<>();

        for (int i = 1; i <= 8; i++) {
            if (isCorrectPosition(indexOfColumn, i) && (indexOfLine != i)) {
                validMoves.add(convertPosition(indexOfColumn, i));
            }

            if (isCorrectPosition(i, indexOfLine) && (indexOfColumn != i)) {
                validMoves.add(convertPosition(i, indexOfLine));
            }
        }
        return validMoves;
    }
}
