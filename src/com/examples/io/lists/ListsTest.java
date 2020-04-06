package com.examples.io.lists;

public class ListsTest extends SchoolList {

    public void updateSchool() {
        schools.add("school 4");
        schools.add("school 5");
        schools.add("school1");
        schools.add("school2");
        schools.add("school3");
    }


    public static void main(String[] args) {
        ListsTest listsTest = new ListsTest();
        listsTest.setupSchools();
        listsTest.printSchools();
        System.out.println();
        listsTest.updateSchool();
        System.out.println();
        listsTest.printSchools();

    }


}
