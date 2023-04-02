import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class AluguelVeiculos extends JFrame implements ActionListener {

    //1) Criar um projeto de aluguel de veículos, conforme o protótipo abaixo:
    //
    //Incluir máscaras para: CPF, Tel, Placa, Ano, Data de Locação, Data de Entrega.
    //
    //Ao clicar no botão Salvar exibir a mensagem: Aluguel realizado com sucesso!

    public static void main(String[] args) {
        AluguelVeiculos aluguel = new AluguelVeiculos();
        aluguel.alugacarros();
    }

    public void alugacarros() {
        Container janela = getContentPane(); //variável
        setLayout(null);

        // define rótulos e botões
        // dados do cliente
        JLabel labelDadosCL = new JLabel("Dados do cliente");
        JLabel labelNome = new JLabel("Nome: ");
        JLabel labelCpf = new JLabel("CPF: ");
        JLabel labelTel = new JLabel("Telefone: ");
        labelDadosCL.setBounds(50, 20, 100, 20);
        labelNome.setBounds(50, 60, 100, 20);
        labelCpf.setBounds(50, 90, 100, 20);
        labelTel.setBounds(50, 120, 100, 20);

        // dados do carro
        JLabel labelDadosCar = new JLabel("Dados do carro");
        JLabel labelNomeCar = new JLabel("Nome do Carro: ");
        JLabel labelPlaca = new JLabel("Placa: ");
        JLabel labelAno = new JLabel("Ano: ");
        JLabel labelDtaLoc = new JLabel("Data de Locação: ");
        JLabel labelDtaEnt = new JLabel("Data de Entrega: ");
        labelDadosCar.setBounds(50, 160, 100, 20);
        labelNomeCar.setBounds(50, 190, 100, 20);
        labelPlaca.setBounds(50, 220, 100, 20);
        labelAno.setBounds(50, 250, 100, 20);
        labelDtaLoc.setBounds(50, 280, 150, 20);
        labelDtaEnt.setBounds(50, 310, 100, 20);

        // define as máscaras
        // dados do cliente
        MaskFormatter mascaraNome = null;
        MaskFormatter mascaraCPF = null;
        MaskFormatter mascaraTel = null;

        // dados do carro
        MaskFormatter mascaraNomeCar = null;
        MaskFormatter mascaraPlaca = null;
        MaskFormatter mascaraAno = null;
        MaskFormatter mascaraDtaLoc = null;
        MaskFormatter mascaraDtaEnt = null;

        try {
            mascaraNome = new MaskFormatter("********************************");
            mascaraCPF = new MaskFormatter("#########-##");
            mascaraTel = new MaskFormatter("(##)####-####");
            mascaraNomeCar = new MaskFormatter("*********************");
            mascaraPlaca = new MaskFormatter("UUU-####");
            mascaraAno = new MaskFormatter("##/##/##");
            mascaraDtaLoc = new MaskFormatter("##/##/####");
            mascaraDtaEnt = new MaskFormatter("##/##/####");
        } catch (ParseException excp) {
            System.err.println("Erro:" + excp);
        }

        //Adiciona os rótulos na janela
        janela.add(labelNome);
        janela.add(labelCpf);
        janela.add(labelTel);
        janela.add(labelNomeCar);
        janela.add(labelPlaca);
        janela.add(labelAno);
        janela.add(labelDtaLoc);
        janela.add(labelDtaEnt);
        janela.add(labelDadosCL);
        janela.add(labelDadosCar);
        // define campos de texto
        // dados do cliente
        JTextField textNome = new JTextField(20);
        JFormattedTextField textCPF = new JFormattedTextField(mascaraCPF);
        JFormattedTextField textTel = new JFormattedTextField(mascaraTel);
        textNome.setBounds(150, 60, 200, 20);
        textCPF.setBounds(150, 90, 200, 20);
        textTel.setBounds(150, 120, 200, 20);

        // dados do carro
        JTextField textNomeCar = new JTextField(20);
        JFormattedTextField textPlaca = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField textAno = new JFormattedTextField(mascaraAno);
        JFormattedTextField textDtaLoc = new JFormattedTextField(mascaraDtaLoc);
        JFormattedTextField textDtaEnt = new JFormattedTextField(mascaraDtaEnt);
        textNomeCar.setBounds(150, 190, 200, 20);
        textPlaca.setBounds(150, 220, 200, 20);
        textAno.setBounds(150, 250, 200, 20);
        textDtaLoc.setBounds(150, 280, 200, 20);
        textDtaEnt.setBounds(150, 310, 200, 20);

        //Adiciona os campos de texto na janela
        janela.add(textNome);
        janela.add(textCPF);
        janela.add(textTel);
        janela.add(textNomeCar);
        janela.add(textPlaca);
        janela.add(textAno);
        janela.add(textDtaLoc);
        janela.add(textDtaEnt);

        // define botão de salvar
        JButton botaoSalvar = new JButton("Salvar");
        botaoSalvar.setBounds(150, 350, 100, 30);
        botaoSalvar.addActionListener(this);

        //Adiciona o botão de salvar na janela
        janela.add(botaoSalvar);

        // define as características da janela
        setTitle("Aluguel de Veículos");
        setSize(400, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Aluguel realizado com sucesso!");
    }
}