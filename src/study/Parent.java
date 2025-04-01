package src.study;

// 부모 클래스 선언
public class Parent {
    // 자식 클래스에서도 접근


    public Parent(int 재산) {
        this.재산=재산;
    }

    int 재산;

    // 부모 클래스의 인사 메서드 정의
    void hello() {
        // 부모의 인사말 출력
        System.out.println("안녕하세요. 부모입니다.");
    }


}
