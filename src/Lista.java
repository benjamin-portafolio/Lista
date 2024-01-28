import java.util.Iterator;

public class Lista {
	
	public NodoLista nodoInicial ;
	public NodoLista nodoFinal;
	public Integer size=0;
	
	public void agregarAlFinal(String elemento) {
		if(estaVacia()) {
			nodoInicial=nodoFinal=new NodoLista(elemento);
		}else {
			nodoFinal.siguiente=new NodoLista(elemento);
			nodoFinal=nodoFinal.siguiente;
		}
		size++;
	}
	
	public void AgregarAlInicio(String elemento) {
		if(estaVacia()) {
			nodoInicial=nodoFinal=new NodoLista(elemento);
		}else {
			nodoInicial= new NodoLista(elemento,nodoInicial);
		}
		size++;
	}
	
	
	public void mostrarElementosLista() {
		if(estaVacia()) {
			System.out.println("La lista esta vacia");
		}else {
			NodoLista nodoAux=nodoInicial;
			for(int i=0; i<size; i++) {
				System.out.println(nodoAux.devolverElemento());
				nodoAux=nodoAux.siguiente;
			}
			
		}
	//	System.out.println();
	}

	
	
	public boolean estaVacia() {
		return nodoInicial==null;
	}

}
