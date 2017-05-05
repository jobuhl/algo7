/**
 * Created by Rackenrotz on 14.01.16.
 */
public class Node {
    public int value;
    public Node next;

    public Node() {
        value = 0;
        next = null;
    }

    public Node(int v) {
        value = v;
        next = null;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}