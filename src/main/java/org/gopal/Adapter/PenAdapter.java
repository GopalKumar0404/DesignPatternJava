package org.gopal.Adapter;

public class PenAdapter implements Pen{
    PilotPen pp = new PilotPen();
    @Override
    public void write(String str) {
        // I'm using the already defined implementation

        pp.mark(str);
    }
}
