package Main;

import Basicas.Contato;
import Lista.ListaDupla;

public class Main {
    public static void main(String[] args) {
        ListaDupla agenda = new ListaDupla();

        agenda.adicionar(new Contato("Ana", "Rua A, 123", "1111-1111"));
        agenda.adicionar(new Contato("Carlos", "Rua B, 456", "2222-2222"));
        agenda.adicionar(new Contato("Maria", "Rua C, 789", "3333-3333"));
        agenda.adicionar(new Contato("Joao", "Rua D, 101", "4444-4444"));
        System.out.println("Total de contatos: " + agenda.getTamanho());
        agenda.listarTodos();

        Contato c = agenda.pesquisarPorNome("Maria");
        if (c != null) {
            System.out.println("Contato encontrado: " + c);
        } else {
            System.out.println("Contato não encontrado.");
        }

        if (agenda.remover("Carlos")) {
            System.out.println("Contato removido com sucesso");
        } else {
            System.out.println("Não foi possível remover o contato");
        }
        System.out.println("Total de contatos: " + agenda.getTamanho());
        agenda.listarTodos();

        if (agenda.removerPorPosicao(1)) {
            System.out.println("Contato removido com sucesso");
        } else {
            System.out.println("Não foi possível remover o contato");
        }
        System.out.println("Total de contatos: " + agenda.getTamanho());
        agenda.listarTodos();
    }
}