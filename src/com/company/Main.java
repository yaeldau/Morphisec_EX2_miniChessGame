package com.company;

public class Main {

    public static void main(String[] args) {

        Character queen = new Queen("queen");
        Character king = new King("king");
        Character knight = new Knight("knight");
        queen.move();
        king.move();
        knight.move();
    }
}
