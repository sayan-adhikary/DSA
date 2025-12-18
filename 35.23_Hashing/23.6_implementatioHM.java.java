import java.util.*;

class CustomHashMap<K, V> {

    // Node class for LinkedList (Chaining)
    private static class Node<K, V> {
        K key;
        V value;
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node<K, V>>[] buckets; // array of LinkedLists
    private int size = 0;                     // number of key-value pairs
    private static final double LOAD_FACTOR = 0.75;

    // Constructor
    public CustomHashMap() {
        buckets = new LinkedList[4];  // initial capacity
    }

    // Lambda-style hash function
    private final java.util.function.Function<K, Integer> hashFunction =
            key -> Math.abs(key.hashCode()) % buckets.length;

    // Rehash method (when load > 0.75)
    private void rehash() {
        LinkedList<Node<K, V>>[] oldBuckets = buckets;
        buckets = new LinkedList[oldBuckets.length * 2]; // double size
        size = 0;

        for (LinkedList<Node<K, V>> bucket : oldBuckets) {
            if (bucket != null) {
                for (Node<K, V> node : bucket) {
                    put(node.key, node.value);
                }
            }
        }
    }

    // Put function
    public void put(K key, V value) {
        int index = hashFunction.apply(key);

        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        // Check if key already exists → update value
        for (Node<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        // Key does not exist → insert new node
        buckets[index].add(new Node<>(key, value));
        size++;

        // Check load factor
        double load = (double) size / buckets.length;
        if (load > LOAD_FACTOR) {
            rehash();
        }
    }

    // Get function
    public V get(K key) {
        int index = hashFunction.apply(key);
        LinkedList<Node<K, V>> bucket = buckets[index];

        if (bucket != null) {
            for (Node<K, V> node : bucket) {
                if (node.key.equals(key)) {
                    return node.value;
                }
            }
        }
        return null;
    }

    // Contains key or not
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // Remove key
    public V remove(K key) {
        int index = hashFunction.apply(key);
        LinkedList<Node<K, V>> bucket = buckets[index];

        if (bucket != null) {
            Iterator<Node<K, V>> itr = bucket.iterator();
            while (itr.hasNext()) {
                Node<K, V> node = itr.next();
                if (node.key.equals(key)) {
                    itr.remove();
                    size--;
                    return node.value;
                }
            }
        }
        return null;
    }

    // Check if map is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Return all keys
    public Set<K> keySet() {
        Set<K> set = new HashSet<>();

        for (LinkedList<Node<K, V>> bucket : buckets) {
            if (bucket != null) {
                for (Node<K, V> node : bucket) {
                    set.add(node.key);
                }
            }
        }
        return set;
    }

    // Size
    public int size() {
        return size;
    }

    // ToString for viewing
    public String toString() {
        StringBuilder sb = new StringBuilder("{ ");
        for (LinkedList<Node<K, V>> bucket : buckets) {
            if (bucket != null) {
                for (Node<K, V> node : bucket) {
                    sb.append(node.key).append("=").append(node.value).append(" ");
                }
            }
        }
        return sb.append("}").toString();
    }

    // MAIN — DEMO
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        System.out.println("Map: " + map);
        System.out.println("Get C: " + map.get("C"));
        System.out.println("Contains B: " + map.containsKey("B"));
        System.out.println("KeySet: " + map.keySet());
        System.out.println("Remove A: " + map.remove("A"));
        System.out.println("Map After Remove: " + map);
        System.out.println("Is Empty: " + map.isEmpty());
    }
}
