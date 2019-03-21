package ru.geekbrains.lesson1_J2;
//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//   Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//   Посчитать сколько раз встречается каждое слово.
//2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
//   В этот телефонный справочник с помощью метода add() можно добавлять записи.
//   С помощью метода get() искать номер телефона по фамилии.
//   Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//   тогда при запросе такой фамилии должны выводиться все телефоны.

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> worldArray = new ArrayList<>();
        worldArray.add("груша");
        worldArray.add("яблоко");
        worldArray.add("слива");
        worldArray.add("груша");
        worldArray.add("апельсин");
        worldArray.add("манго");
        worldArray.add("яблоко");
        worldArray.add("виноград");
        worldArray.add("груша");
        worldArray.add("манго");
        worldArray.add("апельсин");
        worldArray.add("апельсин");

        System.out.println(worldArray);
        LinkedHashSet<String> hs = new LinkedHashSet<>(worldArray);
        System.out.println(hs);

        int counter = 0;
        int i;

        for(String str:hs){
            for(i=0;i< worldArray.size();i++){
                if (str.equals(worldArray.get(i))) {
                    counter++;
                }
            }
            System.out.println(str+" : "+counter);
            counter = 0;
        }
    }
}

