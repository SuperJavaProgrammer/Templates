package structural.proxy;

class RealImage implements Image{
    private String file;

    RealImage(String file) throws InterruptedException {
        this.file = file;
        load();
    }

    private void load() throws InterruptedException {
        System.out.println("Loading big data... " + file);
        Thread.sleep(5000L);
        System.out.println("Loading finished!");
    }

    @Override
    public void display() {
        System.out.println("Look..." + file);
    }
}
