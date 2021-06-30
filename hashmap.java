
import java.util.HashMap;
import java.util.List;

public class hashmap {
    
    public static void main(String args[]) {

      System.out.println(sepnum(List.of("Ciao 33", "Hola 12", "Hello 43")));
        
    }

    public static HashMap<String, Integer> sepnum(List<String> parole){
       //con hashmap vanno specificate le variabili che conterrà. 

        HashMap<String, Integer> stringInt = new HashMap<String, Integer>(); 
        //inizializza l'Hashmap inserendo tipo delle variabili, in questo caso String e Int (numero intero)

        for (String parola : parole) {  //da chiedere
            String stringPart = parola.split(" ")[0]; //java.split() suddivide una stringa. .split prende il carattere compreso tra "" e taglia la stringa alla prima occorrenza.
            int intPart = Integer.parseInt(parola.split(" ")[1]);
            stringInt.put(stringPart, intPart); 
        }

        for (String parola : stringInt.keySet()) { //fa diventare keyset ogni stringa all'interno della lista, 
            System.out.println(parola); //ritorna il valore delle stringhe che compongono list.of
        }

        return stringInt; //ritorna la stringa di cui è stato eseguito l'hashmap 
    }
    
    // TEST
    
    
}
