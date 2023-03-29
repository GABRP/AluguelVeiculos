import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class AluguelVeiculos extends JFrame {
    private JTextField txtCpf, txtTelefone, txtPlaca, txtAno, txtDataLocacao, txtDataEntrega;

    public AluguelVeiculos() {
        setTitle("Aluguel de Veículos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        // Cria as máscaras para os campos de CPF, telefone e data
        MaskFormatter cpfFormatter = createFormatter("###.###.###-##");
        MaskFormatter telefoneFormatter = createFormatter("(##) #####-####");
        MaskFormatter dataFormatter = createFormatter("##/##/####");

        // Cria os rótulos e campos de texto para cada informação do aluguel
        JLabel lblCpf = new JLabel("CPF:");
        txtCpf = new JFormattedTextField(cpfFormatter);
        txtCpf.setColumns(14); // Definindo a largura do campo como 14 caracteres

        JLabel lblTelefone = new JLabel("Telefone:");
        txtTelefone = new JFormattedTextField(telefoneFormatter);
        txtTelefone.setColumns(14); // Definindo a largura do campo como 14 caracteres

        JLabel lblPlaca = new JLabel("Placa:");
        txtPlaca = new JTextField();
        txtPlaca.setColumns(7); // Definindo a largura do campo como 7 caracteres

        JLabel lblAno = new JLabel("Ano:");
        txtAno = new JTextField();
        txtAno.setColumns(4); // Definindo a largura do campo como 4 caracteres

        JLabel lblDataLocacao = new JLabel("Data de Locação:");
        txtDataLocacao = new JFormattedTextField(dataFormatter);
        txtDataLocacao.setColumns(8); // Definindo a largura do campo como 8 caracteres

        JLabel lblDataEntrega = new JLabel("Data de Entrega:");
        txtDataEntrega = new JFormattedTextField(dataFormatter);
        txtDataEntrega.setColumns(8); // Definindo a largura do campo como 8 caracteres

        // Adiciona os rótulos e campos de texto ao painel principal
        add(lblCpf);
        add(txtCpf);
        add(lblTelefone);
        add(txtTelefone);
        add(lblPlaca);
        add(txtPlaca);
        add(lblAno);
        add(txtAno);
        add(lblDataLocacao);
        add(txtDataLocacao);
        add(lblDataEntrega);
        add(txtDataEntrega);

        // Adiciona um botão de Salvar e um listener para exibir a mensagem de sucesso
        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(e -> JOptionPane.showMessageDialog(this, "Aluguel realizado com sucesso!"));

        // Adiciona o botão de Salvar ao painel principal
        add(btnSalvar);

        // Exibe o formulário na tela
        setVisible(true);
    }

    // Cria uma máscara de formatação com o padrão especificado
    private MaskFormatter createFormatter(String pattern) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter(pattern);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return formatter;
    }

    public static void main(String[] args) {
        new AluguelVeiculos();
    }

}