package oo.composicao.desafio;

public class Loja {
    
    public static void main (String[] args) {
        
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 1, 100);
        compra1.adicionarItem("Notebook", 2000,2);
        
        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10, 100);
        compra2.adicionarItem("Impressora", 1000, 1);
        
        Cliente cliente = new Cliente("Harley");
        cliente.adicionarCompra(compra1);
        cliente.compras.add(compra2);
        
        System.out.println("O valor total das compras foi de R$ " + cliente.obterValorTotal());

    }
}
