/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankproject.operacoes.ContaClass;

/**
 *
 * @author Lucas
 */
public class ContaPoupanca extends Conta {
    private static final int AGENCIA_FIXA = 10;
    private static final int IDENTIFICADOR_CONTA = 13;
    private static int SEQUENCIAL = 2;
    public ContaPoupanca() {
        super.setAgencia(AGENCIA_FIXA);
        super.setId(IDENTIFICADOR_CONTA);
        super.setNumeroConta(SEQUENCIAL++);
        
        
    }
    
    
}
