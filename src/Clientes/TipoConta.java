package Clientes;

public enum TipoConta {
    CORRENTE {
        @Override
        public double calcularTaxa(double valor) {
            return valor * 0.1;
        }
    }, POUPANCA {
        @Override
        public double calcularTaxa(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularTaxa(double valor);

}
