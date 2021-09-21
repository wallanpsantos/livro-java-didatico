package com.br.livrojavadidatico.tempos;

import javax.swing.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Agendamentos {

    /* http://www.mballem.com/post/agendamento-de-tarefas-com-timertask/ */

    private static int count = 0;

    public static void main(String[] args) {
        Agendamentos a = new Agendamentos();
        a.terceiraTarefa();
    }

    /*
    private void primeiraTarefa() {
        final Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Counting " + (++count) + " Time: " + new Date());
                new Execucoes().tabuada(count);
                if (count == 5) {
                    t.cancel();
                }
            }

        }, 5000, 3000);
    }

    private void segundaTarefa() {
        Calendar data = Calendar.getInstance();
        // 2011 - ano
        // 4 - m�s (janeiro equivale a 0, fevereiro a 1, ..., dezembro a 11)
        // 30 - dia
        data.set(2020, 1, 19);

        final Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Counting " + (++count) + " Time: " + new Date());
                new Execucoes().tabuada(count);
                t.cancel();
            }

        }, data.getTime());
    }
    */
    private void terceiraTarefa() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 21);
        c.set(Calendar.MINUTE, 34);
        c.set(Calendar.SECOND, 30);

        Date time = c.getTime();

        final Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null, "Ol�");
                System.out.println("Counting " + (++count) + " Time: " + new Date());
                new Execucoes().tabuada(count);
                t.cancel();
            }

        }, time);
    }
}
