package com.company;

public class PL09_11 {

    public static void main(String[] args){

        // Instanciar Contas
        Conta conta1 = new Conta("111222", "Cristiano Ronaldo", 120);
        Conta conta2 = new Conta("222333", "Conor Mcgregor", 400);

        conta1.transferencia(130,conta2);
        conta2.transferencia(200, conta1);

        System.out.println("Saldo da Conta "+conta1.getNumeroConta()+": "+conta1.getSaldo());
        System.out.println("Saldo da Conta "+conta2.getNumeroConta()+": "+conta2.getSaldo());
        conta1.depositar(1000);
        conta1.levantar(1000);
        conta1.depositar(2000);
        conta1.mostrarSaldo();

    }


}
