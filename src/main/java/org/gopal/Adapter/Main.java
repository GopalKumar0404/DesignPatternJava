package org.gopal.Adapter;

public class Main {
    public static void main(String[] args) {
        Pen p = new PenAdapter();
        Paper paper = new Paper();
        paper.setPen(p);
        paper.writeOnPaper("Adapter Design Pattern is working.");
    }
}
