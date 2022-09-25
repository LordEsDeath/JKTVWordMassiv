/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jktvwordmassiv;

import java.util.Scanner;

/**
 *
 * @author kostj
 */

public class JKTVWordMassiv {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"};
        String sentences = "В чащах юга жил бы цитрус? Да, но фальшивый экземпляр!";

        System.out.println(sentences);
        
        
        for (String word:words) {
            if(!sentences.contains(word)){
                System.out.print("Нету некоторых букв");
                return;
            }else{
                System.out.print("Все буквы есть");
                return;
            }
        }
        
    }
}
        
        
        
        
    

