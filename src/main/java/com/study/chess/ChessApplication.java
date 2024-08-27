package com.study.chess;


import com.study.chess.core.chess.ChessMatch;

public class ChessApplication {

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
