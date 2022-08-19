package com.recebimento.recebimento.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.recebimento.recebimento.model.RecebimentosModel;
import com.recebimento.recebimento.service.RecebimentoService;

import java.util.List;
import java.util.Optional;

@RestController
public class RecebimentoController {
    @Autowired
    private RecebimentoService recebimentoService;

    @GetMapping(path = "/recebimento")
    public List<RecebimentosModel> buscaTodosRecebimentos(){
        return recebimentoService.buscarTodos();
    }

    @GetMapping(path = "/recebimento/{codigo}")
    public Optional<RecebimentosModel> buscarRecebimentoPorId(@PathVariable Long codigo){
        return recebimentoService.buscarId(codigo);
    }

    @PostMapping(path = "/recebimento")
    @ResponseStatus(HttpStatus.CREATED)
    public RecebimentosModel cadastrarRecebimento(@RequestBody RecebimentosModel recebimentosModel){
        return recebimentoService.cadastrar(recebimentosModel);
    }

    @PutMapping(path = "/recebimento/{codigo}")
    public RecebimentosModel alterarRecebimento(@RequestBody RecebimentosModel recebimentosModel){
        return recebimentoService.alterar(recebimentosModel);
    }

    @DeleteMapping(path = "/recebimento/{codigo}")
    public void deletarRecebimento(@PathVariable Long codigo){
        recebimentoService.deletar(codigo);
    }
}
