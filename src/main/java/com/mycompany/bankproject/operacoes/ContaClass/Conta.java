
package com.mycompany.bankproject.operacoes.ContaClass;

/**
 *
 * @author Lucas
 */
public abstract class Conta implements InterfaceContas {
    
    protected int agencia;
    protected int id;
    protected int numeroConta;
    protected double saldo;
    
   //Construtor

    
    
    //Getters and Setters
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return  saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    //Metodos abstratos implementados
    
    @Override
        public void sacar(double valor){
            this.saldo -= valor;
        
    }
    
    @Override
    
    public void depositar(double valor){
        this.saldo += valor;
        
    }
    
    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }
    
    @Override 
    
    public void extrato(){
        System.out.print("\ntipo da conta:" + this.tipoConta()+
        "\nNúmero da conta " + numeroConta +
        "\nAgencia: " + agencia +
        "\nChaveID: " + id +
       "\nSaldo: " + saldo);

        
    }
    
    //metodos da classe
            
     public String tipoConta(){
        String tipo = null;
        if(id == 13){
            return "Conta Poupança";

        } else if (id == 11){
            return "Conta Corrente";
        }
        return tipo;
    }
    
    
    
    
}
