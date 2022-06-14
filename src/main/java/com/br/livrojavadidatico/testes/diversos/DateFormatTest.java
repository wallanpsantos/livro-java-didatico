package com.br.livrojavadidatico.testes.diversos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

    public static void main(String[] args) {
        Date date = new Date();
        DateFormat modeloPrePronto = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat formatoManual = new SimpleDateFormat("EEEE, dd " + "'de'" + " MMMM " + "'de'" + " yyyy " + "'às'" + " hh:mm a ");

        // Exemplo saída: terça-feira, 21 de setembro de 2021
        System.out.println(modeloPrePronto.format(date.getTime()));

        /**
         * Exemplo saída: terça-feira, 21 de setembro de 2021 às 03:01 PM
         * EEE -> terça-feira
         * dd -> dia
         * MMMM -> Nome completo do mês
         * yyyy -> ano com quarto digitos
         * hh:mm -> hora:minutos
         * a -> AM ou PM
         */
        System.out.println(formatoManual.format(date.getTime()));

        /**
         * TRABALHANDO COM CALENDAR PARA IDENTIFICAÇÃO DAS PROPRIEDADES DE UMA DATA
         * E REALIZAÇÃO DE CALCULOS
         */
        Date novaData = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(novaData);

        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE));
        System.out.println("Dia decorrido do ano: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Semana em relação ao ano corrente: " + calendar.get(Calendar.WEEK_OF_YEAR));

        System.out.println("\nSujeira: " + calendar.getTime());
        calendar.clear();
        System.out.println("Limpo: " + calendar.getTime());
        System.out.println("Retorna 1 no Brasil que é igual a Calendar.SUNDAY.... " + calendar.getFirstDayOfWeek());

        /**
         * Calculando um determinado periodo de tempo
         *
         */
        LocalDate inicio = LocalDate.of(1822, Month.SEPTEMBER, 7);
        LocalDate fim = LocalDate.now();
        Period periodo = Period.between(inicio, fim);

        // Exemplo da Saída: Tempo decorrido: 199 anos 0 meses 14 dias
        System.out.println("Tempo decorrido: " +
                periodo.getYears() + " anos " +
                periodo.getMonths() + " meses " +
                periodo.getDays() + " dias "
        );

        /**
         * Formatação simples de DATA e HORA com DateTimeFormatter e LocalDateTime
         */
        DateTimeFormatter formatacaoSimples = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        DateTimeFormatter formatacaoPorLocale = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                .withLocale(new Locale("pt", "br"));
        LocalDateTime localDateTime = LocalDateTime.now();

        // Exemplo Saída: Data e Hora formatada: 21/09/2021 09:51:55
        System.out.println("Data e Hora formatada: " + localDateTime.format(formatacaoSimples));

        // Exemplo Saída: Data e Hora formatada para pt-br: 21/09/2021 21:55
        System.out.println("Data e Hora formatada para pt-br: " + localDateTime.format(formatacaoPorLocale));

        /**
        * Diferença de Datas em dias usando java.time.temporal.ChronoUnit
        */
        LocalDate venc = LocalDate.of(2022, 10, 27);
        LocalDate atual = LocalDate.of(2022, 9, 1);

        // Exemplo Saída: Diferença em dias -> 56     
        System.out.println("Diferença em dias -> " + ChronoUnit.DAYS.between(atual, venc));
    }
}
