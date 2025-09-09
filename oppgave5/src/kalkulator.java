import static javax.swing.JOptionPane.*;

public class kalkulator {
        String tallA;
        String tallB;
        double tallADouble;
        double tallBDouble;
        double addisjon;
        double subtraction;
        double multiplication;
        double division;

        public void setNumbers(){
        tallA = showInputDialog("Hva er ditt første desimaltall: ");
        tallB = showInputDialog("Hva er ditt andre desimaltall: ");
        tallADouble = Double.parseDouble(tallA);
        tallBDouble = Double.parseDouble(tallB);
            addisjon = tallADouble + tallBDouble;
            subtraction = tallADouble - tallBDouble;
            multiplication = tallADouble * tallBDouble;
            division = tallADouble / tallBDouble;

        }

        //public void getAddisjon(){
        //    addisjon = tallADouble + tallBDouble;
        //}

        //public void getSubtraction(){
        //    subtraction = tallADouble - tallBDouble;
        //}

        //public void getMultiplication(){
        //    multiplication = tallADouble * tallBDouble;
        //}

        //public void getDivisjon(){
        //    division = tallADouble / tallBDouble;
        //}

        public void getSum(){
            System.out.println("Første tall pluss andre tall: " + addisjon);
            System.out.println("Første tall minus andre tall: " + subtraction);
            System.out.println("Første tall multipliser med andre tall: " + multiplication);
            System.out.println("Første tall delt på andre tall: " + division);

        }


}

