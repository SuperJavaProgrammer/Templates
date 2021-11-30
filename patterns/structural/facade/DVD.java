package structural.facade;

class DVD {
    private boolean data = false;

    boolean hasData() {
        return data;
    }
    void load() {
        System.out.println("load");
        data = true;
    }
    void unload() {
        System.out.println("upload");
        data = false;
    }
}
