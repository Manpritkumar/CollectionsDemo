package org.example;

import java.util.*;

public class ArrayListExamples {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
    }

    public static void ex1() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(100);
        numbers.add(400);
        numbers.add(300);
        numbers.add(200);
        System.out.println(numbers);
        System.out.println("number.size=" + numbers.size());

        System.out.println("access element with index 0 =" + numbers.get(0));
        System.out.println("access element with index 2 =" + numbers.get(2));

        System.out.println("--------------------");

        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            Integer number = numberIterator.next();
            System.out.println(number);
            if (number.equals(400)) {
                numberIterator.remove();
            }
        }

        System.out.println("----for loop-----------");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("-------");

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Annana");
        fruits.add("Banana");
        fruits.add("oragnge");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("-----");

    }

    public static void ex2() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(100);
        numbers.add(400);
        numbers.add(300);
        numbers.add(200);

        System.out.println(numbers.size());
        boolean isRemoved = numbers.remove(Integer.valueOf(100));
        System.out.println("Result=" + isRemoved);

        System.out.println(numbers.size());

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

            System.out.println("-------------------");
        }

    }

    public static void ex3() {

        List<String> euCars = new ArrayList<>();
        euCars.add("Volvo");
        euCars.add("VW");
        euCars.add("volvo");

        List<String> usCars = new ArrayList<>();
        usCars.add("Tesla");
        usCars.add("Ford");

        euCars.addAll(usCars);

        for (String car : euCars)
            System.out.println(car);

        System.out.println("---------");

    }

    private static void ex4() {
        ArrayList<String> orignalList = new ArrayList<>();
        orignalList.add("D");
        orignalList.add("B");
        orignalList.add("A");
        orignalList.add("C");
        orignalList.add("a");

        System.out.println("orignalList.size =" + orignalList.size());

        System.out.println("------Sorting the int value-------------");
    }

    private static void ex5() {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(3);
        numbers.add(1);

        //numbers.sort(null);
        numbers.sort(Collections.reverseOrder());

        System.out.println(numbers);
        System.out.println("------Sorting the Letter value-------------");

    }

    private static void ex6() {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("D");
        letters.add("B");
        letters.add("A");
        letters.add("C");
        letters.add("a");

        Collections.sort(letters);   //[A, B, C, D, a]
       // Collections.sort(letters,String.CASE_INSENSITIVE_ORDER); //[A, a, B, C, D]

        System.out.println(letters);
    }
    private static void ex7(){

        ArrayList<Person> people =new ArrayList<>();

        Person person1 = new Person(3,"John","Deo","Preet98728@gmail.com");
        Person person2 =new Person(1,"Agam","Athi","agamathi@gmail.com");
        Person person3 =new Person(2,"Kanu","Athi","Kanu@gmail.com");

     people.add(person1);
     people.add(person2);
     people.add(person3);
        System.out.println("people.size() =" + people.size());
       // System.out.println(people);
        for (Person person : people)
            System.out.println(person);;

        System.out.println("----------------");

        System.out.println("Sorted list by using natural ordering (id)");
        Collections.sort(people);
        for(Person person: people){
            System.out.println(person);
        }



        }


}
