/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.avaliacao.dao;

import br.com.avaliacao.objeto.Moto;
import br.com.avaliacao.objeto.Proprietario;
import java.util.List;

/**
 *
 * @author Markson
 */
public interface IMotoDao {
     void incluir(Moto moto);
    List<Moto> consultarId(int id);
    List<Moto> consultarNome(String nome);
    List<Moto> consultarMarca(String marca);
    List<Moto> consultarDono(Proprietario proprietario);
    void atualizar(Moto moto);
}
