package com.netcracker.horstmannbigjava.ch9;

import com.netcracker.horstmannbigjava.ch9.p9_1.*;

import java.util.ArrayList;

public class TestChessPosition {
    public static void main(String[] args) {

        Queen queen = new Queen("d4");
        System.out.println("List of possible moves from a given piece in the current position: " + queen.canMoveTo());

        String stringBuilder = createChessDesk(queen);
        System.out.println(stringBuilder);
    }

    static String createChessDesk(ChessPiece chessPiece) {
        StringBuilder desk = new StringBuilder();
        ArrayList<String> moves = chessPiece.canMoveTo();
        for (int i = 8; i >= 1; i--) {
            desk.append(" -----------------\n");
            desk.append(i);
            for (int j = 1; j <= 8; j++) {
                desk.append("|");
                for (String move : moves) {
                    if (chessPiece.getPositions().get(move.charAt(0)) == j && Character.getNumericValue(move.charAt(1)) == i) {
                        desk.append("*");
                    }
                }
                if (i == chessPiece.getIndexOfLine() && j == chessPiece.getIndexOfColumn()) {
                    desk.append(getShortNameFigure(chessPiece));
                    continue;
                }

                if (!(desk.charAt(desk.length() - 1) == '*')) {
                    desk.append(" ");
                }
            }
            desk.append("|");
            desk.append("\n");
        }
        desk.append("------------------\n");
        desk.append("  a b c d e f g h");

        return desk.toString();
    }

    static Character getShortNameFigure(ChessPiece chessPiece) {
        char nameFigure = ' ';
        if (chessPiece instanceof Queen) {
            nameFigure = 'Q';
        } else if (chessPiece instanceof King) {
            nameFigure = 'K';
        } else if (chessPiece instanceof Bishop) {
            nameFigure = 'B';
        } else if (chessPiece instanceof Pawn) {
            nameFigure = 'P';
        } else if (chessPiece instanceof Rook) {
            nameFigure = 'R';
        } else if (chessPiece instanceof Knight) {
            nameFigure = 'H';
        }
        return nameFigure;
    }
}
