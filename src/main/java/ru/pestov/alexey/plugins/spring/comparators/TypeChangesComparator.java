package ru.pestov.alexey.plugins.spring.comparators;

import ru.pestov.alexey.plugins.spring.entity.TypeChange;

import java.util.Comparator;

public class TypeChangesComparator implements Comparator<TypeChange> {
    @Override
    public int compare(TypeChange o1, TypeChange o2) {
        return o1.getName().compareTo(o2.getName());
    }
}