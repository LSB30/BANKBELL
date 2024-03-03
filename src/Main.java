import Clientes.Cliente;
import Clientes.TipoConta;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe seu Nome: ");
        String nome = leitura.nextLine();
        System.out.println("Welcome " + nome + "ao Banco PAYBEL");
        Cliente cliente = new Cliente(nome, TipoConta.CORRENTE, 2000.0);

        cliente.receberValor(300.0);
        cliente.transferirValor(255.5);
        cliente.exibeHistorico();
        System.out.println(cliente.getSaldo());
    }
}