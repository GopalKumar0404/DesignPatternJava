package org.gopal.composite;

public class Main {
    public static void main(String[] args) {
        Component mouse = new Leaf("Mouse",500);
        Component ram = new Leaf("RAM",3000 );

        Component peripheral = new Composite("Peripheral");
        Component motherBoard = new Composite("Motherboard");
        Component computer = new Composite("Computer");

        peripheral.add(mouse);
        motherBoard.add(ram);
        computer.add(peripheral);
        computer.add(motherBoard);

        computer.showPrice();

    }
}
