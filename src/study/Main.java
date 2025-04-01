package src.study;  // src.study라는 패키지 안에 클래스가 속함

// 메인 클래스 선언 - 프로그램의 시작점
public class Main {
    // main() 메서드: 자바 프로그램이 실행되는 시작점
    public static void main(String[] args) {
        // 자식 클래스의 객체 생성
        Child child = new Child(10);


        // 자식 클래스의 hello() 메서드 호출
        child.hello();

        // 상속받은 '재산' 필드 값 출력
        System.out.println("재산: " + child.재산);
    }
}
