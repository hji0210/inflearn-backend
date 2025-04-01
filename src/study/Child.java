package src.study;  // src.study라는 패키지 안에 클래스가 속함

// 부모 클래스를 상속받는 자식 클래스 선언
public class Child extends Parent {

    public Child(int 재산) {
         super(재산);

    }



    // 부모 클래스의 hello() 메서드를 자식 클래스에 맞게 재정의 (오버라이딩)
    @Override
    void hello() {
        // 자식의 인사말 출력
        System.out.println("안녕하세요. 자식입니다.");
    }
}
