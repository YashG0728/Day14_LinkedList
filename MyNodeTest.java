package basics.UC1;

public class MyNodeTest {
    public void LinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        System.out.println(myFirstNode.getKey());
        System.out.println(mySecondNode.getKey());
        System.out.println(myThirdNode.getKey());
    }
    public static void main(String[] args) {
        MyNodeTest myNode = new MyNodeTest();
        myNode.LinkedListTest();
    }
}
