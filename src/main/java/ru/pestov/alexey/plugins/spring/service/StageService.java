package ru.pestov.alexey.plugins.spring.service;

import ru.pestov.alexey.plugins.spring.comparators.StageComparator;
import ru.pestov.alexey.plugins.spring.entity.TypeChange;

import java.util.Collections;

public class StageService {
    public static void sort(TypeChange typeChange)  {
        Collections.sort(typeChange.getStages(), new StageComparator());
    }
}
