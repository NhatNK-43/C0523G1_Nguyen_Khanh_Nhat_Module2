package ss10_dsa.practice.practice2;

import javax.xml.soap.Node;

public class MyLinkList {
    private Node head;
    private int numNodes;

    public MyLinkList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data=data;
        }
        public Object getData(){
            return this.data;
        }
    }

    public void add(int index, Object data){
        Node temp = head;
        Node holder;
        for (int i =0; i<index-1 && temp.next!=null;i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
    }
}
