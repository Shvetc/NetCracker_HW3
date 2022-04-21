package com.netcracker.horstmannbigjava.ch3;

import com.netcracker.horstmannbigjava.ch3.p3_6.Person;

import java.sql.Array;
import java.util.ArrayList;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Dima");
        printInfoAboutFriends(person);

    }

    static void printInfoAboutFriends(Person person) {
        Person friend1 = new Person("Alex");
        Person friend2 = new Person("Kirill");
        Person friend3 = new Person("Jhon");
        Person friend4 = new Person("Maria");

        Person[] friends = new Person[] {friend1, friend2, friend3, friend4};
        for (int i = 0; i < friends.length; i++) {
            person.beFriend(friends[i]);
        }

        System.out.println(person.getFriendNames());
    }
}
