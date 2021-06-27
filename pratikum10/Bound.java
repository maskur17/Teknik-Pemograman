public class Bound <T extends A> {
    private T objRef;

    Bound(T obj){
        this.objRef = obj;
    }
    public int getAnswer(){
        return this.objRef.get();
    }
    public void doRunTest(){
        this.objRef.displayClass();
    }
}

class A {
    private int x = 20;
    public int get(){
        return x;
    }
    public void displayClass(){
        System.out.println("Inside super class A");
    }
}

class B extends A{
    private int x = 15;
    public int get(){
        return x;
    }
    public void displayClass(){
        System.out.println("Inside super class B");
    }
}

class C extends A{
    private int x = 10;
    public int get(){
        return x;
    }
    public void displayClass(){
        System.out.println("Inside sub class C");
    }
}