package ru.netology.manager;

import ru.netology.domain.PosterItem;
import ru.netology.repository.PosterRepository;

public class PosterManager {

    int films = 10;

    private PosterRepository repository;

    public PosterManager(PosterRepository repo){
        repository = repo;
    }

       public PosterItem[] getAllInverse(){
        PosterItem[] saved = repository.getAll();
        PosterItem[] ans = new PosterItem[saved.length];
        for (int i = 0; i < ans.length; i++){
            ans[i] = saved[saved.length - i - 1];
        }
        return ans;
    }

    public PosterItem[] getLast(){
        PosterItem[] saved = getAllInverse();
        int resultLength = getAllInverse().length;
        if (resultLength > films) {
            resultLength = films;
            PosterItem[] result = new PosterItem[films];
            System.arraycopy(saved, 0, result, 0, resultLength );
            return result;
        }
        PosterItem[] result2 = new PosterItem[resultLength];
        System.arraycopy(saved, 0, result2, 0, resultLength );
        return result2;
    }
}



