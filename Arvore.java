class Arvore
{
	public static void main(String t[])
	{
		CaixaA cx1,cx2,cx3,cx4,cx5,cx6,cx7;
		CaixaA raiz, aux;//guarda endereco de uma caixa
		//arvore vazia
		raiz=null;

		//cria uma caixa 1
		cx1=new CaixaA(4);//raiz->cx1
		raiz=cx1;

		//cria uma caixa 2
		cx2=new CaixaA(2);//alocacao memoria 
		cx1.setEsq(cx2);// cx2<-cx1->null

		//cria uma caixa 4
		cx4=new CaixaA(1);
		cx2.setEsq(cx4);
		
		//cria uma caixa 5
		cx5=new CaixaA(3);
		cx2.setDir(cx5);

		//cria uma caixa 3
		cx3=new CaixaA(6);//alocacao memoria
		cx1.setDir(cx3);//cx2<-cx1->cx3
		
		//Cria uma caixa 6
		cx6 = new CaixaA(5);
		cx3.setEsq(cx6);
		
		//Cria uma caixa 7
		cx7 = new CaixaA(7);
		cx3.setDir(cx7);
		
		aux = new CaixaA();
		aux.mostrarv(raiz);
		aux.imprime(raiz, 1);
	}
}
