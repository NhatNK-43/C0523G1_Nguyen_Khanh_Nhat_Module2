package ss04_oop.exercise.fan;

public class Test {
    public static void main(String[] args) {
//        Fan fan =new Fan();
//        System.out.printf(fan.toStr());
//        fan.setOn(true);
//        System.out.printf(fan.toStr());

        Fan fan1=new Fan(3,true,10,"yellow");
        Fan fan2=new Fan(2,false,5,"blue");

        System.out.printf("Fan1: \n"+fan1.toStr());
        System.out.printf("Fan2: \n"+fan2.toStr());
    }
}
