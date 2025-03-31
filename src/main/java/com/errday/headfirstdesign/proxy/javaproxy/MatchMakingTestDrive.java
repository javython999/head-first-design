package com.errday.headfirstdesign.proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTestDrive {

    HashMap<String, Person> inMemoryDatabase = new HashMap<>();

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }


    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    private void drive() {
        Person joe = getPersonFromDatabase("Joe Javabean");
        Person ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setGeekRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getGeekRating());

        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setGeekRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getGeekRating());
    }

    private Person getOwnerProxy(Person person) {
        return getProxy(person, new OwnerInvocationHandler(person));
    }

    private Person getNonOwnerProxy(Person person) {
        return getProxy(person, new NonOwnerInvocationHandler(person));
    }

    private Person getProxy(Person person, InvocationHandler handler) {
        Person proxy = (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                handler
        );

        return proxy;
    }

    private Person getPersonFromDatabase(String name) {
        return inMemoryDatabase.get(name);
    }

    private void initializeDatabase() {
        PersonImpl joe = new PersonImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setGeekRating(7);
        inMemoryDatabase.put(joe.getName(), joe);

        PersonImpl kelly = new PersonImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movie, music");
        kelly.setGeekRating(6);
        inMemoryDatabase.put(kelly.getName(), kelly);
    }


}
