package structural.adapter;

//позволяет объектам с несовместимыми интерфейсами работать вместе
public class Main {
    public static void main(String[] args) {
        VectorGraphics vg = new VectorGraphicsFromRaster();
        vg.drawLine();
        vg.drawSquare();

        VectorGraphics vg2 = new VectorGraphicsFromRaster2();
        vg2.drawLine();
        vg2.drawSquare();
    }
}
