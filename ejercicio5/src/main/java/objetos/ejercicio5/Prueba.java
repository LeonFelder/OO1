package objetos.ejercicio5;

public class Prueba {

	public static void main(String[] args) {
		Mamifero nala = new Mamifero("Nala");
		Mamifero melquiades = new Mamifero("Melquiades");
		Mamifero mufasa = new Mamifero("Mufasa");
		Mamifero alexa = new Mamifero("Alexa");
		Mamifero elsa = new Mamifero("Elsa");
		Mamifero scar = new Mamifero("Scar");
		Mamifero sarabi = new Mamifero("Sarabi");
		Mamifero anonimo = new Mamifero();

		alexa.setPadre(mufasa);
		alexa.setMadre(sarabi);
		mufasa.setPadre(melquiades);
		mufasa.setMadre(nala);
		sarabi.setPadre(scar);
		sarabi.setMadre(elsa);
		
		mufasa.tieneComoAncestroA(anonimo);
	}

}
