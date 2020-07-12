package JavaExample;

public interface IntExample1 { void display1();
}
interface IntExample2 {void display2();
}
interface IntExample3 extends IntExample1, IntExample2{ }

class IntExample4 implements IntExample3
    {
    public void display1(){
        System.out.println("display2 method");
    }
    public void display2(){
        System.out.println("display3 method");
    }
}

