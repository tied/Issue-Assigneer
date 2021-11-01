package ru.pestov.alexey.plugins.spring.entity;

import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@RequiredArgsConstructor
public class SystemCAB {

    @NonNull
    private String name;
    private List<TypeChange> typeChanges = new ArrayList<>();

    public void addType(TypeChange typeChange)  {
        typeChanges.add(typeChange);
    }
}
