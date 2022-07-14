package com.futurecollars.lesson15.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> doctorsSpecializations = new ArrayList<>(List.of("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra",
                "Przychodnia:Pediatra", "Przychodnia:Internista:Laryngolog:Pediatra"));
        SpecialistDoctors.getSpecialization(doctorsSpecializations);
    }

}
