/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author 11067060642
 */
public class DAOCidade {//Data Acess Object
    public List<Cidade> getLista(){
            return Dados.listaCidade;
    }
public boolean salvar(Cidade obj){
      if(obj.getCodigoCidade()== null){
            Integer codigo = Dados.listaCidade.size()+1;
            obj.setCodigoCidade(codigo);
            Dados.listaCidade.add(obj);
      }
      return true;
}

}
