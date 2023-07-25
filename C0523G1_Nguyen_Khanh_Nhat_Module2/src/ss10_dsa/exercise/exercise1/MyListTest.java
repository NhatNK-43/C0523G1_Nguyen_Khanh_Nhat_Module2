package ss10_dsa.exercise.exercise1;

import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(25);
        myList.add(30);
        myList.add(4, 50);
        myList.add(0, 5);
       // myList.add(10, 51);
        System.out.println(myList);
        myList.add(30);
        System.out.println(myList);
       // System.out.println("Element removed: " + myList.remove(2));
        System.out.println("Size: " + myList.getSize());
        System.out.println("Length: " + myList.getLength());
//        System.out.println(myList);
//
//        MyList<Integer> myListCopy = myList.clone();
//        System.out.println(myListCopy);
//
//        System.out.println(myList.indexOf(50));

//        System.out.println(myListCopy.get(1));
//        System.out.println(myListCopy.clear());
    }
}
