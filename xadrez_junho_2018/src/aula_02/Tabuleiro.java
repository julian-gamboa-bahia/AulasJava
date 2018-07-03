package aula_02;

import java.awt.*;
import javax.swing.JFrame;


public class Tabuleiro extends JFrame {

   //Usando apenas os carateres pode-se construir um tabuleiro simples de xadrez

    private EtiquetaEspacoListener[] labels = new EtiquetaEspacoListener[] {

    // Peças Brancas
    new EtiquetaEspacoListener("\u2656"), new EtiquetaEspacoListener("\u2658"), new EtiquetaEspacoListener("\u2657"), 
    new EtiquetaEspacoListener("\u2655"), new EtiquetaEspacoListener("\u2654"), new EtiquetaEspacoListener("\u2657"), 
    new EtiquetaEspacoListener("\u2658"), new EtiquetaEspacoListener("\u2656"), new EtiquetaEspacoListener("\u2659"), 
    new EtiquetaEspacoListener("\u2659"), new EtiquetaEspacoListener("\u2659"), new EtiquetaEspacoListener("\u2659"),
    new EtiquetaEspacoListener("\u2659"), new EtiquetaEspacoListener("\u2659"), new EtiquetaEspacoListener("\u2659"), 
    new  EtiquetaEspacoListener("\u2659"), 
    // Outros espaços
    new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), 
    new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), 
    new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), 
    new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), 
    new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), 
    new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), 
    new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), 
    new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "),
    new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), 
    new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "), 
    new EtiquetaEspacoListener(" "), new EtiquetaEspacoListener(" "),
    // peças negras
    new EtiquetaEspacoListener("\u265F"), new EtiquetaEspacoListener("\u265F"), new EtiquetaEspacoListener("\u265F"), 
    new EtiquetaEspacoListener("\u265F"), new EtiquetaEspacoListener("\u265F"), new EtiquetaEspacoListener("\u265F"), 
    new EtiquetaEspacoListener("\u265F"), new EtiquetaEspacoListener("\u265F"), new EtiquetaEspacoListener("\u265C"), 
    new EtiquetaEspacoListener("\u265E"), new EtiquetaEspacoListener("\u265D"), new EtiquetaEspacoListener("\u265B"), 
    new EtiquetaEspacoListener("\u265A"), new EtiquetaEspacoListener("\u265D"), new EtiquetaEspacoListener("\u265E"), 
    new EtiquetaEspacoListener("\u265C")
    };

    public Tabuleiro() 
    {

    } 

    void display()
    {
        setTitle("Teste do Tabuleiro");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container contentPane = getContentPane();
        GridLayout gridLayout = new GridLayout(8, 8);

        contentPane.setLayout(gridLayout);

        int row = -1;
        for (int i = 0; i < labels.length; i++) 
        {
            if(i % 8 == 0) row ++; 
            labels[i].set(i, row);
            //colocamos elementos de memoria
            labels[i].vetor(labels);
            contentPane.add(labels[i]);
        } // i

        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
     } 

} 