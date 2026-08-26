public class Node{
    int key;
    int val;
    Node prev;
    Node next;


    public Node(int key, int val){
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}


class LRUCache {
    int cap;
    Map<Integer,Node> map;
    Node head;
    Node last;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.map = new HashMap<>();
        this.head = new Node(0,0);
        this.last = new Node(0,0);
        this.head.next = this.last;
        this.last.prev = this.head;
    }
    
    private void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void insert(Node node){
        Node prev = last.prev;
        prev.next = node;
        node.prev = prev;
        node.next = last;
        last.prev = node;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node res = map.get(key);
            remove(res);
            insert(res);
            return res.val;
        }
        return -1;        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        Node node = new Node(key,value);
        insert(node);
        map.put(key,node);

        if(map.size() > cap){
            Node lru = this.head.next;
            remove(lru);
            map.remove(lru.key);
        }

    }
}
