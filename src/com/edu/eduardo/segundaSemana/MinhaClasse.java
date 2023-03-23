package com.edu.eduardo.segundaSemana;

public class MinhaClasse {
    public static void main(String[] args) {
/*        final String BR = "Brasil";
        System.out.println(BR);*/
        String primeiroNome = "Eduardo";
        String segundoNome = "Gomes";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Nome completo é " + primeiroNome.concat(" ").concat(segundoNome);
    }
}