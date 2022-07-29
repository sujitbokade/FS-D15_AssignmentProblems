package com.bridgelabz.hashtable;

public class HashMapTest {
    public static void main(String[] args) {
        String sentence="To be or not to be";

        MyHashTable<String,Integer> hashTable = new MyHashTable<>();
        String[] splitArray = sentence.toLowerCase().split(" ");
        for (String word:splitArray) {
            if(hashTable.containsKey(word)){
                int count =  hashTable.get(word);
                hashTable.replace(word,count+1);
            }
            else{
                hashTable.put(word,1);
            }
        }
        hashTable.print();
    }
}

