/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novatronic.simulador.controllers;

import com.novatronic.simulador.dto.AnulacionRequestDTO;
import com.novatronic.simulador.dto.ConsultaResponseDTO;
import com.novatronic.simulador.dto.ConsultaData;
import com.novatronic.simulador.dto.PagoData;
import com.novatronic.simulador.dto.PagoRequestDTO;
import com.novatronic.simulador.dto.PagoResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jvalencia
 */
@RestController
@RequestMapping("/onesait")
public class OnesaitController {
    
    @PostMapping("/balance")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ConsultaResponseDTO> balance(@RequestBody ConsultaResponseDTO requestDTO) {
        ConsultaResponseDTO dtoResponse = new ConsultaResponseDTO();
        ConsultaData data = new ConsultaData();
        data.setCustomerName("CLIENTE0000001380 CL0000001380");
        data.setAccountReference("ACC0000001380");
        data.setAccountBalance(1652.29);
        data.setLastBillAmount(1652.29);
        data.setLastBillDueDate(1704841200000L);
        data.setCurrencyId(1);
        data.setCurrencyIsoCode("PEN");
        dtoResponse.setData(data);
        return ResponseEntity.ok(dtoResponse);
    }
    
    @PostMapping("/externalPayment")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<PagoResponseDTO> externalPayment(@RequestBody PagoRequestDTO requestDTO) {
        PagoResponseDTO dtoResponse = new PagoResponseDTO();
        PagoData data = new PagoData();
        data.setCollectionStatus("002ESTCOLL");
        data.setAccountBalance(63244.85);
        data.setCollectionId(914294);
        data.setConfirmationMessage("10 : InCMS-BL-CB001532. El cobro se ha realizado correctamente");
        dtoResponse.setData(data);
        return ResponseEntity.ok(dtoResponse);
    }
    
    @PostMapping("/sedCancelExternalPayment")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<PagoResponseDTO> sedCancelExternalPayment(@RequestBody AnulacionRequestDTO requestDTO) {
        PagoResponseDTO dtoResponse = new PagoResponseDTO();
        PagoData data = new PagoData();
        data.setCollectionStatus("002ESTCOLL");
        data.setAccountBalance(6322832.71);
        data.setCollectionId(914294);
        data.setConfirmationMessage("InCMS-BL-CB001538. La cancelación del cobro se ha realizado correctamente");
        dtoResponse.setData(data);
        return ResponseEntity.ok(dtoResponse);
    }
    
}
