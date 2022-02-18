package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class ChessBoardTest {

    @Test
    public void wayIs3() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 4;
        int y2 = 4;
        int expected = 3;
        int result = ChessBoard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, result);

    }

    @Test
    public void wayIs7() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 7;
        int y2 = 7;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wayIs0() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 3;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY1isMinus1ThenWayIs0() {
        int x1 = 2;
        int y1 = -1;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}