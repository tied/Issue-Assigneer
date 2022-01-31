package ru.pestov.alexey.plugins.spring.comparators;

import ru.pestov.alexey.plugins.spring.entity.Stage;

import java.util.Comparator;

public class StageComparator implements Comparator<Stage> {

    @Override
    public int compare(Stage o1, Stage o2) {
        if (o2.getName().equals("authorize"))   {
            return -1;
        }
        if (o1.getName().equals("authorize"))   {
            return 1;
        }
        return o1.getName().compareTo(o2.getName());
    }
}
