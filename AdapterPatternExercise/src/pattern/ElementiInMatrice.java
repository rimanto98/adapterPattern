package pattern;


public class ElementiInMatrice {
	
	private int[][] matriceElementi;
	
	
	
	public ElementiInMatrice(int[][] matriceElementi) {
		super();
		this.matriceElementi = matriceElementi;
	}

	public void setElemento (int x, int y,int valore)
	{
		matriceElementi[x][y] = valore;
	}
	
	public int getElemento (int x,int y)
	{
		return matriceElementi[x][y];
	}
}
