package com.futurecollars.lesson15.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class CinemaHallService {

    private final List<CinemaHall> cinemaHallList;

    public CinemaHallService() {
        CinemaHall cinemaHallRelax = new CinemaHall("Relax", CinemaHallType.TYPE_4D);
        CinemaHall cinemaHallHelios = new CinemaHall("Helios", CinemaHallType.TYPE_3D);
        CinemaHall cinemaHallLuna = new CinemaHall("Luna", CinemaHallType.TYPE_2D);
        CinemaHall cinemaHallMultikino = new CinemaHall("Multikino", CinemaHallType.TYPE_4D);
        CinemaHall cinemaHallImax = new CinemaHall("Imax", CinemaHallType.TYPE_2D);
        CinemaHall cinemaHallCity = new CinemaHall("City", CinemaHallType.TYPE_3D);
        CinemaHall cinemaHallCapitol = new CinemaHall("Capitol", CinemaHallType.TYPE_4D);
        CinemaHall cinemaHallBogoria = new CinemaHall("Bogoria", CinemaHallType.TYPE_3D);
        CinemaHall cinemaHallPerla = new CinemaHall("Perla", CinemaHallType.TYPE_3D);
        CinemaHall cinemaHallStudio = new CinemaHall("Studio", CinemaHallType.TYPE_2D);
        cinemaHallList = new ArrayList<>(List.of(cinemaHallRelax, cinemaHallHelios,
                cinemaHallLuna, cinemaHallMultikino, cinemaHallImax, cinemaHallCity,
                cinemaHallCapitol, cinemaHallBogoria, cinemaHallPerla, cinemaHallStudio));
    }

    public Map<CinemaHallType, Long> groupByType() {
        return cinemaHallList
                .stream()
                .collect(groupingBy(CinemaHall::getCinemaHallType, Collectors.counting()));
    }

}
