package ru.geekbrains.lesson1_J2;

import java.util.*;

public class PhoneBook {
    private Map<String, ArrayList<String>> phoneBook = new TreeMap<>();

    private void add(String secondName, String phoneNumber) {
        ArrayList<String> numberList = phoneBook.get(secondName);
        if (numberList == null){
            numberList = new ArrayList<>();
        }
        numberList.add(phoneNumber);
        phoneBook.put(secondName, numberList);
    }

    private ArrayList<String> getPhoneNumber(String secondName){
        return phoneBook.get(secondName);
    }

    private void info(){
        System.out.println(phoneBook);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("\nЕмельянов","89221366780");
        phoneBook.add("\nЕмельянов","89221366781");
        phoneBook.add("\nВахрушева","89221366782");
        phoneBook.add("\nПетров","89221366783");
        phoneBook.add("\nСидоров","89221366784");

        phoneBook.info();

        System.out.println("Номера телефона(ов): " + phoneBook.getPhoneNumber("\nЕмельянов"));
    }
}
