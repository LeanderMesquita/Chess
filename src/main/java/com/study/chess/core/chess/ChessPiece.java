package com.study.chess.core.chess;

import com.study.chess.core.boardgame.Board;
import com.study.chess.core.boardgame.Piece;

public abstract class ChessPiece extends Piece {

    private final Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
