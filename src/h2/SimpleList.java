package h2;

public class SimpleList {
    public Node head = new Node(Integer.MIN_VALUE);

    public Node getFirst() {
        return head.next;
    }

    public Node getLast() {
        if(head.next == null) return null;
        Node node = head.next;
        while(node.next != null) node = node.next;
        return node;
    }

    public void append(int newValue) {
        Node last = getLast();
        if(last != null) last.next = new Node(newValue);
        else head.next = new Node(newValue);
    }

    public Node findFirst(int value) {
        Node node = head;
        while(node.next != null) {
            node = node.next;
            if(node.value == value) return node;
        }
        return null;
    }

    public boolean insertAfter(int preValue, int newValue) {
        Node oldNode = findFirst(preValue);
        if(oldNode == null) return false;
        Node newNode = new Node(newValue);
        newNode.next = oldNode.next;
        oldNode.next = newNode;
        return true;
    }

    public boolean delete(int value) {
        Node node = head;
        while(node.next != null) {
            if(node.next.value == value) {
                node.next = node.next.next;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node node = head.next;
        while(node != null) {
            sb.append(" ").append(node.value);
            node = node.next;
        }
        return "[" + sb + " ]";
    }
}
