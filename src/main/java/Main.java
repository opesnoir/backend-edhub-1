public class Main {

    public static void main(String[] args) {

        String string_voorbeeld = "Dit is een voorbeeld";
        String string_hello_world ="hello world";
        //Het is conventie om variabelen die een boolean bevatten een naam te geven die begint met "-is" of "-should". Ook is het gebruikelijk de benaming altijd volgens het format is <Positive> te beschrijven, om te voorkomen dat we dubbele ontkenningen gebruiken: boolean isComplete = false;.
        Boolean boolean_true = true;

        int int_four = 4;
        short short_minus_eight = -8;
        //achter float plaats je een f om een error te voorkomen, dit noem je postfix. Een long heeft ook een postfix, maar dat is een L.
        float float_six_point_five = 6.5f;
        double double_minus_two_point_three = -2.3;




        // Wijzig niets aan onderstaande System.out.println statements

        System.out.println(string_voorbeeld); // String Dit is een voorbeeld
        System.out.println(string_hello_world); // String hello world
        System.out.println(boolean_true); // boolean true
        System.out.println(int_four); // int 4
        System.out.println(short_minus_eight); // short -8
        System.out.println(float_six_point_five); // float 6.5
        System.out.println(double_minus_two_point_three); // double -2.3

        // Bonus: Wijs een nieuwe waarde toe aan een bestaande variabele
        string_voorbeeld = "Why are you not printing? Or are you going to? Yeah, you are printing. That is great!";
        System.out.println(string_voorbeeld); // String Dit is een aangepast voorbeeld


    }

}
