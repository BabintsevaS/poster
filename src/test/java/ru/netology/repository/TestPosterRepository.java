package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;

public class TestPosterRepository {
    private PosterRepository posterRepository;
    private PosterItem first;
    private PosterItem second;
    private PosterItem third;
//    private PosterItem forth = new PosterItem(4, 4, "Gentlemen", 5);
//    private PosterItem fifth = new PosterItem(5, 5, "Invisible", 5);
//    private PosterItem sixth = new PosterItem(6, 6, "Trolls", 5);
//    private PosterItem seventh = new PosterItem(7, 7, "Number One", 5);
//    private PosterItem eighth = new PosterItem(8, 8, "Run", 5);
//    private PosterItem ninth = new PosterItem(9, 9, "Batman", 5);
//    private PosterItem tenth = new PosterItem(10, 10, "Friends", 5);
//    private PosterItem eleventh = new PosterItem(11, 11, "Godzilla", 5);
//    private PosterItem twelfth = new PosterItem(1, 1, "Terminator", 5);


    @BeforeEach
    public void setUp(){
        posterRepository = new PosterRepository();
        first = new PosterItem(1, 1, "Bloodshot", 5);
        second = new PosterItem(2, 2, "Forward", 5);
        third = new PosterItem(3, 3, "Hotel", 5);

        posterRepository.save(first);
        posterRepository.save(second);
        posterRepository.save(third);
    }

    @Test
    public void shouldSaveItem(){

        PosterItem[] expected = {first, second, third};
        PosterItem[] actual = posterRepository.getAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById(){

        posterRepository.removeById(1);

        PosterItem[] expected = {second, third};
        PosterItem[] actual = posterRepository.getAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAll(){

        posterRepository.removeAll();

        PosterItem[] expected = {};
        PosterItem[] actual = posterRepository.getAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindById(){

        posterRepository.findById(2);

        PosterItem[] expected = {second};
        PosterItem[] actual = posterRepository.findById(2);

        Assertions.assertArrayEquals(expected, actual);
    }
}
