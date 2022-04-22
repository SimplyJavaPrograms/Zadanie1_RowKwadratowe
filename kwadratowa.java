import java.lang.Math;

class HelloWorld {
    public static void main(String[] args) {
        
        if (args.length != 3){
            System.out.println("Program potrzebuje 3 agrumentow. Podaj wspolczynniki w kolejnosci a b c");
            System.exit(1);
        }

        double a,b,c,x1,x2,delta;

            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);

            delta = Math.pow(b,2) - 4 * a *c;

             if (delta == 0){

                 x1 =- b / ( 2 * a );
                 System.out.println("Rownanie ma jedno rozwiazanie: \n x1 = " + x1);

             } else if (delta > 0){

                delta = Math.sqrt(delta);
                x1 =( - b - delta ) /( 2 * a );
                x2 =( - b + delta ) /( 2 * a );
                System.out.println("Rownanie ma dwa rozwiazania: " + "x1 = " + x1 + " x2 = " + x2);

             } else {

                 System.out.println("To rownianie nie ma rozwiazan w zbiorze liczb rzeczywistych");

             }

        

    }
}