/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cvc.teste.calculadores;

/**
 *
 * @author johngomes
 */
public class CalculadorTaxaTipoB extends CalculadorAbstract{
    
    private static final double VALOR_DA_TAXA_PADRAO = 12.0;

    public CalculadorTaxaTipoB(CalculadorAbstract proximo) {
        super(proximo);
    }

    @Override
    public double calculaTaxa(double valor, double numeroDeDias) {
         if (numeroDeDias > 0 && numeroDeDias <= 10){
            return VALOR_DA_TAXA_PADRAO;
         }
         return -1;
    }

    
}