package com.example.consoler.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Persone {
    private String name;
    private int age;
    private String gender;
}
