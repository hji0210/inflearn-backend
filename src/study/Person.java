package src.study;

public class Person {
    private String name;


    //전역변수는 항상 private 생성


    public  String getName(){
        return  name;
    }//이름 다른클래스에서 조회할 수 있게 하는 메소드


    public void  setName(String name){
        this.name=name;
    }//이름 다른클래스에서 수정할 수 있게 하는 메소드





}
