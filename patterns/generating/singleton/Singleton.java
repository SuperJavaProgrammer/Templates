package generating.singleton;

class Singleton {
    private static volatile Singleton instance; //volatile если объект используется вне синхронизированного блока
    private Singleton(){ }
    static Singleton getInstance() {
        if (instance == null)
            synchronized(Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        return instance;
    }
}
