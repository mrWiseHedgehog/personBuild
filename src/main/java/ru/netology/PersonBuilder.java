package ru.netology;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) throws IllegalArgumentException{
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Error: enter your name");
        } else {
            this.name = name;
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) throws IllegalArgumentException{
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Error: enter your surname");
        } else {
            this.surname = surname;
        } return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException{
        if (age < 0) {
            throw new IllegalArgumentException("Error: age must be greater than 0");
        } else {
            this.age = age;
        } return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalArgumentException{
        Person person;
        if (name == null || name.isEmpty() || surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Error: The minimum value must be passed");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Error: age must be greater than 0");
        } else person = new Person(name, surname, age);
        person.setAddress(address);
        return person;
    }

}