import static javax.swing.JOptionPane.*;

public class kalkulatorV2 {
    static String tall1Pre = showInputDialog("Hva er tall 1: ");
    static String tall2Pre = showInputDialog("Hva er tall 2: ");

    static double tall1 = Double.parseDouble(tall1Pre);
    static double tall2 = Double.parseDouble(tall2Pre);

     public static double addere(){
         double sum = kalkulatorV2.tall1 + kalkulatorV2.tall2;
         return sum;
     }
     public static double minus(){
         double sum = kalkulatorV2.tall1 - kalkulatorV2.tall2;
         return sum;
     }

     public static double multiplisere(){
         double sum = kalkulatorV2.tall1 * kalkulatorV2.tall2;
         return sum;
     }

     public static double divisjon(){
         double sum = kalkulatorV2.tall1 / kalkulatorV2.tall2;
         return sum;
     }
}

class summen{
     public static void main(String [] args){
         System.out.println("\ntall 1 + tall 2 er lik som: " + kalkulatorV2.addere());
         System.out.println("\ntall 1 - tall 2 er lik som: " + kalkulatorV2.minus());
         System.out.println("\ntall 1 * tall 2 er lik som: " + kalkulatorV2.multiplisere());
         System.out.println("\ntall 1 / tall 2 er lik som: " + kalkulatorV2.divisjon());
     }
}