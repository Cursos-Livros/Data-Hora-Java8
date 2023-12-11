package aula4formatacaoparse;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // Formatar novas classes Data e Hora
        // DatetimeFormatter sem fuso horario
        System.out.println("Formatação para exibir para o usuário final com fuso horario: ofLocalizedDateTime");
        DateTimeFormatter isoDateTime = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        String formatDateTime = isoDateTime.format(now);
        System.out.println("String formatada ISO8601: " + formatDateTime);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        // DatetimeFormatter com fuso horario
        System.out.println("Formatação para exibir para o usuário final com fuso horario: ofLocalizedDateTime");
        ZonedDateTime now2 = ZonedDateTime.now();
        DateTimeFormatter isoDateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter isoDateTimeFormatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL); // FULL funciona com Zoned date time apenas
        String formatDateTime2 = isoDateTimeFormatter.format(now2);
        String formatDateTime3 = isoDateTimeFormatter2.format(now2);
        System.out.println("String formatada ISO8601 com fuso horario curta: " + formatDateTime2);
        System.out.println("String formatada ISO8601 com fuso horario longa: " + formatDateTime3);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        // Formatter - formatar com formatador personalizado
        LocalDateTime now3 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
        System.out.println("\"String formatada ISO8601 com fuso horario e formatador personalizado: " + formatter.format(now3));

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        // Parse
        System.out.println("Parser de Data:");
        TemporalAccessor parser = formatter.parse(formatter.format(now3));
        System.out.println(parser);
        LocalDateTime from = LocalDateTime.from(parser);
        System.out.println(from);
    }
}
