package com.palindromo.palindromo.DTO;


public class PalindromoDTO {

    private String palindromo;
    private boolean isPalindromo;
    private int lengthCadena;
    private int lengthCaracteresEspeciales;

    public String getPalindromo() {
        return palindromo;
    }

    public void setPalindromo(String palindromo) {
        this.palindromo = palindromo;
    }

    public boolean getIsPalindromo() {
        return isPalindromo;
    }


    public void setIsPalindromo(boolean isPalindromo) {
        this.isPalindromo = isPalindromo;
    }

    public int getLengthCadena() {
        return lengthCadena;
    }

    public void setLengthCadena(int lengthCadena) {
        this.lengthCadena = lengthCadena;
    }

    public int getLengthCaracteresEspeciales() {
        return lengthCaracteresEspeciales;
    }

    public void setLengthCaracteresEspeciales(int lengthCaracteresEspeciales) {
        this.lengthCaracteresEspeciales = lengthCaracteresEspeciales;
    }

    @Override
    public String toString() {
        return "PalindromoDTO{" +
                "palindromo='" + palindromo + '\'' +
                ", isPalindromo=" + isPalindromo +
                ", lengthCadena=" + lengthCadena +
                ", lengthCaracteresEspeciales=" + lengthCaracteresEspeciales +
                '}';
    }
}
