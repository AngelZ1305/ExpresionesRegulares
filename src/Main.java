import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
       String expresionRegular = "^[A-Za-z0-9+_.-]+@(unison\\.mx|uson\\.mx)$";
       String email1 ="a222200688@unison.mx";       // Correo Valido
       String email2 = "tacosDeAsada@uson.mx";      // Correo Valido
       String email3 = "fulanito@hotmail.com";      // Correo No Valido

        Pattern pat = Pattern.compile(expresionRegular);

        Matcher matcher_email1 = pat.matcher(email1);
        Matcher matcher_email2 = pat.matcher(email2);
        Matcher matcher_email3 = pat.matcher(email3);

        if (matcher_email1.matches()){
            System.out.println(email1 + " es valido");
        } else {
            System.out.println(email1 + " no es valido");

        }
        if (matcher_email2.matches()){
            System.out.println(email2 + " es valido");
        } else {
            System.out.println(email2 + " no es valido");

        }
        if (matcher_email3.matches()){
            System.out.println(email3 + " es valido");
        } else {
            System.out.println(email3 + " no es valido");

        }

    }
}