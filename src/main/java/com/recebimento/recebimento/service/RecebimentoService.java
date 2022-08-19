package com.recebimento.recebimento.service;
import com.recebimento.recebimento.model.RecebimentoValor.RecebimentoFactory;
import com.recebimento.recebimento.repository.RecebimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.recebimento.recebimento.model.RecebimentosModel;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class RecebimentoService {
    @Autowired
    private RecebimentoRepository recebimentoRepository;


    public List<RecebimentosModel> buscarTodos(){
        return recebimentoRepository.findAll();
    }

    public Optional<RecebimentosModel> buscarId(Long codigo){
        return recebimentoRepository.findById(codigo);
    }

    public RecebimentosModel cadastrar(RecebimentosModel recebimentosModel){
        RecebimentoFactory factory = new RecebimentoFactory();
        BigDecimal valor = factory.calculoPagamento(recebimentosModel.getFormaDeRecebimento()).calculoPagamento(recebimentosModel);
        BigDecimal desconto = recebimentosModel.getValorAReceber().subtract(valor);
        recebimentosModel.getIdRecebimento();
        recebimentosModel.getValorAReceber();
        recebimentosModel.setDescontoRecebimento(desconto);
        recebimentosModel.setValorRecebido(valor);

        return recebimentoRepository.save(recebimentosModel);
    }

    public RecebimentosModel alterar(RecebimentosModel recebimentosModel){
        RecebimentoFactory factory = new RecebimentoFactory();
        BigDecimal valor = factory.calculoPagamento(recebimentosModel.getFormaDeRecebimento()).calculoPagamento(recebimentosModel);
        BigDecimal desconto = recebimentosModel.getValorAReceber().subtract(valor);
        recebimentosModel.getIdRecebimento();
        recebimentosModel.getValorAReceber();
        recebimentosModel.setDescontoRecebimento(desconto);
        recebimentosModel.setValorRecebido(valor);

        return recebimentoRepository.save(recebimentosModel);
    }

    public void deletar(Long codigo){
        recebimentoRepository.deleteById(codigo);
    }

}
