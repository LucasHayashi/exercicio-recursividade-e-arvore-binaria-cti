//Contar1.java

class Conta1 {
	private int conta;
	Conta1(){
		setConta(0);
	}
	public void setConta(int v){
		this.conta = v;
	}
	public int getConta(int v){
		return this.conta;
	}
	public void contando(int vini, int vfim){
		for(conta = vini; conta <= vfim; conta++){
				System.out.println("\n Conta = " + conta);
		}
	}
}

class Contar1 {
	public static void main(String tex[]){
		Conta1 c;
		c = new Conta1();
		c.contando(1,20);
	}
}
