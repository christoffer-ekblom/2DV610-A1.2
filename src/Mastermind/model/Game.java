package Mastermind.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Game {

    private int rowSize;

    public Game() {
        rowSize = 5;
    }

    public int getRowLength() {
        return rowSize;
    }
}
