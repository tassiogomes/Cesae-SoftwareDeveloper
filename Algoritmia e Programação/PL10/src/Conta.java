public class Conta {

    private String numeroConta, titular;
    private double saldo, divida, margemEmprestimo;
    private int anoAbertura;

    public Conta(String numeroConta, String titular, int anoAbertura) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.anoAbertura = anoAbertura;
        this.saldo = 0;
        this.divida = 0;
        this.margemEmprestimo = 0;
    }

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
        atualizarMargemEmprestimo();
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public double getMargemEmprestimo() {
        return margemEmprestimo;
    }

    private void atualizarMargemEmprestimo() {
        this.margemEmprestimo = this.saldo * 0.9;
    }

    public boolean transferencia(double valor, Conta contaDestino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência concluída.");
            return true;
        } else {
            System.out.println("Erro ao transferir.");
            return false;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        atualizarMargemEmprestimo();
        System.out.printf("Depósito de %.2f realizado com sucesso. Saldo atual: %.2f\n", valor, this.saldo);
    }

    public boolean levantar(double valor) {
        if (this.saldo - valor >= -this.margemEmprestimo) {
            this.saldo -= valor;
            System.out.printf("Levantamento de %.2f realizado com sucesso. Saldo atual: %.2f\n", valor, this.saldo);
            return true;
        } else {
            System.out.println("Não há saldo suficiente para realizar o levantamento.");
            return false;
        }
    }

    public void mostrarSaldo() {
        System.out.printf("Saldo atual: %.2f\n", this.saldo);
    }

    public void mostrarDivida() {
        System.out.printf("Valor da dívida: %.2f\n", this.divida);
    }

    public void mostrarMargemEmprestimo() {
        System.out.printf("Margem de empréstimo: %.2f\n", this.margemEmprestimo);
    }
}
