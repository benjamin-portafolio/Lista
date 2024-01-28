
public class NodoLista {
	String dato;
	NodoLista siguiente;
	
	NodoLista(String datoIn){
		dato=datoIn;
	}
	
	NodoLista(String datoIn, NodoLista nodo){
		dato=datoIn;
		siguiente=nodo;
	}
	
	public String devolverElemento() {
		return dato;
	}

}
