package stringshandling.InheritDemo;

public class CHild extends Parent {

    public void m1(){

        System.out.println("we are  chold   in m1()");
    }

    protected void m2(){

        super.m1();
        System.out.println("we are in child m1()");
    }


}
