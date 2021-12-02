package behavioral.templateMethod;

abstract class C {
    void templateMethod() {
        System.out.println("111");
        differ();
        System.out.println("222");
        differ2();
    }
    abstract void differ();
    abstract void differ2();
}
