/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankproject.operacoes.ContaClass;

/**
 *
 * @author Lucas
 */
public class ContaCorrente extends Conta {
    
    private static final int AGENCIA_FIXA = 10;
    private static final int IDENTIFICADOR_CONTA = 11;
    private static int SEQUENCIAL = 2;
    private static final double SALDO_INICIAL = 500;
    public ContaCorrente() {
        super.setAgencia(AGENCIA_FIXA);
        super.setId(IDENTIFICADOR_CONTA);
        super.setNumeroConta(SEQUENCIAL++);
        super.saldo = SALDO_INICIAL;
        
        
        
        
    }
    
    
    
    
    
    
    
}
