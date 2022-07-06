package com.example.consoler.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Animal {
    private String kind;
    private String breed;
    private String nickName;
    private int age;
}
