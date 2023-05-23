package Entidades;

import Itens.Arma;
import Itens.ItemHeroi;
import Itens.PocaoHP;

import java.util.ArrayList;


public class Vendedor {

    private ArrayList<ItemHeroi> inventario; // Declaração do atributo inventario como um ArrayList de ItemHeroi

    /**
     * Construtor da classe Vendedor
     */
    public Vendedor() {
        this.inventario = new ArrayList<>();
    }

    /**
     * Método para adicionar item ao atributo inventario
     * @param item
     */
    public void adicionarItem(ItemHeroi item) {
        // Adiciona um item ao inventario
        inventario.add(item);
    }

    /**
     * Método de imprimir inventário (ArrayList que recebe um item da classe ItemHeroi)
     */
    public void imprimirInventario() {
        System.out.println("Inventário do Vendedor:");
        for (ItemHeroi item : inventario) {         // Percorre o inventario e imprime os detalhes de cada item
            item.mostrarDetalhes();
            System.out.println("--------------------");
        }
    }

    /**
     * Método vender que recebe como parametros um heroi da classe Heroi e um item da classe ItemHeroi
     * @param heroi
     * @param item
     */
    public void vender(Heroi heroi, ItemHeroi item) {
        // Verifica se o heroi possui ouro suficiente para comprar o item
        if (heroi.getOuro() >= item.getPreco()) {
            // Verifica se o item é uma Arma e atualiza a arma do heroi
            if (item instanceof Arma) { // verifica se item do tipo é uma instancia de Arma
                Arma arma = (Arma) item; // casting, trata o item como uma instancia de arma, ja qe foi verificado acima
                heroi.setArma(arma);    // arma da classe Heroi armazena um item (que ja foi verificado e convertido pro tipo arma)
            }
            // Verifica se o item é uma PocaoHP e adiciona a poção ao heroi
            else if (item instanceof PocaoHP) {
                PocaoHP pocao = (PocaoHP) item;
                heroi.adicionarPocao(pocao);
            }
            // Decrementa o ouro do heroi pelo preço do item
            heroi.decrementarOuro(item.getPreco());
            // Remove o item do inventario do vendedor
            inventario.remove(item);
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("O herói não possui ouro suficiente para comprar este item.");
        }
    }
}

