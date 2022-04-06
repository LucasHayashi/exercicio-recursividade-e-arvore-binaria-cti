//Contar2.java

class Conta4 {
	private int soma;
	Conta4(){
		setSoma(0);
	}
	public void setSoma(int v){
		this.soma = v;
	}
	public int getSoma(int v){
		return this.soma;
	}
	public int somando(int vini, int vfim){
		soma=recursivo(vini, vfim);
		return soma;
	}
	public int recursivo(int vv, int vfinal){
		if (vv > vfinal) return 0;
		System.out.println("\n conta = "+ vv);
		System.out.println("\n somando = "+ soma);
		System.out.println("\n terminou = "+ vv);
		return vv+recursivo(vv+1, vfinal);
	}
}

class Contar4 {
	public static void main(String tex[]){
		Conta4 c;
		c = new Conta4();
		System.out.println("\n Soma = " + c.somando(1,5));
	}
}

