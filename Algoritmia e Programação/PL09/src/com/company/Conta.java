package com.company;
public class Conta {

        // ATTRIBUTES
        private String numeroConta, titular;
        private double saldo;

        public Conta(String numeroConta, String titular, double saldo) {
            this.numeroConta = numeroConta;
            this.titular = titular;
            this.saldo = saldo;
        }


        // // ENCAPSULATION getterss and setters
        public String getNumeroConta() {
            return numeroConta;
        }

        public void setNumeroConta(String numeroConta) {
            this.numeroConta = numeroConta;
        }

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        // METHODS
        public boolean transferencia (double valor, Conta contaDestino){

            // Verificar se a conta remetente tem saldo suficiente
            if(this.saldo>=valor){
                this.saldo-=valor;          // Subtraio ao saldo da conta remetente
                contaDestino.saldo+=valor;  // Incremento ao saldo da conta destino
                System.out.println("Transferência Concluida");
                return true;
            }else{
                System.out.println("Erro ao Transferir");
                return false;
            }
        }

        public void depositar(double valor){
            this.saldo = this.saldo + valor;
            System.out.printf("O depósito de %.2f foi realizado e o montante da conta é %.2f\n", valor, this.saldo);

        }

        public boolean levantar(double valor_levantado){

            // Verificar se a conta remetente tem saldo suficiente
            if(this.saldo>=valor_levantado){
                this.saldo-=valor_levantado;          // Subtraio ao saldo da conta remetente
                System.out.printf("O valor levantado foi de %.2f e o saldo final é %.2f\n", valor_levantado, this.saldo);
                return true;

            }else{
                System.out.println("Não há saldo suficiente para esse montante a ser levantado\n");
                return false;
            }
        }

        public void mostrarSaldo(){
            System.out.printf("O saldo final é: %.2f\n", this.saldo);
        }

}

