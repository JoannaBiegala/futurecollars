package com.futurecollars.lesson15.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class CinemaHallService {

    List<CinemaHall> cinemaHallList;
    CinemaHall cinemaHallRelax = new CinemaHall("Relax", CinemaHallType.typ4D);
    CinemaHall cinemaHallHelios = new CinemaHall("Helios", CinemaHallType.typ3D);
    CinemaHall cinemaHallLuna = new CinemaHall("Luna", CinemaHallType.typ2D);
    CinemaHall cinemaHallMultikino = new CinemaHall("Multikino", CinemaHallType.typ3D);
    CinemaHall cinemaHallImax = new CinemaHall("Imax", CinemaHallType.typ4D);
    CinemaHall cinemaHallCity = new CinemaHall("City", CinemaHallType.typ4D);
    CinemaHall cinemaHallCapitol = new CinemaHall("Capitol", CinemaHallType.typ3D);
    CinemaHall cinemaHallBogoria = new CinemaHall("Bogoria", CinemaHallType.typ2D);
    CinemaHall cinemaHallPerla = new CinemaHall("Perla", CinemaHallType.typ3D);
    CinemaHall cinemaHallStudio = new CinemaHall("Studio", CinemaHallType.typ4D);

    public CinemaHallService() {
        cinemaHallList = new ArrayList<>(List.of(cinemaHallRelax, cinemaHallHelios,
                cinemaHallLuna, cinemaHallMultikino, cinemaHallImax, cinemaHallCity,
                cinemaHallCapitol, cinemaHallBogoria, cinemaHallPerla, cinemaHallStudio));
    }

    public void groupByType() {
        Map<CinemaHallType, Long> counting = cinemaHallList
                .stream()
                .collect(groupingBy(CinemaHall::getCinemaHallType, Collectors.counting()));
        System.out.println(counting);
    }

}
