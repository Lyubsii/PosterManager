package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test
    public void Test() {
        Manager manager = new Manager();

        manager.addMovie("Bloodshot");
        manager.addMovie("Go");
        manager.addMovie("Hotel Belgrade");
        manager.addMovie("The Invisible Man");
        manager.addMovie("Trolls. World Tour");
        manager.addMovie("Number One");

        String[] expected = {"Bloodshot", "Go", "Hotel Belgrade", "The Invisible Man", "Trolls. World Tour", "Number One"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void movieTst2() {
        Manager manager = new Manager();

        manager.addMovie("Bloodshot");
        manager.addMovie("Go");
        manager.addMovie("Hotel Belgrade");
        manager.addMovie("The Invisible Man");
        manager.addMovie("Trolls. World Tour");
        manager.addMovie("Number One");

        String[] expected = {"Bloodshot", "Go", "Hotel Belgrade", "The Invisible Man", "Trolls. World Tour", "Number One"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}
