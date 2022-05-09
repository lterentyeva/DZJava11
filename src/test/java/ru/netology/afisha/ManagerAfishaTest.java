package ru.netology.afisha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerAfishaTest {
    String first = "Movie 1";
    String second = "Movie 2";
    String third = "Movie 3";
    String fourth = "Movie 4";
    String fifth = "Movie 5";
    String sixth = "Movie 6";
    String seventh = "Movie 7";
    String eighth = "Movie 8";
    String ninth = "Movie 9";
    String tenth = "Movie 10";
    String eleventh = "Movie 11";


    @Test
    void shouldAddMovie() {
        ManagerAfisha manager = new ManagerAfisha();

        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);

        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7", "Movie 8", "Movie 9", "Movie 10", "Movie 11"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldFindLast() {
        ManagerAfisha manager = new ManagerAfisha();
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);

        String[] expected = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast5Movie() {
        ManagerAfisha manager = new ManagerAfisha(5);

        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);

        String[] expected = {"Movie 11", "Movie 10", "Movie 9", "Movie 8", "Movie 7"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAll() {
        ManagerAfisha manager = new ManagerAfisha();

        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);


        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7", "Movie 8", "Movie 9", "Movie 10"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

}