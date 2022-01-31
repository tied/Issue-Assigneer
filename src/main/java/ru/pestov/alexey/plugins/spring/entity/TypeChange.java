package ru.pestov.alexey.plugins.spring.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class TypeChange {
    @NonNull
    private String name;
    protected List<Stage> stages = new ArrayList<>();

    public void addStage(Stage stage)   {
        stages.add(stage);
    }
}
