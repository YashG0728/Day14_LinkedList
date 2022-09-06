package basics.UC9;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(70);
        MyNode<Integer> myThirdNode = new MyNode<>(30);
        MyNode<Integer> myForthNode = new MyNode<>(40);

        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.insert(myFirstNode, myThirdNode);
        myLinkedList.insert(myThirdNode,myForthNode);
        System.out.println(myLinkedList.search(30));
        myLinkedList.printMyNode();
    }
}
