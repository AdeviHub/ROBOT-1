

	public class Monde{
		 int nbl;
		 int nbc;
		 boolean [][] matrice;
		public Monde(){
		nbl=10;
		nbc=10;
		matrice=new boolean[10][10];
		for (int i=0;i<10;i++){
		for(int j=0;j<10;j++)
		{
		matrice[i][j]=false;
		}
		}
		}

		public void gras (int i, int j)throws Papiergrasexceptions{

		if ( i>9 ||  j>9){
		throw new Papiergrasexceptions();
		}

		else{
		matrice[i][j]=true;
		}

		}

		public boolean tester (int i, int j)throws Papiergrasexceptions {
		boolean test;
		if ( i>9 ||  j>9){
		throw new Papiergrasexceptions();
		}
		else{
		if (matrice[i][j]==true)
		{
		test=true;
		}
		else{ 
		test=false;
		}
		}
		return test;
		}

		public int compte(){
		int compteur=0;
		int i;
		int j;
		for ( i=0;i<10;i++){
		for( j=0;j<10;j++)
		{
		if(matrice[i][j]==true){
		compteur=compteur+1;
		}
		}
		}
		return compteur;
		}

		public void affiche(){
		for (int i=0;i<10;i++){

		for(int j=0;j<10;j++)
		{
		if (matrice[i][j]==true)
		{
		System.out.print("\t1");

		}
		else
		{System.out.print("\t0");
		}

		}
		System.out.println();



		}
		}

		
		}

	
