package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String[]> dictionary = new HashMap<>();
        dictionary.put("дом", new String[]{"жилище", "хата", "берлога", "крыша"});
        dictionary.put("ручка", new String[]{"рука", "дверная ручка", "детская ручка"});
        dictionary.put("красивый", new String[]{"привлекательный", "превосходный", "шикарный", "Фантастический"});
        dictionary.put("человек", new String[]{"сапиенс", "персона", "индивид", "личность"});


        for (Map.Entry<String, String[]> item : dictionary.entrySet()) {
            System.out.println(item.getKey() + " - " + Arrays.toString(item.getValue()));
        }

        System.out.println("_________________________");


        HashMap<String, String[]> dictionary1 = new HashMap<>();
        dictionary1.putAll(dictionary);


        Set<String> keys = dictionary.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();

            for (int i = 0; i < dictionary.get(key).length; i++) {
                ArrayList<String> array = new ArrayList<>();
                Collections.addAll(array, dictionary.get(key));
                String temp = array.get(i);
                array.set(i, key);
                String[] a1 = new String[array.size()];

                for (int j = 0; j < array.size(); j++) {
                    a1[j] = array.get(j);
                }
                dictionary1.put(temp , a1);
            }
        }


        for (Map.Entry<String, String[]> print : dictionary1.entrySet()) {
            System.out.println(print.getKey() + " - " + Arrays.toString(print.getValue()));
        }
    }
}

