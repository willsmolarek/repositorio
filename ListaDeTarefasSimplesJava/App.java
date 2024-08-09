package todolistr;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Completar tarefa");
            System.out.println("3 - Listar tarefas");
            System.out.println("4 - Sair");

            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.println("Digite a descrição da tarefa:");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case "2":
                    System.out.println("Digite o número da tarefa a ser completada:");
                    int taskNumber = Integer.parseInt(scanner.nextLine());
                    toDoList.completeTask(taskNumber - 1);
                    break;
                case "3":
                    toDoList.listTasks();
                    break;
                case "4":
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Comando inválido!");
            }
        }
    }
}
