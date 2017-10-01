/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cvc.teste.calculadores;

import br.com.cvc.teste.utils.CalculadoraUtils;

/**
 *
 * @author johngomes
 */
public class CalculadorTaxaTipoCAcimaDe40Dias extends CalculadorAbstract{

    private static final double PERCENTUAL = 1.7;

    public CalculadorTaxaTipoCAcimaDe40Dias(CalculadorAbstract proximo) {
        super(proximo);
    }

    @Override
    public double calculaTaxa(double valor, double numeroDeDias) {
        if(numeroDeDias > 40) {
            return CalculadoraUtils.calculaValorSobPercentual(valor, PERCENTUAL);
        }
        return -1;
    }

}