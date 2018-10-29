package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class Main {

    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.setMyBrand("Trek Bike");
        b.setMyModel("7.4FX");
        b.setMyGearCount(23);
        System.out.println("Brand : " + b.getMyBrand());
        System.out.println("Model : " + b.getMyModel());
        System.out.println("Jumlah Gear : " + b.getMyGearCount());

        Skateboard s = new Skateboard();
        s.setMyBrand("Ally Skate");
        s.setMyModel("Rocket");
        s.setMyBoardLenght(54.5);
        System.out.println("Brand : " + s.getMyBrand());
        System.out.println("Model : " + s.getMyModel());
        System.out.println("Panjangnya Board : " + s.getMyBoardLenght());

    }
}
