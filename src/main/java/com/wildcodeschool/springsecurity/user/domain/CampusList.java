package com.wildcodeschool.springsecurity.user.domain;

import java.util.Arrays;
import java.util.List;

public class CampusList {
    public List<String> campusList(){
        List<String> wildCampus = Arrays.asList("Toulouse", "Paris", "Lyon", "Nantes", "Bordeaux", "Lille");
        return wildCampus;
    }
}
