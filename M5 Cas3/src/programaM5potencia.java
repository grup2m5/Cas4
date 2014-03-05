/**
 * Podem veure el autor i la versió del <b>programa de M5</b>
 * @author ricard
 * @version 1.0
 */
public class programaM5potencia {
/**
 * Mostrar els parametres de calcular la potència amb el seu retorn
 * @param base
 * @param exponent
 * @return
 */
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
