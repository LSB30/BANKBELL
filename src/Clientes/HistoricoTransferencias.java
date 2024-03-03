package Clientes;

public class HistoricoTransferencias {
    private Double valor;

    private String data;

    private String operacao;

    HistoricoTransferencias(Double valor, String data, String operacao) {
        this.valor = valor;
        this.data = data;
        this.operacao = operacao;
    }

    @Override
    public String toString() {
        return "- Historico de Transferencias -" +
                "\nValor: " + valor +
                "\nData: " + data  +
                "\nTipo da Operaçao: " + operacao;
    }
}
