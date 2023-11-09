package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	private String descriptionText;
	private Boolean featured;
	private int likes;

	/*
	* Permite construir una instancia del WallpostImpl.
	* Luego de la invocación, debe tener como texto: “Undefined post”,
	* no debe estar marcado como destacado y la cantidad de “Me gusta” debe ser 0.
	*/
	public WallPostImpl() {
		descriptionText = "Undefined post";
		featured = false;
		likes = 0;
	}

	/*
	* Retorna el texto descriptivo de la publicación
	*/
	public String getText() {
		return descriptionText;
	}

	/*
	* Asigna el texto descriptivo de la publicación
	*/
	public void setText (String descriptionText) {
		this.descriptionText = descriptionText;
	}

	/*
	* Retorna la cantidad de “me gusta”
	*/
	public int getLikes() {
		return likes;
	}

	/*
	 * Incrementa la cantidad de likes en uno.
	*/
	public void like() {
		likes += 1;
	}

	/*
	 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada.
	*/
	public void dislike() {
		if (likes >0) {
			likes -= 1;
		}
	}

	/*
	 * Retorna true si el post está marcado como destacado, false en caso contrario
	*/
	public boolean isFeatured() {
		return featured;
	}

	/*
	 * Cambia el post del estado destacado a no destacado y viceversa.
	*/
	public void toggleFeatured() {
		featured = !featured;
	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
