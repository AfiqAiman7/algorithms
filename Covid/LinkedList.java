public class LinkedList {

    private Node head;
    private Node tail;

    public void insertAtFront(Object elem) {
        Node newNode = new Node(elem);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtBack(Object elem) {
        Node newNode = new Node(elem);

        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Object getFirst() {
        if (head == null) {
            return null;
        }

        return head.data;
    }

    public Object getLast() {
        if (tail == null) {
            return null;
        }

        return tail.data;
    }

    public Object removeFirst() {
        if (head == null) {
            return null;
        }

        Object removedData = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return removedData;
    }

    public Object removeLast() {
        if (tail == null) {
            return null;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return tail.data;
        }

        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }

        Object removedData = tail.data;
        tail = current;
        tail.next = null;

        return removedData;
    }

    public Object getNext() {
        if (head == null) {
            return null;
        }

        return head.next;
    }

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }
}