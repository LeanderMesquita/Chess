package com.study.chess.core.chess.pieces;

import com.study.chess.core.boardgame.Board;
import com.study.chess.core.chess.ChessPiece;
import com.study.chess.core.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
}
