package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample {

    public static void main(String[]args){
        ex1();
        ex2();
    }

    public static void ex1(){

       // HashSet<String> countries = new HashSet<>();
        TreeSet<String> countries = new TreeSet<>();   // its order the all names automatically and not duplicate the items.
        countries.add("Sweden");
        countries.add("Iran");
        countries.add("India");
        countries.add("USA");

        System.out.println(countries);
        System.out.println(countries.size());

    }
    public static void ex2(){
        HashSet<Person> people =new HashSet<>();   //calling th eperson class with their method

        Person person1 = new Person(0,"John","Deo","Preet98728@gmail.com");
        Person person2 =new Person(1,"Agam","Athi","agamathi@gmail.com");
        Person person3 =new Person(2,"Kanu","Athi","Kanu@gmail.com");
        Person person4 =new Person(2,"Kanu","Athi","Kanu@gmail.com");
        Person person5 =new Person(2,"Kanu","Athi","Kanu@gmail.com");
        Person person6 =new Person(2,"Kanu","Athi","Kanu@gmail.com");

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        System.out.println(people.size());


        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
        System.out.println(person4.hashCode());
        System.out.println(person5.hashCode());//should be the same as person3
        System.out.println(person6.hashCode());//should be the same as person3

    }
}
