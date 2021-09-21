package com.br.livrojavadidatico.atividade_cap_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MeusArrays {
    public static void main(String[] args) {
        Integer[] x = {1, 2, 3, 4, 5, 6};
        Integer[] y = {1, 3, 5, 9, 11, 29};
        Integer numero = 20;

        // O numero est� localizado em 0 Arrays!
        System.out.println("O numero est� localizado em " + localizarNumero(x, y, numero) + " Arrays!");

        // Gere 20 numero(s) randomicamente: [694, 487, 108, 89, 540, 921, 256, 991, 687, 985, 807, 715, 886, 600, 893, 64, 810, 11, 425, 506]
        System.out.println("Gere " + numero + " numero(s) randomicamente: " + Arrays.asList(geradorNumeros(numero)));

    }

    /**
     * Metodo que recebe dois arrays de inteiros e um numero inteiro. Pesquisa o numero informado, se caso existe nos
     * dois arrays retorna 2, se existe apenas em um retorna 1, se n�o retorna 0
     *
     * @param x
     * @param y
     * @param numero
     * @return qtdExistente
     */
    public static Integer localizarNumero(Integer[] x, Integer[] y, Integer numero) {
        List<Boolean> numeroLocalizado = new ArrayList<>();
        int qtdExistente = 0;

        if (Objects.nonNull(numero)) {
            for (Integer n : x) {
                numeroLocalizado.add(n.equals(numero));
            }
            for (Integer n : y) {
                numeroLocalizado.add(n.equals(numero));
            }
            for (Boolean localizado : numeroLocalizado) {
                if (localizado.equals(Boolean.TRUE)) {
                    qtdExistente++;
                }
            }
            return qtdExistente;
        }
        return null;
    }

    /**
     * Metodo gerador de numero entre 0 a 1000 Gera quantidade informada no param
     *
     * @param numero
     * @return numeros - Lista de Numeros
     */
    public static Integer[] geradorNumeros(Integer numero) {
        Integer[] numeros = new Integer[numero];
        final int VALOR_MAXIMO = 1000;
        int contador = 0;

        while (contador < numero) {
            numeros[contador] = (int) (Math.random() * VALOR_MAXIMO);
            contador++;
        }

        return numeros;
    }
}
