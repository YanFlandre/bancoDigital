public class contaPoupanca extends Conta {

    
    private static final int SEQUENCIAL = 0;
    public contaPoupanca() {

        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;

    }
}
