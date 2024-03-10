package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args){
        ex1();

    }
    public static void ex1(){
        HashMap<String,String> contacts = new HashMap<>();   // hash map follow the key and value pair
        contacts.put("preet","preet98728@gmail.com");
        contacts.put("kanu","kanu@gmail.com");
        System.out.println(contacts.get("preet"));
        System.out.println(contacts.containsKey("preet"));
        System.out.println(contacts.containsValue("preet98728@gmail.com"));

        for(Map.Entry<String,String> entry:contacts.entrySet()){
            System.out.println("key:"+ entry.getKey() +"Value:" +entry.getValue());
        }

        HashMap<String,Person> people =new HashMap<>();

        Person person1 =new Person(3,"John","Deo","Preet98728@gmail.com");
        Person person2 =new Person(1,"Agam","Athi","agamathi@gmail.com");
        Person person3 =new Person(2,"Kanu","Athi","Kanu@gmail.com");


        people.put(person1.getEmail(),person1);
        people.put(person2.getEmail(),person2);
        people.put(person3.getEmail(), person3);

        System.out.println(people.get("Preet98728@gmail.com"));


    }
}


