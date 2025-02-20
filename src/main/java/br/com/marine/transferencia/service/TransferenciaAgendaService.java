package br.com.marine.transferencia.service;

import br.com.marine.transferencia.model.TransferenciaAgenda;
import br.com.marine.transferencia.repositories.TransferenciaAgendaRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransferenciaAgendaService {

    @Autowired
    private TransferenciaAgendaRepository repository;

    public TransferenciaAgenda transferenciaAgenda(TransferenciaAgenda agenda){
        BigDecimal taxaTransferencia = verificaTaxa(agenda.getDataTransferencia());
        if (taxaTransferencia == null){
            throw new IllegalArgumentException("Taxa não se aplica para o dia escolhido.");
        }

        taxaTransferencia = agenda.getValor().multiply(taxaTransferencia).setScale(2, RoundingMode.HALF_UP);
        BigDecimal valorFinal = agenda.getValor().subtract(taxaTransferencia);
        agenda.setTaxa(taxaTransferencia);
        agenda.setValorFinal(valorFinal);
        agenda.setDataAgendamento(LocalDate.now());
        return repository.save(agenda);
    }

    private BigDecimal verificaTaxa(LocalDate dataTrasnferencia){
        long dias = ChronoUnit.DAYS.between(LocalDate.now(), dataTrasnferencia);
        if (dias == 0)
            return new BigDecimal("0.025");
        if(dias < 0)
            return null;
        if(dias > 0 && dias <= 10)
            return null;
        if (dias > 10 && dias <= 20)
            return new BigDecimal("0.082");
        if (dias > 20 && dias <= 30)
            return new BigDecimal("0.069");
        if (dias > 30 && dias <= 40)
            return new BigDecimal("0.047");
        if (dias > 40 && dias <= 50)
            return new BigDecimal("0.017");
        return null;
    }

    public List<TransferenciaAgenda> getTransferenciaAgendaList(){
        List<TransferenciaAgenda> lista = new ArrayList<>();
        repository.findAll().forEach(lista::add);
        return lista;
    }
}
