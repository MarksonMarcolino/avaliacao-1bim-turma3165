/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.avaliacao.objeto;

/**
 *
 * @author Markson
 */
public enum EnumCombustivel {
    ALCOOL(1), GASOLINA(2), GNV(3), GASOLINAGNV(4);
    
    private int valorCombustivel;
    EnumCombustivel(int valor){
        valorCombustivel = valor;
    }
    public int getValorCombustivel(){
        return valorCombustivel;
    }

}
