package com.recebimento.recebimento.model.RecebimentoValor;
import com.recebimento.recebimento.model.RecebimentosModel;

import java.math.BigDecimal;
public class dinPixCheque implements CalcularRecebimento{
    @Override
    public BigDecimal calculoPagamento(RecebimentosModel recebimentosModel) {
        return recebimentosModel.getValorAReceber();
    }
}
