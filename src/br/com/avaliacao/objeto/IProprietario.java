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
public interface IProprietario {
    void adicionarCarro(Carro NovoCarro);
    void adicionarMoto (Moto NovaMoto);
    void listarVeiculos();
    void removerCarro(Carro carro);
    void removerMoto(Carro moto);
    
}
