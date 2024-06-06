/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novatronic.simulador.controllers;

import com.novatronic.simulador.dto.TokenResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jvalencia
 */
@RestController
@RequestMapping("/api")
public class TokenController {

    @PostMapping("/token")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<TokenResponseDTO> create() {
        TokenResponseDTO dtoResponse = new TokenResponseDTO();
        dtoResponse.setAccess_token("82398e9e-3361-3a0f-a6cd-dd9e164d9818");
        dtoResponse.setRefresh_token("bd70c2a4-328e-3ebf-b37e-6cd91816c040");
        dtoResponse.setScope("apim:subscribe");
        dtoResponse.setToken_type("Bearer");
        dtoResponse.setExpires_in(2886L);
        return ResponseEntity.ok(dtoResponse);
    }

}
