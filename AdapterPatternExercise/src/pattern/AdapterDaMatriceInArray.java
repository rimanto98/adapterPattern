package pattern;

public class AdapterDaMatriceInArray extends ElementiInMatrice{
	
	private ElementiInArray elementiInArray;

	public AdapterDaMatriceInArray(int[][] matriceElementi) {
		super(matriceElementi);
		
		elementiInArray = new ElementiInArray();
		
		for (int i = 0;i<3;i++)
			for (int j = 0;j<3;j++)
			{
				elementiInArray.add(matriceElementi[i][j]);

			}

	}
	
	@Override
	public int getElemento(int x, int y) {
		return elementiInArray.getElemento((x*3)+y);
	} 
}
