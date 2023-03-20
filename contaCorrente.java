public class contaCorrente extends Conta{

    private static final int SEQUENCIAL = 0;
    public contaCorrente() {

        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;

    }

    
}
