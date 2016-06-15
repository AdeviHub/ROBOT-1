
abstract class Robot{
 int posx; 
 int posy;
private Monde m;

public Robot(int a,int b, Monde m1)throws Papiergrasexceptions{
m= m1;
posx=a;
posy=b;

}
public Robot(Monde m1)throws Papiergrasexceptions{
m=m1;
posx=(int)Math.random()*(9-0);
posy=(int)Math.random()*(9-0);

}
public void deplace(int i, int j, Monde m1) throws Papiergrasexceptions{
m=m1;
if ( i>9 ||  j>9 || m.tester(i,j)==true ){
throw new Papiergrasexceptions();
}

else
{
posx=i;
posy=j;
m.gras(i,j);
}

}

abstract void parcourir(Monde m1)throws Papiergrasexceptions;


}
