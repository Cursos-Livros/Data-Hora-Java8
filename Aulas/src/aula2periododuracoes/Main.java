package aula2periododuracoes;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        // Period
        // Trabalha com duração de datas
        System.out.println("Period:");
        Period period = Period.of(1, 5, 0);
        System.out.println("Periodo de 1 ano 5 meses e 0 dias: " + period);

        Period periodDays = Period.ofDays(3);
        System.out.println("Periodo de 3 dias: " + periodDays);

        Period periodWeeks = Period.ofWeeks(4);
        System.out.println("Periodo de 4 semanas: " + periodWeeks);

        Period periodYears = Period.ofYears(5);
        System.out.println("Periodo de 5 anos: " + periodYears);

        LocalDate date1 = LocalDate.of(1994, 01, 29);
        LocalDate date2 = date1.plusYears(1).plusMonths(1).plusDays(29);
        Period periodBetween = Period.between(date1, date2);
        System.out.println("Diferença entre 29/01/1994 01/03/1995: " + periodBetween);

        LocalDate nascimento = LocalDate.of(1994, 01, 29);
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(nascimento, hoje);
        System.out.println("Idade: " + idade);

        System.out.println("-------------------------------------------------------------------------------");

        // Duration
        // Trabalha com duração em horas
        // Hora minuto e segundo

        System.out.println("Duration:");
        Duration durationDays = Duration.ofDays(1);
        System.out.println("Duração 1 dia: " + durationDays);

        Duration durationHours = Duration.ofHours(1);
        System.out.println("Duracao 1 hora: " + durationHours);

        Duration durationMinutes = Duration.ofMinutes(90);
        System.out.println("Duracao 90 minutos: " + durationMinutes);

        Duration durationSeconds = Duration.ofSeconds(30, 1000);
        System.out.println("Duracao 30 segundos e 1000 nanosegundos: " + durationSeconds);

        LocalTime localTime = LocalTime.now();
        LocalTime localtime2 = LocalTime.of(13, 30, 0);
        Duration durationBetween = Duration.between(localTime, localtime2);
        System.out.println("Duracao entre 11:09 e 12:09: " + durationBetween);

        Duration plusMillis = durationBetween.plusMillis(500);
        System.out.println("Add 500 milliseconds ao duration between: " + plusMillis);
    }
}
