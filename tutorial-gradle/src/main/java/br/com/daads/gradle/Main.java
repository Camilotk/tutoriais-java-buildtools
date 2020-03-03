package br.com.daads.gradle;

import com.google.gson.Gson;

public class Main {
    public static void main(String ...args) {
        Gson gson = new Gson();
        String[] lang = {"Java", "Node", "Kotlin", "JavaScript"};
        String json = gson.toJson(lang);

        System.out.println(json);;
    }
}