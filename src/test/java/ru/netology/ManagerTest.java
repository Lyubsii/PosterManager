package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test
    public void addMovieTest() {
        Manager manager = new Manager();

        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");


        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneMovieTest() {
        Manager manager = new Manager();

        manager.addMovie("Film1");

        String[] expected = {"Film1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovieTest() {
        Manager manager = new Manager();

        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");


        String[] expected = {"Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }






}
