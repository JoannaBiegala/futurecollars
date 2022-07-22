package com.futurecollars.lesson15.task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialistDoctors {

    public static void getSpecialization(List<String> doctorsSpecializations) {
         doctorsSpecializations
                .stream()
                .map(o1 -> o1.split(":"))
                .flatMap(Arrays::stream)
                .filter(x -> !x.contains("Szpital") && !x.contains("Przychodnia"))
                .distinct()
                .collect(Collectors.toList())
                .forEach((k) -> System.out.print(k + " "));
                }

}
