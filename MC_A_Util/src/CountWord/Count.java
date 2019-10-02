/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CountWord;

import java.util.Scanner;

/**
 *
 * @author ajocme_sd2082
 */
public class Count {
    
   public static int countWord(String s){

   int wordCount = 0;

   boolean word = false;
   int endOfLine = s.length() - 1;

   for (int i = 0; i < s.length(); i++) {
       // if the char is a letter, word = true.
       if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
           word = true;
           // if char isn't a letter and there have been letters before,
           // counter goes up.
       } else if (!Character.isLetter(s.charAt(i)) && word) {
           wordCount++;
           word = false;
           // last word of String; if it doesn't end with a non letter, it
           // wouldn't count without this.
       } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
           wordCount++;
       }
   }
   return wordCount;
}
}


