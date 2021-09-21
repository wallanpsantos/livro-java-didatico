package com.br.livrojavadidatico.testes.diversos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    }
}
