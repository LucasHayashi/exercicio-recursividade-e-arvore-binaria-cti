//Contar2.java

class Conta2 {
	private int conta;
	Conta2(){
		setConta(0);
	}
	public void setConta(int v){
		this.conta = v;
	}
	public int getConta(int v){
		return this.conta;
	}
	public void contando(int vini, int vfim){
		recursivo(vini, vfim);
	}
	public void recursivo(int vv, int vfinal){
		if (vv > vfinal) 
			return;
		System.out.println("\n conta = "+ vv);
			vv++;
		recursivo(vv, vfinal);
	}
}

class Contar2 {
	public static void main(String tex[]){
		Conta2 c;
		c = new Conta2();
		c.contando(1,10);
	}
}
