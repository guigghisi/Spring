package tech.devinhouse.firstproject.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;
import tech.devinhouse.firstproject.model.PessoaModel;
import tech.devinhouse.firstproject.service.PessoaService;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    private PessoaService service;

    public PessoaController(PessoaService service){
        this.service = service;
    }


    @GetMapping()
    public List<PessoaModel> getPessoas(){

        return service.getPessoas();
    }

    @GetMapping("/{id}")
    public List<PessoaModel> getPessoa(@PathVariable("id") String id){
        return service.getPessoa(Long.valueOf(id));
    }

    @PostMapping
    public void postPessoa(@RequestBody PessoaModel pessoaModel){
        service.postPessoa(pessoaModel);
    }
    @PutMapping
    public void updatePessoa(Long id,PessoaModel pessoaModel){
        service.updatePessoa(id,pessoaModel);
    }
}