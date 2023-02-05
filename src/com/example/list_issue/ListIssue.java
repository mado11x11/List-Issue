package com.example.list_issue;

import java.util.*;

public class ListIssue {
    public static void main(String[] args) {
        List<String> pokemonList = new ArrayList<>();

        pokemonList.add("ピカチュウ");
        pokemonList.add("プリン");
        pokemonList.add("ヤドン");

        System.out.println(pokemonList.size());
        for(String pokemon : pokemonList){
            System.out.println(pokemon);
        }

        Map<String,String> pokemonMap = new HashMap<>();
        pokemonMap.put("ピカチュウ","電気");
        pokemonMap.put("プリン","ノーマル");
        pokemonMap.put("ゼニガメ","水");

        System.out.println(pokemonMap.get("ピカチュウ"));
        System.out.println(pokemonMap.get("プリン"));
        System.out.println(pokemonMap.get("ピカチュウ"));

        for(String pokemon : pokemonMap.values()){
            System.out.println(pokemon);
        }

        try{
            System.out.println(pokemonList.get(4));
        }catch (Exception e){
            System.out.println("失敗");
        }
    }
}
