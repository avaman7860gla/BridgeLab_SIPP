
class MyHashMap {
    private static class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 1000;
    private Node[] map = new Node[SIZE];

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node node = map[index];
        if (node == null) {
            map[index] = new Node(key, value);
            return;
        }
        while (node != null) {
            if (node.key == key) {
                node.value = value;
                return;
            }
            if (node.next == null) break;
            node = node.next;
        }
        node.next = new Node(key, value);
    }

    public int get(int key) {
        int index = hash(key);
        Node node = map[index];
        while (node != null) {
            if (node.key == key) return node.value;
            node = node.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        Node node = map[index], prev = null;
        while (node != null) {
            if (node.key == key) {
                if (prev == null) map[index] = node.next;
                else prev.next = node.next;
                return;
            }
            prev = node;
            node = node.next;
        }
    }
}
