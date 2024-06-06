/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novatronic.simulador.dto;

import lombok.Data;

/**
 *
 * @author jvalencia
 */
@Data
public class TokenResponseDTO {

    private String access_token;
    private String refresh_token;
    private String scope;
    private String token_type;
    private Long expires_in;
}
