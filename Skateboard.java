package com.company;

public class Skateboard extends Vehicle {
    private double myBoardLenght;

    public Skateboard() {
        System.out.println("Skateboard");
    }

    public double getMyBoardLenght() {
        return myBoardLenght;
    }

    public void setMyBoardLenght(double myBoardLenght) {
        this.myBoardLenght = myBoardLenght;
    }
}
