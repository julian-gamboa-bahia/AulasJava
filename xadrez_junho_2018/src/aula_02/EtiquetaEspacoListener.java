package aula_02;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class EtiquetaEspacoListener extends JLabel implements MouseListener{

    Font font     = new Font("Ariel", Font.PLAIN, 24);
    Color bgLight = new Color(222, 184, 135);
    Color bgDark  = new Color(139, 69, 19);
    
    int idx_global;
    int row_global;
    String label_text;
    
    EtiquetaEspacoListener EtiquetaEspaco_Tabuleiro_vetor[];

    EtiquetaEspacoListener(String s)
    {
        super(s);
    }

    void set(int idx, int row)
    {
        this.idx_global=idx;
        this.row_global=row;
//        this.label_text=getText();
        
        setFont(font);
          setOpaque(true);
          setBackground((idx+row)%2 == 0 ? bgDark : bgLight);
          setHorizontalAlignment( SwingConstants.CENTER );
          addMouseListener(this);//esta adicionando os eventos do mouse ao label     
    }
    
    void vetor(EtiquetaEspacoListener EtiquetaEspaco_Tabuleiro[])
    {
        this.EtiquetaEspaco_Tabuleiro_vetor=EtiquetaEspaco_Tabuleiro;
    }
    
    private Color background;
    
    public void mouseClicked(MouseEvent arg0) {

    }// evento q sera executado caso o mouse click no label
    public void mouseEntered(MouseEvent arg0) {

    }// evento q sera executado caso o mouse entre no label
    public void mouseExited(MouseEvent arg0) {
    }// evento q sera executado caso o mouse saia do label
    
    public void mousePressed(MouseEvent arg0) {
        System.out.println("Posicao "+idx_global+"  "+row_global+"  "+label_text);   
        
        //Cuando tocamos un espacio con una pieza, es necesario mostrar las alternativas que esta pieza tiene para moverse.
        //if(!label_text.equals(" "))
        if(!getText().equals(" "))
        {
            background = getBackground();
            setBackground(Color.RED);
            repaint();
        }
        else //Cuando tocamos un espacio vacio, es posible colocar una pieza alli.
        {
            JOptionPane.showMessageDialog(this,"Pode-se colocar uma peça aqui");
        }

    }// evento q sera executado caso o mouse seja pressionado no label
    
    public void mouseReleased(MouseEvent arg0) {
        
                if(!getText().equals(" "))
                {
                            setBackground(background);
//                            JOptionPane.showMessageDialog(this,"Por favor indique onde deseja colocar esta peça");
                            
                    int reply = JOptionPane.showConfirmDialog(null, "Deseja mover esta peça", "Peça tocada", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) 
                    {
                        String name = JOptionPane.showInputDialog(this, "Por favor indique a posiçao da peça");
                        int posicao=Integer.valueOf(name);
                        
                        if(this.EtiquetaEspaco_Tabuleiro_vetor[posicao].getText().equals(" "))
                        {
                            //coloreamos de amarillo uma 
                            setBackground(Color.YELLOW);
                            //y tambien la casilla destino
                            this.EtiquetaEspaco_Tabuleiro_vetor[posicao].setBackground(Color.YELLOW);
                            String peca=getText();
                            setText("");
                            this.EtiquetaEspaco_Tabuleiro_vetor[posicao].setText(peca);
                        }
                        else
                        {
                          JOptionPane.showMessageDialog(this,"Espaço ocupado por "+this.EtiquetaEspaco_Tabuleiro_vetor[posicao].getText());
                        }
                    }
                }

    }// evento q sera executado caso o mouse seja largado no label
}
