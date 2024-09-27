package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    //TODO ↓
    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {
        String bola = "";
        int contador = 0;
        while(true){
            bola = getBall();
            if(bola.equals("azul") && contador == 2){
                break;
            } else if (bola.equals("azul") && contador < 2) {
                contador++;
                System.out.println("La bola es de color: " + bola);
            }else{
                System.out.println("La bola es de color: " + bola);
            }
        }
    }

    //TODO ↓
    // Un método que devuelva una cadena de texto con el color de una pelota (en minúscula). Dicho color se escogerá de
    // manera aleatoria. Se empleará el método randomWithRange(int min, int max) para escoger un número aleatorio, que
    // lo asociaremos al valor de un color de la siguiente manera:
    // 1 → rojo
    // 2 → azul
    // 3 → verde
    public static String getBall() {
        String color ="";
        int valor = randomWithRange(1, 3);
        if(valor == 1){
            color = "rojo";
        }else if(valor == 2){
            color = "azul";
        }else{
            color = "verde";
        }
        return color;
    }

    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max);
    }
}