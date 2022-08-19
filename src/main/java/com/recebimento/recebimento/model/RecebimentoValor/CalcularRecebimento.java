package com.recebimento.recebimento.model.RecebimentoValor;
import com.recebimento.recebimento.model.RecebimentosModel;

import java.math.BigDecimal;

public interface CalcularRecebimento {
    public BigDecimal calculoPagamento(RecebimentosModel pagamentoModel);
}
