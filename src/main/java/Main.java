import javax.swing.JOptionPane;
public class Main {
    static int menu() {
        int opcao;
        do {
            String msg = "Escolha sua opção:\n1 - cadastrar\n2 - atualizar" +
            "\n3 - apagar uma pessoa\n4 - exibir pessoas\n0 - sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));
        } while (opcao < 0 || opcao > 4);
        return opcao;
    }

    public static void main (String args[]) {
        int op;
        do {
            op = menu();
            switch (op) {
                case 1: {
                    String nome = JOptionPane.showInputDialog("digite o nome");
                    String email = JOptionPane.showInputDialog("digite email");
                    String fone = JOptionPane.showInputDialog("digite fone");
                    Pessoa p = new Pessoa(nome, fone, email);
                    if (p.cadastrar()) {
                        JOptionPane.showMessageDialog(null, "cadastro realizado com sucesso");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "cadastro falhou");
                    }
                    break;
                }
                case 2: {
                    String nome = JOptionPane.showInputDialog("digite o nome");
                    Pessoa p = new Pessoa(nome);
                    if (p.buscarPessoa()) {
                        
                    }
                    else {
                        JOptionPane.showMessageDialog(
                                null, "usuário não encontrado");
                    }
                    break;
                }
                case 3:
                    break;
                case 4:{
                    Pessoa p = new Pessoa();
                    JOptionPane.showMessageDialog(null, p.listarPessoas());
                    break;
                }
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
            }
        }while (op != 0);
    }
    
}
