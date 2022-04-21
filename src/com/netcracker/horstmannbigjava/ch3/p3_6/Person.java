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
        return !friends.isEmpty() ? "Dima has " + getFriendCount() + " friends: " +
                stringNames.toString() : this.name + " has not friends";
    }

    public int getFriendCount() {
        return friends.size();
    }
}
