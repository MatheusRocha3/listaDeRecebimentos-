package com.recebimento.recebimento.model.RecebimentoValor;

public class RecebimentoFactory {
    public CalcularRecebimento calculoPagamento(String tipoDePagamento){

        if (tipoDePagamento.equalsIgnoreCase("CARTAO_DE_DEBITO")){
            return new cartaoDeDebito();
        } else if (tipoDePagamento.equalsIgnoreCase("DIN_PIX_CHEQUE")) {
            return new dinPixCheque();
        }else if (tipoDePagamento.equalsIgnoreCase("CARTAO_DE_CREDITO")) {
            return new CartaoDeCredito();
        }else if (tipoDePagamento.equalsIgnoreCase("VALE_REFEICAO")) {
            return new valeRefeicao();
        }
        return null;
    }
}
