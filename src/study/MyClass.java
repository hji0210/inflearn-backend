package src.study;

public class MyClass {
    //자바클래스에는 변수(속성)와 메소드(기능)가 있다.

/*     static int a=1;//전역변수
    static int b=2;//전역변수*/

    static void methodOne(){
         int c=3;
         System.out.println(c);

     }


    public static void main(String[] args) {

        MyClass.methodOne();


    }
//메모리 누수가 심해서 버퍼링하는데 시간이 더 걸린다거나 하는 문제점


}

