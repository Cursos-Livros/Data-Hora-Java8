package aula3escolhas;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        // Instant - so milliseconds não é ideal para operações de data
        Instant now = Instant.now();

        //now.plus(5, ChronoUnit.MONTHS);

        // Operações melhor com fuso horario ZoneDateTime
        ZonedDateTime nowZoned = now.atZone(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Instant convertido em Zoned Date Time: " + nowZoned);

        //
    }
}
