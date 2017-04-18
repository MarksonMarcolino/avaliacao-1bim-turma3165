/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.avaliacao.dao;

import br.com.avaliacao.objeto.Carro;
import br.com.avaliacao.objeto.Proprietario;
import java.util.List;

/**
 *
 * @author Markson
 */
public interface ICarroDao {
    void incluir(Carro carro);
    List<Carro> consultarId(int id);
    List<Carro> consultarNome(String nome);
    List<Carro> consultarMarca(String marca);
    List<Carro> consultarDono(Proprietario proprietario);
    void atualizar(Carro carro);
    
    
}
