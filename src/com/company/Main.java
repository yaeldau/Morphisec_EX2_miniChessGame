package com.company;

public class Main {

    public static void main(String[] args) {

        Character queen = new Queen();
        Character king = new King();
        Character knight = new Knight();
        queen.move();
        king.move();
        knight.move();
    }
}
