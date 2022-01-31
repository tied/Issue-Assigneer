package ru.pestov.alexey.plugins.spring.service;

import ru.pestov.alexey.plugins.spring.comparators.TypeChangesComparator;
import ru.pestov.alexey.plugins.spring.entity.SystemCAB;

import java.util.Collections;

public class TypeChangeService  {
    public static void sort (SystemCAB systemCAB)   {
        Collections.sort(systemCAB.getTypeChanges(),new TypeChangesComparator());
    }
}
