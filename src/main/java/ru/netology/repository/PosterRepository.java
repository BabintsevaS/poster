package ru.netology.repository;

import ru.netology.domain.PosterItem;

public class PosterRepository {

    private PosterItem[] items = new PosterItem[0];

    public void save(PosterItem item) {
        int length = items.length + 1;
        PosterItem[] tmp = new PosterItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PosterItem[] getAll() {
        return items;
    }

    public void removeById(int id) {
        int length = items.length - 1;
        PosterItem[] tmp = new PosterItem[length];
        int index = 0;
        for (PosterItem item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

    public void removeAll() {
        PosterItem[] tmp = new PosterItem[0];
        items = tmp;
    }

    public PosterItem[] findById(int id) {
        PosterItem[] tmp = new PosterItem[1];
        for (PosterItem item : items) {
            if (item.getId() == id) {
                tmp[0] = item;
                items = tmp;
                break;
            }
        }
        return items;
    }
}
