
public class Program {

	public static void main (String [] args){

		Monde m= new Monde();
		try{
		m.gras(4,5);
		m.gras(3,3);
		m.gras(1,1);
		}
		catch (Papiergrasexceptions e) {};

		int c=m.compte();
		System.out.println("le nombre de cases grisées est"+c);
		m.affiche();
		try{
		Robotpollueur r=new Robotpollueur(9,m);
		r.parcourir(m);
		Robotpollueur J=new Robotpollueur(8,m);
		J.parcourir(m);
	}
	catch (Papiergrasexceptions e) {};
	System.out.println("POLLUEUR");
	
	m.affiche();
	System.out.println("NETTOYEUR");
	try{
	Nettoyeur n=new Nettoyeur(m);
	n.parcourir(m);
	m.affiche();
	}
	catch (Papiergrasexceptions e) {};
	Fenetre fen= new Fenetre();
	}
	
	}


