import modelos.Tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Tarefas> listaDeTarefas = new ArrayList<Tarefas>();
        Scanner scan = new Scanner(System.in);

        int opcaoMenu = 0;

        while (opcaoMenu != 5) {

            String menu = """
                
                =============================
                         TO DO LIST
                =============================        
                [1] Adicionar nova tarefa
                [2] Concluir tarefa
                [3] Remover tarefa
                [4] Exibir tarefas
                [5] Sair
                """;

            System.out.println(menu);
            opcaoMenu = scan.nextInt();

            if (opcaoMenu == 1) {
                Tarefas tarefa = new Tarefas();
                System.out.println("Descrição: ");
                String descricao = scan.next();
                System.out.println("Data de vencimento: ");
                String dataDeVencimento = scan.next();

                tarefa.setDescricao(descricao);
                tarefa.setDataDeVencimento(dataDeVencimento);
                listaDeTarefas.add(tarefa);

                System.out.println("Tarefa adicionada!");

            } else if (opcaoMenu == 2) {
                if(listaDeTarefas.isEmpty()) {
                    System.out.println("Sua lista de tarefas está vazia!");
                } else {
                    System.out.println("===== LISTA DE TAREFAS =====");
                    for (int i = 0; i < listaDeTarefas.size(); i++) {
                        System.out.println(listaDeTarefas.get(i).toString());
                    }
                    System.out.println("============================");
                    System.out.println("Qual tarefa você quer concluir?");
                    String tarefa = scan.next();

                    for (int i = 0; i < listaDeTarefas.size(); i++) {
                        if(listaDeTarefas.get(i).getDescricao().equals(tarefa)) {
                            listaDeTarefas.get(i).conclui();
                        }
                    }

                }
            } else if (opcaoMenu == 3) {
                System.out.println("============================");
                System.out.println("Qual tarefa você quer excluir?");
                String tarefa = scan.next();
                for (int i = 0; i < listaDeTarefas.size(); i++) {
                    if(listaDeTarefas.get(i).getDescricao().equals(tarefa)){
                        listaDeTarefas.remove(i);
                    }
                }
            } else if (opcaoMenu == 4) {
                System.out.println("===== LISTA DE TAREFAS =====");
                for (int i = 0; i < listaDeTarefas.size(); i++) {
                    System.out.println(listaDeTarefas.get(i).toString());
                }
                System.out.println("============================");
            }

        }

    }
}