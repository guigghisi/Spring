package tech.devinhouse.firstproject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}