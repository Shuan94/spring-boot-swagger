/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novatronic.simulador.dto;

/**
 *
 * @author jvalencia
 */
public class AnulacionRequestDTO extends PagoRequestDTO {

    private Integer collectionId;
    private String cancelMessage;

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public String getCancelMessage() {
        return cancelMessage;
    }

    public void setCancelMessage(String cancelMessage) {
        this.cancelMessage = cancelMessage;
    }

}
