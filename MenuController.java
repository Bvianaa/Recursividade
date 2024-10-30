import javax.swing.JOptionPane;

public class MenuController {

    public static void main(String[] args) {
        String[] options = {"Fibonacci", "Fatorial", "Fatorial Duplo", "Sair"};
        int choice;

        do {
            choice = JOptionPane.showOptionDialog(null, "Escolha um algoritmo", "Menu de Algoritmos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para Fibonacci:"));
                    JOptionPane.showMessageDialog(null, "Fibonacci de " + n + " é " + fibonacci(n));
                    break;
                case 1:
                    n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para Fatorial:"));
                    JOptionPane.showMessageDialog(null, "Fatorial de " + n + " é " + fatorial(n));
                    break;
                case 2:
                    n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para Fatorial Duplo:"));
                    JOptionPane.showMessageDialog(null, "Fatorial Duplo de " + n + " é " + fatorialDuplo(n));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (choice != 3);
    }

    // Algoritmo de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Algoritmo de Fatorial
    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    // Algoritmo de Fatorial Duplo
    public static int fatorialDuplo(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fatorialDuplo(n - 2);
        }
    }
}
