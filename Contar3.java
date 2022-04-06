//Contar2.java

class Conta3 {
	private int soma;
	Conta3(){
		setSoma(0);
	}
	public void setSoma(int v){
		this.soma = v;
	}
	public int getSoma(int v){
		return this.soma;
	}
	public int somando(int vini, int vfim){
		recursivo(vini, vfim);
		return soma;
	}
	public void recursivo(int vv, int vfinal){
		if (vv > vfinal) 
			return;
		soma+=vv;
		System.out.println("\n conta = "+ vv);
			vv++;
		System.out.println("\n somando = "+ soma);
		recursivo(vv, vfinal);
		System.out.println("\n terminou = "+ vv);
	}
}

class Contar3 {
	public static void main(String tex[]){
		Conta3 c;
		c = new Conta3();
		System.out.println("\n Soma = " + c.somando(1,5));
	}
}

