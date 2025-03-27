package src.study;

import java.util.Scanner;

public class ForWhileDoWhile {
    public static void main(String[] args) {
/*        // main 함수는 프로그램의 시작점

        // for(초기식; 조건식; 증감식) {}
        for (int i = 1; i < 10; i++) {
            System.out.println("안녕");
            // i가 1,2,3,4,5,6,7,8,9로 9번 반복
            System.out.println("숫자: " + i);
        }*/

        // 초기식
        // while(조건식) { 반복할 코드; 증감식 } -> 결말이 정해진 경우
        // while(조건식) -> 결말이 정해져 있지 않은 경우
        Scanner scanner = new Scanner(System.in);
        //콘솔에다가 글을 타이핑해서 입력하기 위해서는 위 코드와 같이 작성
        String input = scanner.next();
        while (input.equals("안녕") ) {
            //기본자료형(숫자,문자,불리언)끼리 비교할때는 equals
            //참조자료형(객체,사용자정의클래스)끼리 비교할 때는 ==
            System.out.println("안녕3");
            break;
        }

        //do-while문은 최소 한번은 반드시 실핼되어야할 떄 이용합니다.
        //do블록 = do{}을 먼저 실행한 후 조건을 검사

/*
        do{

        }while (조건식);
*/

        Scanner scanner2 = new Scanner(System.in);
        int number;

        do {
            System.out.println("1부터 5사이의 숫자를 입력! 부탁!: ");
            number = scanner2.nextInt();
           }while (number<1 || number>5); //true면 실행. 조건이 둘중하나가 false면 다시 do가 실행됨
        // 조건: number가 1 미만 또는 5 초과이면 다시 입력 받음 (조건이 true일 때 반복)
        System.out.println("올바른 숫자 입력했음: " + number);
        }


        //만약에 9를 입력했다면 number>5; => true
       //다시  System.out.println("1부터 5사이의 숫자를 입력! 부탁!: ");
       //  number = scanner2.nextInt(); 이 코드를 반복합니다.하지만
       //1부터 5사이의 숫자를 입력하면 이제, number<1 || number>5 이 식이 전부 false가 나오니까
       //더 이상 반복하지 않고 아래   System.out.println("올바른 숫자 입력했음: " + number);
       //이 문장이 실행된다.

    }




