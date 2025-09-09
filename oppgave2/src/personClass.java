import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class personClass {
    String name;
    String address;
    String tlfNumber;
    String age;

    public void SetPersonClass(){
      name = showInputDialog("Hva er navnet ditt: ");
      address = showInputDialog("Hva er din addresse: ");
      tlfNumber = showInputDialog("Hva er ditt telefon nummer: ");
      age = showInputDialog("Hva er ditt fødtsels år:");

        try{
            int ageTall = Integer.parseInt(age);
            int fødelseår = 2025-ageTall;
            showMessageDialog(null,"\nNavn: " + name +
                    "\nAdresse: " + address + "\nTelefon nummer: " + tlfNumber +
                    "\nAlder: " + fødelseår);

        } catch(Exception e){
            showMessageDialog(null,"Du må skrive inn et tall");

        }

    }

}


