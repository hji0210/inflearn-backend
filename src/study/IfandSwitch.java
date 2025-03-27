package src.study;

public class IfandSwitch {
    //모든 자바코드는 자바클래스 안에서 작성이 된다.

    public static void main(String[] args) {
        //프로그램 시작점
        String today="목요일";
        //if문
        if(today=="월요일"){
            System.out.println("오늘은 월요일입니다.");
        }else if(today=="화요일"){
            System.out.println("오늘은 화요일입니다.");
        } else{
            System.out.println("오늘은 월요일과 화요일이 아닙니다.");
        }

        String book="가족";

        switch (book){
            case "주식":
                System.out.println("이 책은 주식책입니다.");
                break;
            case "비트코인":
                System.out.println("이 책은 비트코인책입니다.");
                break;
            case "정치":
                System.out.println("이 책은 정치책입니다.");
                break;
            default:
                System.out.println("어떤 책도 포함이 되지가 않는다.");
                //세가지 case가 해당이 안될 경우

        }




    }



}