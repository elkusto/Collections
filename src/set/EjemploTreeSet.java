package set;
import java.util.*;
public class EjemploTreeSet {
 
    public static void main (String[] args)
    {
        TreeSet<String> s3 = new TreeSet <String>();
        s3.addAll(Arrays.asList("Hola",
        		"Hola amigo",
        		"Encantado de conocerte",
        		"Se me hace tarde",
        		"Espero verte pronto",
        		"Adios",
        		"Adios"));//Intentamos añadir un duplicado.
        System.out.println("Numero de elementos: " + s3.size() + "\n");
        Iterator i = s3.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println(s3);
        System.out.println(s3.first());
        System.out.println(s3.last());
        System.out.println(s3.ceiling("H"));
        System.out.println(s3.floor("Hu"));
        System.out.println(s3.pollFirst());
        System.out.println(s3);
        int[] array= new int[]{1, 2,5,710,6,89,5,2,3};
        Arrays.sort(array);
        System.out.println(Arrays.binarySearch(array,710));
    }
}