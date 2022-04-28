package com.netcracker.horstmannbigjava.ch9.p9_1;

import java.util.*;

public class ChessPiece {
    protected int indexOfLine;
    protected int indexOfColumn;
    protected int typeOfChessPiece; //1 - white, 0 - black
    protected String position;

    protected HashMap<Character, Integer> positions;

    public ChessPiece(String position) {
        createChessBoard();
        if (!IsCorrectPosition(position)) {
            throw new InputMismatchException("The current position is not existed");
        }
        this.position = position;
    }

    public ChessPiece(String position, int typeOfChessPiece) {
        this(position);
        this.typeOfChessPiece = typeOfChessPiece;
    }

    public ArrayList<String> canMoveTo() {
        return null;
    }


    private boolean IsCorrectPosition(String pos) {
        boolean itIsCorrect = false;
        if (positions.containsKey(pos.charAt(0)) && positions.containsValue(Character.getNumericValue(pos.charAt(1)))) {
            indexOfColumn = positions.get(pos.charAt(0));
            indexOfLine = Character.getNumericValue(pos.charAt(1));
            itIsCorrect = true;
        }

        return itIsCorrect;
    }

    protected String convertPosition(int indexOfColumn, int indexOfLine) {
        StringBuilder strPosition = new StringBuilder();
        Set<Character> keySet = positions.keySet();
        Character[] charPosition = keySet.toArray(new Character[indexOfColumn]);
        strPosition.append(charPosition[indexOfColumn - 1]);

        strPosition.append(indexOfLine);

        return strPosition.toString();
    }

    protected boolean isCorrectPosition(int indexOfColumn, int indexOfLine) {
        return positions.containsValue(indexOfColumn) && positions.containsValue(indexOfLine);
    }

    private void createChessBoard() {
        positions = new HashMap<>();
        int maxLimitIndex = 8;
        int indexChar = 97; //index of symbol a
        for (int i = 1; i <= maxLimitIndex; i++) {
            positions.put((char) indexChar, i);
            indexChar++;
        }
    }

    public int getIndexOfLine() {
        return indexOfLine;
    }

    public int getIndexOfColumn() {
        return indexOfColumn;
    }

    public HashMap<Character, Integer> getPositions() {
        return positions;
    }
}
