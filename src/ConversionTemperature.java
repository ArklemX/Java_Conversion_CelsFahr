import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversionTemperature {
            //Déclaration des variables utiles
            static int conversion;
            static double valeur;
            static char encore = 'O';
    public static void main(String[] args) throws Exception {
        //Instanciation de l'objet Scanner
        Scanner scan = new Scanner(System.in);

        // Boucle pour refaire une conversion
        do {
            //Début
                //Boucle secondaire de selection du mode de convesion
                do {
                   try {
                        System.out.println("Quelle Conversion effecué ? Il n'y a que ces 2 choix possibles : \n 1-Celsius vers Fahrenheit\n 2-Fharenheit vers Celsius");
                        conversion = scan.nextInt();
                        System.out.println("Quelle valeur convertir ? ");
                        valeur = scan.nextDouble();
                   } catch (InputMismatchException e) {
                       // handle exception
                       System.out.println("Mauvais types de carctères ! Veuillez entrer des entiers svp ! ");
                       break ;
                   }
                    switch (conversion) {
                        case 1:
                            System.out.println(valeur + " °C correspond à "+arrondi(  ((  (9.0/5.0) * valeur  ) + 32) , 2) +" °F ");
                            break;
                        case 2:
                            System.out.println(valeur+" °F correspond à "+ arrondi( ( (  (valeur - 32) * 5.0   ) / 9.0 ), 2)  +" °C ");
                            break;
                        default:
                        valeur = -1;
                        System.out.println(" Mode de conversion inconnu !!!\nInconnu !! Mode 1 ou Mode 2 ???\n");
                            break;
                    }
                } while (valeur == -1);
            //Fin

            System.out.println("Nouvelle Conversion  ? (O = \" oui \" Autre = \" Non \"  )  ");
            scan.nextLine();
            encore = scan.nextLine().charAt(0);
        } while (encore == 'O');
        //Fermons le flux de l'objet Scanner
        scan.close();
    }
    public static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10,
        B);
    }
}
