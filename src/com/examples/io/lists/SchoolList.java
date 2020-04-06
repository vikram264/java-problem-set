package com.examples.io.lists;

import java.util.ArrayList;
import java.util.List;

public class SchoolList {

    protected List<String> schools;

    protected void setupSchools() {
        schools = new ArrayList<>();
        schools.add("school1");
        schools.add("school2");
        schools.add("school3");
    }

    public void printSchools () {
        schools.forEach(school -> {
            System.out.println(school);
        });
    }


}
