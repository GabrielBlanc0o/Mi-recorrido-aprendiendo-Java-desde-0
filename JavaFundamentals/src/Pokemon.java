
public class Pokemon {

	String nombre;
	int level;
	
	Pokemon(){
		level = 1;
	}
	
	Pokemon(String pNombre, int pLevel){
		pNombre = nombre ;
		pLevel = level;
	}
	
	
	void ataque() {
		System.out.println(nombre + " ataca!");
	}
	
	
}
