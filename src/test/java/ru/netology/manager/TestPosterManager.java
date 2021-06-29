package ru.netology.manager;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;
import ru.netology.repository.PosterRepository;


public class TestPosterManager {


    @Test
    public void shouldGetAllInverse() {
        PosterRepository posterRepository = new PosterRepository();
        PosterManager manager = new PosterManager(posterRepository);
        PosterItem first = new PosterItem(1, 1, "Bloodshot", 5);
        PosterItem second = new PosterItem(2, 2, "Forward", 5);
        PosterItem third = new PosterItem(3, 3, "Hotel", 5);

        posterRepository.save(first);
        posterRepository.save(second);
        posterRepository.save(third);

        PosterItem[] expected = {third, second, first};
        PosterItem[] actual = manager.getAllInverse();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetLast() {
        PosterRepository posterRepository = new PosterRepository();
        PosterManager manager = new PosterManager(posterRepository);
        PosterItem first = new PosterItem(1, 1, "Bloodshot", 5);
        PosterItem second = new PosterItem(2, 2, "Forward", 5);
        PosterItem third = new PosterItem(3, 3, "Hotel", 5);
        PosterItem forth = new PosterItem(4, 4, "Gentlemen", 5);
        PosterItem fifth = new PosterItem(5, 5, "Invisible", 5);
        PosterItem sixth = new PosterItem(6, 6, "Trolls", 5);
        PosterItem seventh = new PosterItem(7, 7, "Number One", 5);
        PosterItem eighth = new PosterItem(8, 8, "Run", 5);
        PosterItem ninth = new PosterItem(9, 9, "Batman", 5);
        PosterItem tenth = new PosterItem(10, 10, "Friends", 5);
        PosterItem eleventh = new PosterItem(11, 11, "Godzilla", 5);
        PosterItem twelfth = new PosterItem(1, 1, "Terminator", 5);

        posterRepository.save(first);
        posterRepository.save(second);
        posterRepository.save(third);
        posterRepository.save(forth);
        posterRepository.save(fifth);
        posterRepository.save(sixth);
        posterRepository.save(seventh);
        posterRepository.save(eighth);
        posterRepository.save(ninth);
        posterRepository.save(tenth);
        posterRepository.save(eleventh);
        posterRepository.save(twelfth);


        PosterItem[] expected = {twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, forth, third};
        PosterItem[] actual = manager.getLast();

        Assertions.assertArrayEquals(expected, actual);

    }


}
