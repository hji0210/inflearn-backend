package src.study;

public class Main {

    public static void main(String[] args) {
        Person person= new Person();
        //person 클래스로 객체를 생성해서 공간을 만들어주고 jvm 힙영역에 데이터를 저장
        //System.out.println(person.getName());
        person.setName("블랙");
        System.out.println(person.getName());
    }



}

