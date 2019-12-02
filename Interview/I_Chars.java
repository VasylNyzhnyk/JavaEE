package com.company.Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_Chars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s  = reader.readLine();
        char[] chars = s.toCharArray();
        String vowelToPrint = "";
        String consonantsToPrint = "";
        for (char aChar : chars) {
            if(isVowel(aChar)){
                vowelToPrint += aChar + " ";
            }else if(!isVowel(aChar) && aChar != ' '){
                consonantsToPrint += aChar + " ";
            }
        }
        System.out.println(vowelToPrint);
        System.out.println(consonantsToPrint);

    }
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        for (char vowel : vowels) {
            if(vowel == c){
                return true;
            }
        }return false;


    }
}
