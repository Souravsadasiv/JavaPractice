//Annotation
import java.util.*;
class Parent{
    void property(){
        System.out.println("10cr Property will be of my child");
    }
    void marry(){
        System.out.println("My child will marry Ananya");
    }
}


class Child extends Parent{
    @Override
    void marry() {
        // TODO Auto-generated method stub
        // super.marry();
        System.out.println("I want to marry kajol");
    }

    //@NonNull is not working
    int add(int num1,int num2){
        int c=num1+num2;
        // System.out.println(c);
        return c;
    }
}

class Test extends Child{
    public static void main(String[] args) {
        Child ch=new Child();
        ch.marry();
        ch.property();
        int result=ch.add(5, 6);
        System.out.println(result);
        
    }
}