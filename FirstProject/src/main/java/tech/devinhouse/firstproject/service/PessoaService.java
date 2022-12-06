package tech.devinhouse.firstproject.service;


import org.springframework.stereotype.Service;
import tech.devinhouse.firstproject.model.PessoaModel;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoaService {

    private  static List<PessoaModel> pessoaModelList = new ArrayList<PessoaModel>();
    public PessoaService() {
        PessoaModel pessoa = new PessoaModel(1L,"Pessoa 1");
        PessoaModel pessoa2 = new PessoaModel(2L,"Pessoa 2");
        pessoaModelList.add(pessoa);
        pessoaModelList.add(pessoa2);
    }

    public List<PessoaModel> getPessoas(){
        if(pessoaModelList.isEmpty()){
            return null;
        }
        return pessoaModelList;
    }
    public void getPessoa(){}
    public void postPessoa(){}
    public void updatePessoa(){}

}
