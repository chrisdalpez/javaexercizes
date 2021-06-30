public class main {

    public static void main (String args[]) {

        String[][] mat = {{"p","c","z","g","b", "d"},
                        {"o","a","a","i","o", "e"},
                        {"r","l","n","a","r", "n"},
                        {"t","m","n","r","s", "t"},
                        {"o","a","a","a","e", "e"},};

        System.out.println(matriverba(mat));  // PortoCalmaZannaGiaraBorseDente

    }

    public static String matriverba(String[][] matrice){
    // write here
    StringBuilder sBuilder = new StringBuilder();

    for (int j = 0; j < matrice.length; j++){

        for(int i = 0; i < matrice.length; i++){

            if( i==0 ) {
                sBuilder.append(matrice[0][j].toUpperCase());
            } else {
                sBuilder.append(matrice[i][j]); 
            }

        }
    }
     return sBuilder.toString();

    }
}
