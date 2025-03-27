package src.study;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //프로그램의 시작점
     /*   int[] arrayBox = new int[9];*/
        //int [] arrayBox2;
        //arrayBox2 = new int[9];
        //둘 중에 하나로 하면 됨
  /*     System.out.println(arrayBox[3])*/;
       //arryBox라는 배열변수의 4번쨰상자의 값을 조회하는데 값이 나올까요?
        //new int[9]; 해가지고 공간이 9개가 힙영역에 정수데이터가 저장됨
        //정수데이터는 기본값이 0입니다. 문자열은 기본값이 null
        //=>기본 자료형 기본값은 문자,숫자,불리언
        // => 문자(char):\u0000
        //=>숫자(int,byte,short) : 0
        //=>불리언(boolean) : false
        //참조자료형(배열과 객체) : 배열자체의 기본값은 null 하지만 배열안의 각각의 요소는
        //int,char,boolean에 따라 다르다.
        //객체는 기본적으로 참조자료형입니다.객체는 일단 JVM에 new키워드를 이용하여 메모리에 자바코드가 저장
        //그렇기 떄문에, 우리가 정의한 클래스 객체는  참조자료형이기 때문에
        // MyClass obj = >기본값이 null입니다.(공간만 생성해야 기본값이 null,대입해버리면 기본값이 들어갈 수 없다.)
        //String은 참조자료형입니다. => null로 기본값이 된다.
        //char => 기본자료형이지만 string

/*        String [] arrayBox2 = new String [2];
        //2개의 공간이 만들어졌고, 기본값은 null입니다.
        System.out.println(arrayBox2[0]);
        System.out.println(arrayBox2[1]);*/

        //배열에 값을 넣는 것을 초기화라고 한다.
/*        int[] arrayBox = new int[9];
        arrayBox[0]=1;
        arrayBox[1]=2;
        arrayBox[2]=3;
        arrayBox[3]=4;
        arrayBox[4]=5;
        arrayBox[5]=6;
        arrayBox[6]=7;
        arrayBox[7]=8;
        arrayBox[8]=9;*/

        int[] arrayBoxEasy={1,2,3,4,5,6,7,8,9};
        //                   0,1,2,3,4,5,6,7,8

        //System.out.println(arrayBoxEasy);

        //[I@b4c966a =>이거는 배열의 값 자체(숫자, 문자, 블리언) 이런거는 JVM에 힙영역에 저장
        //하지만 배열같은 참조자료형은 이제 스택영역에 있는 주소값을 확인해서 힙영역의 데이터를 뽑아온다.
       // System.out.println(arrayBoxEasy[0]);
        for(int i=0; i<arrayBoxEasy.length;i++){
           // 0~8까지의 값이 i에 담기고
            System.out.println(arrayBoxEasy[i]);
        }
    }




}

