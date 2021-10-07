package com.touro.cs.mco264;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @org.junit.jupiter.api.Test
    void size0() {
        MyArrayList mal = new MyArrayList();
        assertEquals(0, mal.size());
    }

    @org.junit.jupiter.api.Test
    void size1() {
        MyArrayList mal = new MyArrayList();
        mal.add("A");
        assertEquals(1, mal.size());
    }
    @org.junit.jupiter.api.Test
    void addWithResize() {
        MyArrayList mal = new MyArrayList();
        for (int i=0;i<11;i++)
            mal.add("A");
        assertEquals(11, mal.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
    }

    @org.junit.jupiter.api.Test
    void add() {
    }

    @org.junit.jupiter.api.Test
    void clear() {
    }

    @org.junit.jupiter.api.Test
    void get() {
    }

    @org.junit.jupiter.api.Test
    void set() {
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
    }

    @org.junit.jupiter.api.Test
    void remove() {
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
    }
}