package br.com.marine.transferencia.controller;

import br.com.marine.transferencia.model.TransferenciaAgenda;
import br.com.marine.transferencia.service.TransferenciaAgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TransferenciaAgendaController {

    @Autowired
    private TransferenciaAgendaService service;

    @PostMapping("/transferencia")
    public TransferenciaAgenda transferenciaAgenda(@RequestBody TransferenciaAgenda transferencia){
        return service.transferenciaAgenda(transferencia);
    }

    @GetMapping
    public List<TransferenciaAgenda> getTransferenciaAgendaList(){
        return service.getTransferenciaAgendaList();
    }
}
