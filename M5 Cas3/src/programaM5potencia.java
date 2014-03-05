
public class programaM5potencia {

	// Mòdul potència aa
	public static int calcularPotencia(int base, int exponent) {
		int resultat = 1;
		if(base > 0){
			if(exponent > 0){
				for(int i=0;i < exponent; i++){
					resultat = resultat * base;
				}
			}
			else{
				resultat = 1;
			}
		}
		else if(base < 0){
			if(exponent > 0){
				for(int i=0;i < exponent; i++){
					resultat = resultat * base;
				}
			}
			else{
				resultat = 1;
			}
		}
		else{
				resultat = 0;
		}
		return resultat;
	}

}
