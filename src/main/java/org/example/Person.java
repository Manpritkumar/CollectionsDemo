package org.example;

import java.util.Objects;

public class Person implements Comparable<Person> {   //impliment comparable method to make the sorting in order.

    private int id;
    private String firstName;

    private String Lastname;

    private String email;

    public Person(int id, String firstName, String lastname, String email) {
        this.id = id;
        this.firstName = firstName;
        Lastname = lastname;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(Lastname, person.Lastname) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, Lastname, email);
    }

    @Override
    public int compareTo(Person person) {   // method to sort out i the order for person list.
        if(id > person.getId()){
            return 1;
        } else if (id < person.getId()) {
          return -1;
        }
        return 0;
    }
}

