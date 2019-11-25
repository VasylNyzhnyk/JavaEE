package com.company.HomWork.Parlament;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Deputat extends Person {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int i = Integer.parseInt(reader.readLine());
    String LastName;
    String Name;
    int age;
    boolean bribe;

    public Deputat(String lastName, String name, int age) throws IOException {
        LastName = lastName;
        Name = name;
        this.age = age;
    }

    public String getLastName() {
        return LastName;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public boolean isBribe() {
        return bribe;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBribe(boolean bribe) {
        this.bribe = bribe;
    }

    public static boolean giveBride() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (false) {
            System.out.println("Цей депутат не бере хабарів");
        } else {
            System.out.println("Введіть суму хабаря....");
            int i = Integer.parseInt(reader.readLine());
            if (i >= 5000) {
                System.out.println("Мабуть, поліція увязнить депутата... ");

            }
        }
        return true;
    }
}
