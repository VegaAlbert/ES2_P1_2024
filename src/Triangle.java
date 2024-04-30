
public class Triangle {
	
	public enum Tipus { Equilater, Isosceles, Escale }
	
	public static int[] trobaTriangle( Tipus elTipus, int[] costats)
	{
		if (costats == null) {
			throw new IllegalArgumentException("Par�metre d'entrada null");
		}
		if (elTipus == null) {
			throw new IllegalArgumentException("Par�metre d'entrada null");
		}
		int i = 0, costatA, costatB, costatC;
		while( i  + 2 < costats.length )
		{
			costatA = costats[i];
			costatB = costats[i+1];
			costatC = costats[i+2];
			
			if( esTriangle(costatA, costatB, costatC) ) {
				
				if( elTipus == Tipus.Equilater && esEquilater(costatA, costatB, costatC) ) {
					return new int[] {costatA, costatB, costatC};
				}else if ( elTipus == Tipus.Isosceles && esIsosceles(costatA, costatB, costatC) ) {
					return new int[] {costatA, costatB, costatC};
				}else if ( elTipus == Tipus.Escale && esEscale(costatA, costatB, costatC) ) {
					return new int[] {costatA, costatB, costatC};
				}
			}
			i++;
		}
		return null;
	}
	
	// m�tode que retorna true si els tres segments formen un triangle
	private static boolean esTriangle( int costatA, int costatB, int costatC)
	{
		if( costatA >= 0 && costatB >= 0 && costatC >= 0)
			if( costatA < costatB + costatC && costatB < costatA + costatC && costatC < costatA + costatC)
				return true;
		return false;
	}
	
	// m�tode que retorna true si tots tres costats s�n iguals
	private static boolean esEquilater( int costatA, int costatB, int costatC) {
		return costatA == costatB && costatA == costatC;
	}
	
	// m�tode que retorna true si tots dos costats s�n iguals i un diferent
	private static boolean esIsosceles( int costatA, int costatB, int costatC) {
		if( esEquilater( costatA, costatB, costatC) )
			return false;
		return costatA == costatB || costatA == costatC || costatB == costatC;
	}

	// m�toe que retorna true si tots tres costats s�n diferents
	private static boolean esEscale( int costatA, int costatB, int costatC) {
		return costatA != costatB && costatA != costatC && costatB != costatC;
	}
	
}
