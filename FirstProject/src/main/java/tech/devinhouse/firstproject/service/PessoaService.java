package tech.devinhouse.firstproject.service;


import org.springframework.stereotype.Service;
import tech.devinhouse.firstproject.model.PessoaModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaService {

    public static List<PessoaModel> pessoaModelList = new ArrayList<>();
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
    public List<PessoaModel> getPessoa(Long id){
        return pessoaModelList.stream().filter(pessoa -> pessoa.getId().equals(id)).toList();
    }
    public void postPessoa(){}
    public void updatePessoa(){}

}
