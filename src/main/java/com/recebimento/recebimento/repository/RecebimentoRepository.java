package com.recebimento.recebimento.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.recebimento.recebimento.model.RecebimentosModel;
public interface RecebimentoRepository extends JpaRepository<RecebimentosModel, Long> {
}
