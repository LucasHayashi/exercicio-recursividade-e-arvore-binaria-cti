class CaixaA
{
    private CaixaA esq;
    private int valor;
    private CaixaA dir;


    public CaixaA()
  {
        setValor(0);
        setEsq(null);
        setDir(null);
    }


    public CaixaA(int val)
{
        this();
        setValor(val);
    }


    public void setValor(int val)
  {
        this.valor = val;
    }


    public int getValor()
  {
        return this.valor;
    }


    public void setEsq(CaixaA esq)
  {
        this.esq = esq;
    }


    public CaixaA getEsq()
  {
        return this.esq;
    }


    public void setDir(CaixaA dir)
  {
        this.dir = dir;
    }


    public CaixaA getDir()
	{
        return this.dir;
    }
    
    void imprime(CaixaA a, int n)
    {
        int i;
        if (a != null)
        {
            imprime(a.getDir(), n+5);
            for (i=0; i<n; i++) {
                System.out.print(" ");
            }
            System.out.printf("%d\n",a.getValor());
            imprime(a.getEsq(), n+5);
        }
     }///outro exemplos
    
    public void mostrarv(CaixaA cx){
			if(cx ==null) return;
			System.out.println("\n indo esquerda");
			mostrarv(cx.getEsq());
			System.out.println("\n voltando esquerda");
			System.out.println("\n Valor = " + cx.getValor());
			System.out.println("\n indo direita");
			mostrarv(cx.getDir());
			System.out.println("\n voltando direita");
			return;
	}
}
