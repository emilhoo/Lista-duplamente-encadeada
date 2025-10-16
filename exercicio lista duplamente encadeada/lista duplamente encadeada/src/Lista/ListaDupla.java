package Lista;

import Basicas.Contato;
import celula.Celula    ;

public class ListaDupla {
    private Celula primeira;
    private Celula ultima;
    private int tamanho;

    public ListaDupla() {
        this.primeira = null;
        this.ultima = null;
        this.tamanho = 0;
    }

    public void adicionar(Contato contato) {
        Celula novaCelula = new Celula(contato);
        if (this.tamanho == 0) {
            this.primeira = novaCelula;
            this.ultima = novaCelula;
        } else {
            this.ultima.setProxima(novaCelula);
            novaCelula.setAnterior(this.ultima);
            this.ultima = novaCelula;
        }
        this.tamanho++;
    }

    public void listarTodos() {
        if (this.tamanho == 0) {
            System.out.println("A agenda está vazia.");
            return;
        }
        System.out.println("--- Lista de Contatos ---");
        Celula atual = this.primeira;
        while (atual != null) {
            System.out.println(atual.getContato());
            atual = atual.getProxima();
        }
        System.out.println("-------------------------");
    }

    public Contato pesquisarPorNome(String nome) {
        Celula atual = this.primeira;
        while (atual != null) {
            if (atual.getContato().getNome().equalsIgnoreCase(nome)) {
                return atual.getContato();
            }
            atual = atual.getProxima();
        }
        return null;
    }

    public boolean remover(String nome) {
        Celula atual = this.primeira;
        while (atual != null) {
            if (atual.getContato().getNome().equalsIgnoreCase(nome)) {
                if (atual == this.primeira) {
                    this.primeira = atual.getProxima();
                    if (this.primeira != null) {
                        this.primeira.setAnterior(null);
                    } else {
                        this.ultima = null;
                    }
                }
                else if (atual == this.ultima) {
                    this.ultima = atual.getAnterior();
                    this.ultima.setProxima(null);
                }
                else {
                    atual.getAnterior().setProxima(atual.getProxima());
                    atual.getProxima().setAnterior(atual.getAnterior());
                }
                this.tamanho--;
                return true;
            }
            atual = atual.getProxima();
        }
        return false;
    }

    public boolean removerPorPosicao(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            System.out.println("Posição inválida!");
            return false;
        }
        
        if (posicao == 0) {
            return remover(this.primeira.getContato().getNome());
        }

        if (posicao == this.tamanho - 1) {
            return remover(this.ultima.getContato().getNome());
        }

        Celula atual = this.primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }

        atual.getAnterior().setProxima(atual.getProxima());
        atual.getProxima().setAnterior(atual.getAnterior());
        this.tamanho--;
        return true;
    }

    public int getTamanho() {
        return this.tamanho;
    }
}