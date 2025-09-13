import static javax.swing.JOptionPane.*;

public class oppgave1V2 {
   public String tittle;
   public String pris;
   public String forfatter;
   public String iSBNNummer;

    public void setBooks(){
        this.tittle = showInputDialog("Hva er tittelen på boken:");
        this.pris = showInputDialog("Hva er pris på boken:");
        this.forfatter = showInputDialog("Hvem er forfatter på boken:");
        this.iSBNNummer = showInputDialog("Hva er iSBNNummer på boken:");
        showMessageDialog(null, "Tittelen er: " + tittle + " pris: " + pris + "Forfatteren er: " + "iSBNummeret er: " + iSBNNummer);

    }
}

class oppgave2v22 {
    public static void main(String [] args){
        oppgave1V2 nybok = new oppgave1V2();
        nybok.setBooks();
    }
}






