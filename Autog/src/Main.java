import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {


    public static void main(String args[]) {

        Autobuz a1 = new Autobuz("NT07FYA", 2, 07.00, "Luni");
        Autobuz a2 = new Autobuz("NT08FYA", 2, 07.00, "Luni");
        Autobuz a3 = new Autobuz("NT09FYA", 2, 12.00, "Luni");
        Autobuz a4 = new Autobuz("NT10FYA", 4, 18.25, "Luni");

        Autobuz a5 = new Autobuz("NT07FYA", 2, 07.00, "Marti");
        Autobuz a6 = new Autobuz("NT12FYA", 4, 07.00, "Marti");
        Autobuz a7 = new Autobuz("NT08FYA", 2, 12.00, "Marti");
        Autobuz a8 = new Autobuz("NT09FYA", 2, 18.25, "Marti");


        Autobuz b1 = new Autobuz("NT07FYA", 2, 07.00, "Miercuri");
        Autobuz b2 = new Autobuz("NT08FYA", 2, 07.00, "Miercuri");
        Autobuz b3 = new Autobuz("NT09FYA", 2, 12.00, "Miercuri");
        Autobuz b4 = new Autobuz("NT10FYA", 4, 18.25, "Miercuri");

        Autobuz b5 = new Autobuz("NT07FYA", 2, 07.00, "Joi");
        Autobuz b6 = new Autobuz("NT10FYA", 4, 07.00, "Joi");
        Autobuz b7 = new Autobuz("NT09FYA", 2, 12.00, "Joi");
        Autobuz b8 = new Autobuz("NT12FYA", 4, 18.25, "Joi");

        Autobuz v1 = new Autobuz("NT08FYA", 2, 07.00, "Vineri");
        Autobuz v2 = new Autobuz("NT09FYA", 2, 07.00, "Vineri");
        Autobuz v3 = new Autobuz("NT10FYA", 4, 12.00, "Vineri");
        Autobuz v4 = new Autobuz("NT12FYA", 4, 18.25, "Vineri");

/*il iau de la linia de comanda*/
        String ZiCalatorie = (args[0]);
        /*iau ora in format 24 ore a sistemului*/

        Calendar calendar = GregorianCalendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);


        String str1 = new String  ("Luni");

        if (ZiCalatorie.equals(str1)) {
            if (hour <= 7 && a1.NrLocuri > 0) {
                --a1.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 07.00 cu autobuzul" + a1.NrMatr);
            }

            if (hour <= 7 && a1.NrLocuri == 0 && a2.NrLocuri > 0) {
                --a2.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 07.00 cu autobuzul" + a2.NrMatr);
            }

            if (hour > 7 && hour <= 12 && a3.NrLocuri > 0) {
                --a3.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 12.00 cu autobuzul" + a3.NrMatr);
            }
            if (hour > 7 && hour <= 12 && a3.NrLocuri == 0 && a4.NrLocuri > 0) {
                --a4.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 18.25 cu autobuzul" + a4.NrMatr);
            }

            if (hour > 12 && hour <= 17 && a4.NrLocuri > 0) {
                --a4.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 18.25 cu autobuzul" + a4.NrMatr);
            }

            if (hour > 12 && a4.NrLocuri == 0) {
                System.out.println("Pt.ziua de astazi nu mai avem locuri .Incercati pentru marti!");
            }

        }


        String str2 = new String("Marti");
        if (ZiCalatorie.equals(str2)) {
            if (hour <= 7 && a5.NrLocuri > 0) {
                --a5.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 07.00 cu autobuzul" + a5.NrMatr);
            }

            if (hour <= 7 && a5.NrLocuri == 0 && a6.NrLocuri > 0) {
                --a6.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 07.00 cu autobuzul" + a6.NrMatr);
            }

            if (hour > 7 && hour <= 12 && a7.NrLocuri > 0) {
                --a7.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 12.00 cu autobuzul" + a7.NrMatr);
            }
            if (hour > 7 && hour <= 12 && a7.NrLocuri == 0 && a8.NrLocuri > 0) {
                --a8.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 18.25 cu autobuzul" + a8.NrMatr);
            }

            if (hour > 12 &&  hour <= 17 && a8.NrLocuri > 0) {
                --a4.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 18.25 cu autobuzul" + a8.NrMatr);
            }

            if (hour > 12 && a8.NrLocuri == 0) {
                System.out.println("Pt.ziua de astazi nu mai avem locuri .Incercati pentru miercuri!");
            }

        }

        String str3 = new String("Miercuri");
        if (ZiCalatorie.equals(str3)) {
            if (hour <= 7 && b1.NrLocuri > 0) {
                --b1.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 07.00 cu autobuzul" + b1.NrMatr);
            }

            if (hour <= 7 && b1.NrLocuri == 0 && b2.NrLocuri > 0) {
                --b2.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 07.00 cu autobuzul" + b2.NrMatr);
            }

            if (hour > 7 && hour <= 12 && b3.NrLocuri > 0) {
                --b3.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 12.00 cu autobuzul" + b3.NrMatr);
            }
            if (hour > 7 && hour <= 12 && b3.NrLocuri == 0 && b4.NrLocuri > 0) {
                --b4.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 18.25 cu autobuzul" + b4.NrMatr);
            }

            if (hour > 12 &&  hour <= 17 && b4.NrLocuri > 0) {
                --b4.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 18.25 cu autobuzul" + b4.NrMatr);
            }

            if (hour > 12 && b4.NrLocuri == 0) {
                System.out.println("Pt.ziua de astazi nu mai avem locuri .Incercati pentru joi!");
            }

        }


        String str4 = new String("Joi");
        if (ZiCalatorie.equals(str4)) {
            if (hour <= 7 && b5.NrLocuri > 0) {
                --b5.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 07.00 cu autobuzul" + b5.NrMatr);
            }

            if (hour <= 7 && b5.NrLocuri == 0 && b6.NrLocuri > 0) {
                --b6.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 07.00 cu autobuzul" + b6.NrMatr);
            }

            if (hour > 07.00 && hour <= 12.00 && b7.NrLocuri > 0) {
                --b7.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 12.00 cu autobuzul" + b7.NrMatr);
            }
            if (hour > 7 && hour <= 12 && b7.NrLocuri == 0 && b8.NrLocuri > 0) {
                --b8.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 18.25 cu autobuzul" + b8.NrMatr);
            }

            if (hour > 12 &&  hour <= 17 && b8.NrLocuri > 0) {
                --b4.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 18.25 cu autobuzul" + b8.NrMatr);
            }

            if (hour > 12 && b8.NrLocuri == 0) {
                System.out.println("Pt.ziua de astazi nu mai avem locuri .Incercati pentru vineri!");
            }

        }

        String str5 = new String("Vineri");
        if (ZiCalatorie.equals(str5)) {
            if (hour <= 7 && v1.NrLocuri > 0) {
                --v1.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 07.00 cu autobuzul" + v1.NrMatr);
            }

            if (hour <= 7 && v1.NrLocuri == 0 && v2.NrLocuri > 0) {
                --v2.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 07.00 cu autobuzul" + v2.NrMatr);
            }

            if (hour > 7 && hour <= 12 && v3.NrLocuri > 0) {
                --v3.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 12.00 cu autobuzul" + v3.NrMatr);
            }
            if (hour > 7 && hour <= 12 && v3.NrLocuri == 0 && v4.NrLocuri > 0) {
                --v4.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 18.25 cu autobuzul" + v4.NrMatr);
            }

            if (hour > 12 &&  hour <= 17 && v4.NrLocuri > 0) {
                --v4.NrLocuri;
                System.out.println("Ati obtinut un loc la ora 18.25 cu autobuzul" + v4.NrMatr);
            }

            if (hour > 12 && v4.NrLocuri == 0) {
                System.out.println("Pt.ziua de astazi nu mai avem locuri .Incercati pentru marti!");
            }

        }
        if (!ZiCalatorie.equals(str1) && !ZiCalatorie.equals(str2) &&!ZiCalatorie.equals(str3) && !ZiCalatorie.equals(str4) && !ZiCalatorie.equals(str5)){
            System.out.println("Introduceti formatul (Luni,Marti,...,Vineri");
        }



            }

    }


