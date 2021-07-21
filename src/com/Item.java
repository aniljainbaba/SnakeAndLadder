package com;

public class Item <K, V> {
	K key;
    V value;
    int hashCode;
    
   // Reference to next node
    Item<K, V> next;
    
 // Constructor
    public Item(K key, V value, int hashCode)
    {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }

}
