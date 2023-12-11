package aula1introducao;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        // Classes
        // Elas nao tem construtores, nem vazios por isso nao usa o new
        // Imutavel - precisa de uma nova variavel para armazenar
        // Sistema de chainning pode encader uma função em outra
        // Valores inválidos dão erro

        // LocalDate - data local
        System.out.println("LocalDate:");
        LocalDate date1 = LocalDate.now();
        System.out.println("Data local: " + date1);
        LocalDate date2 = LocalDate.of(1994, Month.JANUARY, 29);
        System.out.println("Data local criada atraves LocalDate.of(): " + date2);
        LocalDate date3 = date2.minusYears(1);
        System.out.println("LocalDate.of() - 1 ano: " + date3);

        System.out.println("---------------------------------------------------");

        // LocalTime - hora local
        System.out.println("LocalTime:");
        LocalTime hour1 = LocalTime.now();
        System.out.println("Hora local: " + hour1);
        LocalTime hour2 = LocalTime.of(9, 57, 30);
        System.out.println("Data local criada atraves LocalTime.of(): " + hour2);

        System.out.println("---------------------------------------------------");

        // LocalDateTime - data hora e local
        System.out.println("LocalDateTime:");
        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println("Data e hora local: " + dateTime1);
        LocalDateTime dateTime2 = LocalDateTime.of(date2, hour2);
        System.out.println("Data local criada atraves LocalDateTime.of(): " + dateTime2);

        System.out.println("---------------------------------------------------");

        // Instant - hora global calculada em millisegundos fuso horário apenas UTC/GMT
        // Operações so podem trabalhar com dias
        System.out.println("Instant:");
        Instant dateTimezone1 = Instant.now();
        System.out.println("Data e hora local e fuso horário (apenas GMT,UTC, Zulu): " + dateTimezone1);
        Instant dateTimezone2 = Instant.ofEpochMilli(759855895000L);
        System.out.println("Data e hora local e fuso horário a partil do Instant.ofEpochMilli(786294295000L): " + dateTimezone2);

        System.out.println("---------------------------------------------------");

        // ZonedDateTime - Armazena data hora e fuso horário
        System.out.println("ZonedDateTime:");
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Data e hora local e fuso horário (em fuso horario especifico): " + zonedDateTime);
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(dateTime2, ZoneId.of("America/Montevideo"));
        System.out.println("Data e hora local e fuso horário (em fuso horario especifico):" + zonedDateTime2);
    }
}