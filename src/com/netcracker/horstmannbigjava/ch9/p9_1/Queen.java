package com.netcracker.horstmannbigjava.ch9.p9_1;

import java.util.ArrayList;

public class Queen extends ChessPiece {

    public Queen(String position) {
        super(position);
    }

    @Override
    public ArrayList<String> canMoveTo() {
        Bishop bishop = new Bishop(position);
        ArrayList<String> arrayList = bishop.canMoveTo();

        Rook rook = new Rook(position);
        ArrayList<String> arrayList2 = rook.canMoveTo();

        ArrayList<String> arrayList3 = new ArrayList<>(arrayList);
        arrayList3.addAll(arrayList2);

        return arrayList3;
    }
}
