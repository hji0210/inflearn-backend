package src.study;  // src.study라는 패키지 안에 클래스가 속함

// 메인 클래스 선언 - 프로그램의 시작점
public class Main {
    // main() 메서드: 자바 프로그램이 실행되는 시작점
    public static void main(String[] args) {
        // 자식 클래스의 객체 생성
  /*      Child child = new Child(10);


        // 자식 클래스의 hello() 메서드 호출
        child.hello();

        // 상속받은 '재산' 필드 값 출력
        System.out.println("재산: " + child.재산);*/

       /* Dog dog = new Dog();
        dog.sound();
        dog.walk();인터페이스*/

        Dog2 dog2 = new Dog2();
        dog2.sound2();
        dog2.sleep();


        //추상 클래스 Animal**은 직접 new Animal()으로 객체를 만들 수 없습니다.
        //하지만 Dog 클래스는 **Animal**을 상속받은 구체적인 클래스이기 때문에 new Dog()로 객체를 만들 수 있습니다.


        //인터페이스 Animal**은 직접 new Animal()으로 객체를 만들 수 없습니다.

      //하지만 Dog 클래스는 Animal 인터페이스를 구현했기 때문에 new Dog()로 객체를 만들 수 있습니다.


    }
}
