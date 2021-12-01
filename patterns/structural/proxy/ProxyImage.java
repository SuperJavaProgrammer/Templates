package structural.proxy;

class ProxyImage implements Image{
    private String file;
    private RealImage ri;

    ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() throws InterruptedException {
        if (ri == null) ri = new RealImage(file);
        ri.display();
    }
}
