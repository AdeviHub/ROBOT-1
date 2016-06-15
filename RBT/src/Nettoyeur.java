
public class Nettoyeur extends Robot {
	
	public  Nettoyeur(Monde m2)throws Papiergrasexceptions {
		super (0,0,m2);
}
	public void parcourir(Monde m2){
	for (int i=0;i<10;i++){
		for(int j=0;j<10;j++){
			if( m2.matrice[i][j]==true){
			m2	.matrice[i][j]=false;	
			}
			}
	}
}
}
