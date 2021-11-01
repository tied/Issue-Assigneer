package ru.pestov.alexey.plugins.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Stage {
    private String name;
    private String assignees;
}