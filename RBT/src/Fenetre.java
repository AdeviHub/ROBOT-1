
import java.awt.BorderLayout;
 
 import javax.swing.*; 
 import java.awt.*;
 import javax.swing.border.Border;
 
 import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.*;
 public class Fenetre extends JFrame implements ActionListener{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//private static final ActionEvent  = null;
	JButton a;
	JButton v;
	 JButton y;
	 JButton d;
	 JButton Z;
	 JButton Q;
	 JButton r;
	 JButton t;
	 JButton g;
	 JButton x;
	 JButton c;
	 JButton z;
	 JButton w;
	boolean action;
	private static JButton[][] tab;
	  Panel s= new Panel();
	  Border ligne=BorderFactory.createLineBorder(Color.BLUE);
	  static boolean test;
	private static Fenetre f;
public Fenetre(){
	
	
	 Panel e= new Panel();
	   Panel f = new Panel();
	   Panel h= new Panel();
	   Panel è=new Panel();
	   Panel é=new Panel();
	   Panel à=new Panel();
	   //add ("South", è);
	   
     this.setTitle("ROBOT");
     this.setSize(300, 300);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setLocationRelativeTo(null);
     //On définit le layout à utiliser sur le content pane
     this.setLayout(new BorderLayout());
     //On ajoute le bouton au content pane de la JFrame
     //Au centre
   
  
     //Au sud
     
     //À l'ouest
     
     //À l'est
    
     this.setVisible(true);
     e.setLayout (new GridLayout (4,0));
     Z=new JButton("POLLUEUR LIBRE");
     Z.addActionListener(this);
	   e.add (Z);
	  Q = new JButton ("POLLUEUR SAUTEUR");
	   Q.addActionListener(this);
	   e.add(Q);
	   
	    t=new JButton ("POLLUEUR SMART");
	    t.addActionListener(this);
	   e.add(t);
	   
   r=new JButton ("RECAPITULATIF");
   r.addActionListener(this);
   e.add(r);
     add ("West", e);
     f.setLayout (new GridLayout (0,4));
      c=new JButton("PAPIER GRAS ");
     f.add (c);
     c.setBackground(Color.white);
     c.addActionListener(this);
      d=new JButton("POLLUER TOUT");
     f.add (d);
     d.setBackground(Color.white);
     d.addActionListener(this);
      g=new JButton("REINITIALISATION");
      g.addActionListener(this);
     f.add (g);
     g.setBackground(Color.white);
     a=new JButton("QUITTER");
     a.addActionListener(this);
     f.add (a);
     a.setBackground(Color.white);
     add ("North", f);
     h.setLayout (new GridLayout (5,0));
      x=new JButton("ROBOT DROIT");
      x.addActionListener(this);
	   h.add (x);
	    y=new JButton("NETTOYEUR SAUTEUR");
	    y.addActionListener(this);
   h.add (y);
    z=new JButton("NETTOYEUR DROIT");
    z.addActionListener(this);
   h.add (z);
    v=new JButton("NETTOYEUR SMART");
    v.addActionListener(this);
    v.setBackground(Color.white);
   h.add (v);
    w=new JButton("NETTOYEUR LIBRE");
    w.addActionListener(this);
   h.add (w);
   add ("East", h);
   //Grille centrale
   s.setLayout (new GridLayout (10,10));
    setTab(new JButton[10][10]);
    test=true;
   for (int i=0; i<10; i++){
	   for (int J=0; J<10; J++){  
	 JButton b=new JButton("");
	 getTab()[i][J]=b;
   s.add (getTab()[i][J]);
   getTab()[i][J].setBorder(ligne);
   getTab()[i][J].setBackground(Color.red);
	   }
 
   }
   add ("Center",s);
//abel label2=new JLabel("Case sale");
// è.add(label1);
 é.add(è);
 è.setBackground(Color.RED);
 è.setPreferredSize(new Dimension(150,150));
 é.add(à);
 
 //é.add(label2);
   //Panel propre= new Panel();
   
  
   à.setBackground(Color.BLACK );
   à.setPreferredSize(new Dimension(50,50));
  // propre.add(label1);
   JButton k=new JButton("");
   
   k.setBackground(Color.green);
   //add("South",propre);
   
  // propre.add(label2);
 
   s.setBackground(Color.BLUE);
   }


//Gestion des évènements

	

	 
		
		
	
public void actionPerformed (ActionEvent e){
	//Bouton quitter
	if (e.getSource()==a){
	
		 this.setVisible(false);
	      this.dispose();	
	}
	else if(e.getSource()==x){
		int n=lire("Donnez un numero de colonne");
		for(int i=0;i<10;i++){
		 

			Fenetre.getTab()[i][n].setBackground(Color.BLACK);
	}
	}
	//BOUTON NETTOYER
	else if (e.getSource()==g)  {
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){ 

			 Fenetre.getTab()[i][j].setBackground(Color.RED);
	}
		
		}
	}
		else if (e.getSource()==d)  {
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){ 

				 Fenetre.getTab()[i][j].setBackground(Color.black);
		}
			
			}
	}
	
		else if (e.getSource()==Z){
			//int E=lire("Donnez un numero de ligne");	
			//int F=lire("Donnez un numero de COLONNE");
			Fenetre.getTab()[(int)(Math.random()*10)][(int)(Math.random()*10)].setBackground(Color.black);
		}
		else if (e.getSource()==Q){
			int k=0;
			
			int H=lire("Donnez un numero de colonne");	
			int V=lire("Donnez le nombre de cases sautées");
			 Fenetre.getTab()[0][H].setBackground(Color.black);
			while(k<10){ 
				 Fenetre.getTab()[k+V][H].setBackground(Color.black);
				 
				 k=k+V;
				 
		}
			
		}
		else if (e.getSource()==t){
		int k=0;
		int i=0;
		int j=0;
		for( i=0;i<10;i++){
			for( j=0;j<10;j++){ 
				if (Fenetre.getTab()[i][j].getBackground()!=Color.red){
					k=k+1;
			}
	}
		}
		JOptionPane.showMessageDialog( null, "le nombre de cases déja polluées est "+k);
			int a=lire("Donnez un numero de ligne");	
			int b=lire("Donnez un numero de COLONNE");
			//Color black = null;
			if (Fenetre.getTab()[a][b].getBackground()==Color.black){
				JOptionPane.showMessageDialog( null, "Case déja polluée");
			}
			else{
				Fenetre.getTab()[a][b].setBackground(Color.blue);	
			}
			
		}
		else if (e.getSource()==v){
			int i=0;
			int j=0;
			int k=0;
			for( i=0;i<10;i++){
				for( j=0;j<10;j++){ 
					if (Fenetre.getTab()[i][j].getBackground()!=Color.red){
						k=k+1;
				}
				}
			}
	        	for( i=0;i<10;i++){
						for( j=0;j<10;j++){ 
							Fenetre.getTab()[i][j].setBackground(Color.red);
							
						}	
		}
	        	
	        	JOptionPane.showMessageDialog( null, "le nombre de cases nettoyées est "+k);    	
		}
		else if(e.getSource()==y){
int k=0;
			
			int H=lire("Donnez un numero de colonne");	
			int V=lire("Donnez le nombre de cases sautées");
			 Fenetre.getTab()[0][H].setBackground(Color.red);
			while(k<10){ 
				 Fenetre.getTab()[k+V][H].setBackground(Color.red);
				 
				 k=k+V;
		}
		}
		else if(e.getSource()==c){
			int a=lire("Donnez un numero de ligne");	
			int b=lire("Donnez un numero de COLONNE");	
			Fenetre.getTab()[a][b].setBackground(Color.black);
		}
		else if(e.getSource()==z){
			
			int b=lire("Donnez un numero de COLONNE");
			for (int i=0; i<10;i++){
			Fenetre.getTab()[i][b].setBackground(Color.red);
		}
		}
