package hash;

import java.util.HashMap;
import java.util.Hashtable;

public class EjemploHashMap {
	public static void main(String[] args) {
		HashMap<Integer,Puntero> tabla= new HashMap<>();
		Hashtable<Integer, Puntero> tabla2= new Hashtable();
		tabla.put(5, new Puntero(4,4));
		tabla.put(5, new Puntero(5,4));
		System.out.println(tabla.get(5));
	}

	
}
class Puntero{
	int coordenadaX;
	int coordenadaY;
	Puntero(int x, int y){
		coordenadaX=x;
		coordenadaY=y;
	}
	@Override
	public String toString() {
		return ""+coordenadaX+","+coordenadaY;
	}
}