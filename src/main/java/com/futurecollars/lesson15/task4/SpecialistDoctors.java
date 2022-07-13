package com.futurecollars.lesson15.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialistDoctors {

    private final List<String> doctorsSpecializations;

    public SpecialistDoctors() {
        this.doctorsSpecializations = new ArrayList<>(List.of("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra",
                "Przychodnia:Pediatra", "Przychodnia:Internista:Laryngolog:Pediatra"));
    }

    public List<String> getSpecialization() {
        return doctorsSpecializations
                .stream()
                .map(o1 -> o1.split(":"))
                .flatMap(Arrays::stream)
                .filter(x -> !x.contains("Szpital") && !x.contains("Przychodnia"))
                .distinct()
                .collect(Collectors.toList());
    }

}
