package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class TicketItem {
    private int id;
    private int cost;
    private String departureAirport;
    private String arrivalAirport;
    private int flightTime;


}
