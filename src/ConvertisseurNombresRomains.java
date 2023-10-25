public class ConvertisseurNombresRomains {
    public static String Convertir(int chiffreArabe) {

        String resultat = "";

        if (chiffreArabe == 1) {
            resultat = "I";
        } else if (chiffreArabe == 2) {
            resultat = "II";
        }
        else if (chiffreArabe == 3) {
            resultat = "III";
        } else if (chiffreArabe == 4){
            resultat ="IV";
        } else if (chiffreArabe == 5){
            resultat = "V";
        }

        return resultat;
    }
}