else if(e.getSource()==r){
	int k=0;
	int i=0;
	int j=0;
	int m=0;
	for( i=0;i<10;i++){
		for( j=0;j<10;j++){ 
			if (Fenetre.getTab()[i][j].getBackground()!=Color.red){
				k=k+1;
		}
}			
			
		}
	for(int a=0;a<10;a++){
		for( int b=0;b<10;b++){ 
			if (Fenetre.getTab()[a][b].getBackground()==Color.blue){
			 m=m+1;
		}
}			
			
		}
	
	JOptionPane.showMessageDialog( null, "Le nombre de cases déja polluées est "+k+"\n"+" Le  nombre de pollueurs smart est "+m);
	
}
else if(e.getSource()==z){
	
	int b=lire("Donnez un numero de COLONNE");
	for (int i=0; i<10;i++){
	Fenetre.getTab()[i][b].setBackground(Color.red);
}
}
	else if(e.getSource()==w){
		Fenetre.getTab()[(int)(Math.random()*10)][(int)(Math.random()*10)].setBackground(Color.red);	
	
}
}	

	
   public static void main(String[] args) {
	  
	   f = new Fenetre();
	
	}
   public static int  lire(String question) {
		  
	 boolean correct=false;
	 int valeur=0;
	 do{
		 String rep=JOptionPane.showInputDialog(null, question);
		 if (rep==null) break;
		 try
		 {
			 valeur=Integer.parseInt(rep);
			 if (valeur>=0) correct =true;
			 if (valeur>10) correct=false;
		 }
		catch (NumberFormatException ex){}
		if (!correct) JOptionPane.showMessageDialog(null, "Numero  incorrect. Bien vouloir donner un numero entre 0 et 10");
	 }
	 while(!correct);
	 return valeur;
	 }
   
	
  


public static JButton[][] getTab() {
	return tab;
}



public static void setTab(JButton[][] tab) {
	Fenetre.tab = tab;
}
  
	}
   
 



