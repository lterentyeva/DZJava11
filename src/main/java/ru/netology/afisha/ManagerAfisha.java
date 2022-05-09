package ru.netology.afisha;

public class ManagerAfisha {

    private String[] items = new String[0];
    private int maxLimitMovies = 10;

    public ManagerAfisha() {

    }

    public ManagerAfisha(int maxLimitMovies) {
        this.maxLimitMovies = maxLimitMovies;
    }


    public void addMovie(String item) {
        int lenght = items.length + 1;
        String[] tmp = new String[lenght];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public String[] findAll() {
        return items;
    }

    public String[] findLast() {
        int resultLength;
        if (items.length > maxLimitMovies) {
            resultLength = maxLimitMovies;
        } else {
            resultLength = items.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}

