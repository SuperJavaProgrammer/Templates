package behavioral.memento;

class File {
    private Save save;

    Save getSave() {
        return save;
    }
    void setSave(Save save) {
        this.save = save;
    }
}
