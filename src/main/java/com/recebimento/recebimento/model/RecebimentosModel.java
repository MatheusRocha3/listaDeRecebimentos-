package com.recebimento.recebimento.model;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "registros_de_recebimento")
public class RecebimentosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRecebimento;

    @Column(length = 50, nullable = false)
    private String formaDeRecebimento;

    @Column(name = "valor_a_receber",length = 50, nullable = false)
    private BigDecimal valorAReceber;

    @Column(name = "valor_descontado",length = 10, nullable = false)
    private BigDecimal descontoRecebimento;

    @Column(name = "valor_recebido",length = 10, nullable = false)
    private BigDecimal valorRecebido;
}
