package ru.netology;


public class Main {

    public static void main(String[] args) {

        Person father = new PersonBuilder()
                .setName("Anakin")
                .setSurname("Skywalker")
                .setAge(44)
                .setAddress("Space")
                .build();
        Person son = father.newChildBuilder()
                .setName("Luke")
                .setSurname("Skywalker")
                .setAddress("Tatooine")
                .setAge(23)
                .build();
        System.out.println(son);
        System.out.println("The " + son.name + " " + son.surname +
                " son of Anakin Skywalker, also known as " + father.name + " " + father.surname);

        try {
            Person Teacher = new PersonBuilder()
                    .setName("Yoda")
                    .setAge(900)
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
// missing required fields
        try {
            Person mainEnemy = new PersonBuilder()
                    .setName("Darth")
                    .setSurname("Vader")
                    .setAge(-44)
                    .build();
// age invalid range
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}