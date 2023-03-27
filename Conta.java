public abstract class Conta implements iConta{
    
    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){

        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;

            }

    public int getAgencia() {
        return this.agencia;
    }


    public int getNumero() {
        return this.numero;
    }


    public double getSaldo() {
        return this.saldo;
    }


    public void sacar(double valor) {
        saldo -= valor;

    }

    public void depositar(double valor) {
        saldo -= valor;
        
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }
}
