package org.gopal.Adapter;

public class Paper {
    Pen pen;
    public void setPen(Pen pen) {
        this.pen = pen;
    }
    public Pen getPen() {
        return pen;
    }
    public void writeOnPaper(String str){
        pen.write(str);
    }
}
