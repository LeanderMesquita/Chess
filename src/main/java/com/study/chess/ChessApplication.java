package com.study.chess;


import com.study.chess.core.chess.ChessMatch;
import com.study.chess.core.chess.ChessPiece;
import com.study.chess.core.chess.ChessPosition;
import com.study.chess.core.exceptions.ChessException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChessApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true){
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");

                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performeChessMove(source, target);
            }catch (ChessException | InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }


    }
}
