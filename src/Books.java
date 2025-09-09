import static javax.swing.JOptionPane.*;

public class Books {
    String tittle;
    String pris;
    String forfatter;
    String iSBNNummer;

    public void setBooks(){
        tittle = showInputDialog("Hva er tittelen på boken: ");
        pris = showInputDialog("Hva er prisen på boken: ");
        forfatter = showInputDialog("Hvem er forfatteren på boken: ");
        iSBNNummer = showInputDialog("Hva er ISBN-Nummeret på boken: ");
    }

    //public Books(String tittle, String pris, String forfatter, String iSBNNummer){
        //this.tittle = tittle;
        //this.pris = pris;
        //this.forfatter = forfatter;
        //this.iSBNNummer = iSBNNummer;
        //}


    public void printBooks(){
        System.out.println("Tittle: " + tittle);
        System.out.println("Pris: " + pris);
        System.out.println("Forfatter: " + forfatter);
        System.out.println("iSBN-Nummer: " + iSBNNummer);

    }
}
