package com.netcracker.horstmannbigjava.ch3.p3_6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Person {
    String name;
    Set<Person> friends;

    public Person(String name) {
        this.name = name;
        friends = new HashSet<>();
    }

    public void beFriend(Person p) {
        friends.add(p);
    }

    public void unFriend(Person p) {
        friends.remove(p);
    }

    public String getName() {
        return name;
    }

    public String getFriendNames() {
        StringBuilder stringNames = new StringBuilder();
        Iterator<Person> myFriends = friends.iterator();
        while (myFriends.hasNext()) {
            stringNames.append(myFriends.next().getName());
            stringNames.append(" ");
        }

        String strWithFriendNames = "Dima has " + getFriendCount() + " friends: " + stringNames.toString();
        String strWithoutFriendNames = this.name + " has not friends";

        return !friends.isEmpty() ? strWithFriendNames : strWithoutFriendNames;
    }

    public int getFriendCount() {
        return friends.size();
    }
}
