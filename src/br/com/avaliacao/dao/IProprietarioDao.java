/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.avaliacao.dao;

import br.com.avaliacao.objeto.Proprietario;
import java.util.List;

/**
 *
 * @author Markson
 */
public interface IProprietarioDao {
     void incluir(Proprietario carro);
    List<Proprietario> consultarId(int id);
    List<Proprietario> consultarNome(String nome);
    List<Proprietario> consultarCnh(String cnh);
    List<Proprietario> consultarCpf(String cpf);
    void atualizar(Proprietario proprietario);
    
}
