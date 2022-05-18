package LinkedList_DSA;

public class Main {
    public static void main(String[] args) {

        LinkedListWork list = new LinkedListWork();
        list.insert(1221);
        list.insert(11);
        list.insert(121);
        list.insert(1001);
        list.insert(1);
        list.insertAtStart(100);
        list.insertAt(5,200);
        list.insertAt(0,2);
        list.deleteAt(0);
        list.show();


    }
}
