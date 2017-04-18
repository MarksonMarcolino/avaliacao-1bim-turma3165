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
public abstract class Veiculo implements IVeiculo {

    String marca;
    String modelo;
    String cor;
    double kilometragemAtual;
    double velocidadeMaxima;
    Proprietario proprietario;
    double litrosTanque;
    EnumCombustivel tipoCombustivel;
    int id;

}
