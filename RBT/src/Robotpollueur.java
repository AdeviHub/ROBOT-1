
public class Robotpollueur extends Robot{
 int numero;
 Monde m;
 

public  Robotpollueur(int num,Monde m2)throws Papiergrasexceptions {
	super (0,num,m2);
	numero=num;
	

}

void parcourir(Monde m1)throws Papiergrasexceptions{

m=m1;
for(int i=0;i<10;i++){
m.gras(i,numero);

}

}


}
