package structural.adapter;

class VectorGraphicsFromRaster extends RasterGraphics implements VectorGraphics {
    @Override
    public void drawLine() {
        drawRasterLine();
    }
    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
