package xadrez_junho_2018;

import java.awt.*;
import javax.swing.JFrame;


public class Tabuleiro extends JFrame {

   //Usando apenas os carateres pode-se construir um tabuleiro simples de xadrez

    private EtiquetaEspaco[] labels = new EtiquetaEspaco[] {

    // Peças Brancas
    new EtiquetaEspaco("\u2656"), new EtiquetaEspaco("\u2658"), new EtiquetaEspaco("\u2657"), 
    new EtiquetaEspaco("\u2655"), new EtiquetaEspaco("\u2654"), new EtiquetaEspaco("\u2657"), 
    new EtiquetaEspaco("\u2658"), new EtiquetaEspaco("\u2656"), new EtiquetaEspaco("\u2659"), 
    new EtiquetaEspaco("\u2659"), new EtiquetaEspaco("\u2659"), new EtiquetaEspaco("\u2659"),
    new EtiquetaEspaco("\u2659"), new EtiquetaEspaco("\u2659"), new EtiquetaEspaco("\u2659"), 
    new  EtiquetaEspaco("\u2659"), 
    // Outros espaços
    new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), 
    new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), 
    new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), 
    new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), 
    new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), 
    new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), 
    new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), 
    new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), new EtiquetaEspaco(" "),
    new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), 
    new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), new EtiquetaEspaco(" "), 
    new EtiquetaEspaco(" "), new EtiquetaEspaco(" "),
    // peças negras
    new EtiquetaEspaco("\u265F"), new EtiquetaEspaco("\u265F"), new EtiquetaEspaco("\u265F"), 
    new EtiquetaEspaco("\u265F"), new EtiquetaEspaco("\u265F"), new EtiquetaEspaco("\u265F"), 
    new EtiquetaEspaco("\u265F"), new EtiquetaEspaco("\u265F"), new EtiquetaEspaco("\u265C"), 
    new EtiquetaEspaco("\u265E"), new EtiquetaEspaco("\u265D"), new EtiquetaEspaco("\u265B"), 
    new EtiquetaEspaco("\u265A"), new EtiquetaEspaco("\u265D"), new EtiquetaEspaco("\u265E"), 
    new EtiquetaEspaco("\u265C")
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
            contentPane.add(labels[i]);
        } // i

        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
     } 

} 