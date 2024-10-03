package com.palindromo.palindromo.DAO;

import org.springframework.stereotype.Repository;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Repository
public class PalindromoDaoImpl implements PalindromoDao{
    @Override
    public int caracterEspecial(String palabra) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]"); //busca caracteres especiales que no sean letras
        Matcher matcher = pattern.matcher(palabra); //coincidencias sobre la cadena
        int i = 0;

        do {
            i++; //incrementa mientras encuentre coindicencias de pattern
        }while(matcher.find());
        return i;
    }

    @Override
    public boolean isPalindromoMet(String palabra) {
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
