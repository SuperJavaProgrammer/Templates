package structural.adapter;

class VectorGraphicsFromRaster2 implements VectorGraphics {
    private RasterGraphics rg = new RasterGraphics();
    @Override
    public void drawLine() {
        rg.drawRasterLine();
    }
    @Override
    public void drawSquare() {
        rg.drawRasterSquare();
    }
}
