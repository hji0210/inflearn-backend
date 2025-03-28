package src.study;

public class Calculator {

    //0.리턴타입과 리턴값이 없는 경우의 메소드 기능 정의(조립)
    //void add2(int a, int b){
        //매개변수 없게하고 싶으면
       void add2(){
        int a = 1;
        int b = 3;
        int result = a+ b ;
        System.out.println(result);
        //출력은 되나, result변수는 이 중괄호 블록 안에서만 사용이 되고
        //return문이 없어서 바깥으로 배출이 안된다.

    }
    //

    //1.기능을 정의 => 계산기들의 기능들을 조립(실행시키기전)

    int add(int a, int b){
        //int a;
        //int b;
        return a+b;
    }

    int subtract(int a, int b){
        return a-b;
    }


    int multiply(int a, int b){
        return a*b;
    }


    int divide(int a, int b){
        if(b==0){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        return a/b;
    }









    public static void main(String[] args) {
    //프로그램의 시작점 => main함수=>프로그램이 시작될 떄 가정 먼저 시작

    //계산기가 실행될 때, 우리가 정의한 기능들을  실행시킬 떄 -> 기능을 호출할 때
        //사용하는 메소드를 호출 메소드 작성
        //2.계산기의 기능들을 실행(호출)
        Calculator calculator = new Calculator();
        //계산기 클래스에서 정의한 메서드 이용하려면 이제 객체를 생성해줘야합니다.
        // => new Calculator()해주는 것

        calculator.add2();
       /* int sum = calculator.add(7,8);
        //sum=15;
        int difference = calculator.subtract(10,3);
        //difference=7;
        int product = calculator.multiply(3,4);
        //product=12;
        int divideResult = calculator.divide(9,3);
        //divideResult=3;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(divideResult);*/


        }
    }

//메서드는 기능을 정의하고 호출하는 역할을 가지고 있다.




