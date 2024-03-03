package Clientes;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.lang.Override;

public class Cliente {
    private String nome;
    private TipoConta tipoConta;

    private Double saldo;

    private List<HistoricoTransferencias> ListaHistoricoTransferencias = new ArrayList<>();

    private HistoricoTransferencias historicoTransferencias;
    public Cliente(String nome, TipoConta tipoConta, Double saldo) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void receberValor(Double valor) {
        saldo += valor;
        saldo -= tipoConta.calcularTaxa(valor);
        historicoTransferencias = new HistoricoTransferencias(valor, mostrarDataHora(), "Recebimento");
        ListaHistoricoTransferencias.add(historicoTransferencias);
    }

    public void transferirValor(Double valor) {
        saldo += valor;
        saldo -= tipoConta.calcularTaxa(valor);
        historicoTransferencias = new HistoricoTransferencias(valor, mostrarDataHora(), "Transfêrencia");
        ListaHistoricoTransferencias.add(historicoTransferencias);
    }

    public String mostrarDataHora() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return agora.format(formatador);
    }

    public void exibeHistorico() {
        for(HistoricoTransferencias historico : ListaHistoricoTransferencias) {
            System.out.println("==================================");
            System.out.println(historico.toString());
            System.out.println("==================================");
        }
    }
}
