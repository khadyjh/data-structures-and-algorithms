package challenge30.structure;

import challenge30.data.HashNode;

import java.lang.reflect.Array;
import java.util.*;

public class HashMap<K ,V> {
    private ArrayList<HashNode<K, V>> bucketArray;
    private int buckets;
    private int size;

    public HashMap() {
        bucketArray = new ArrayList<>();
        buckets = 10;

        // init bucket array to prevent index out of
        // bounds exception for first time insert / retrieval
        for (int index = 0; index < buckets; index++) {
            bucketArray.add(null);
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hashCode(K key) {
        return Objects.hashCode(key);
    }

    /*
    This is the hashing logic which produces\
    a unique array index to do inserts and
    lookups
     */
    public int getBucketIndex(K key) {
        int hashCode = hashCode(key);
        int arrayIndex = hashCode % buckets;

        arrayIndex = arrayIndex < 0 ? arrayIndex * -1 : arrayIndex;

//        if (arrayIndex < 0) {
//            arrayIndex = arrayIndex * -1;
//        }

//        System.out.println("The index of => " + key + " is => " + arrayIndex);

        return arrayIndex;
    }

    public void put(K key, V value) {
        // find the index of where we should put the value in
        // the bucket array
        int index = getBucketIndex(key);
        int hashcode = hashCode(key);

        // create head and make it point to where the index is
        HashNode<K, V> head = bucketArray.get(index);

        HashNode<K, V> newNode = new HashNode<>(key, value, hashcode);

        // head could be pointing to a list, so we need
        // to loop over the potential list and insert a
        // new node at the end.
        if (head == null) {
            bucketArray.set(index, newNode);
            size++;
        } else { // TODO: 5/11/22 We need to check for duplicate keys
            /////////////
            if (!head.getKey().equals(key)){
            // this is logic from classmate
            newNode.setNext(head.getNext());
            head.setNext(newNode);
            size++;
            }
        }

        // If load factor goes beyond threshold, then
        // double hash table size
        if ((1.0 * size) / buckets >= 0.7) {
            ArrayList<HashNode<K, V> > temp = bucketArray;
            bucketArray = new ArrayList<>();
            buckets = 2 * buckets;
            size = 0;
            for (int i = 0; i < buckets; i++)
                bucketArray.add(null);

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    put(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
    }

    public V get(K key){
        // Find head of chain for given key
        int bucketIndex = getBucketIndex(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // Search key in chain
        while (head != null) {
            if (head.getKey().equals(key))
                return head.getValue();
            head = head.getNext();
        }

        // If key not found
        return null;
    }

    public boolean contains(K key){
        int bucketIndex = getBucketIndex(key);
        int hashCode=hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);
        // Search key in chain
        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode().equals(hashCode))
               return true;
            head = head.getNext();
        }

        return false;
    }

    public List<K> Keys(){
        List<K> keyList=new ArrayList<>();

        HashNode<K, V> head ;
        for (int index = 0; index < bucketArray.size(); index++) {
            if(bucketArray.get(index)!=null){
                head = bucketArray.get(index);
                while (head!=null){
                    keyList.add(head.getKey());
                    head = head.getNext();
                }
            }

        }

        return keyList;
    }

    //////////////////////////////////////////////////// challenge 31 //////////////////////////////////

    public String repeatedWord(String string){

        HashMap<String,Integer> hashMap=new HashMap<>();

        string=string.toLowerCase(Locale.ROOT);
        String[] words=string.split(" ");

        for (int i = 0; i < words.length; i++) {
            String item=words[i].toLowerCase(Locale.ROOT);
            String checkedWord=check(item);
            if (!hashMap.contains(checkedWord)){
                hashMap.put(checkedWord,1);
            }else {
                return checkedWord;
            }
        }
        return "no duplicate value";
    }

    public String check(String word){
        if(word.contains(",") || word.contains("/") || word.contains(":") || word.contains(".") || word.contains(" ") || word.contains("?") ){
            word=word.substring(0,word.length()-1);
        }
        return word;
    }


}













