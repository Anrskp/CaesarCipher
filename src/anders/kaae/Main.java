package anders.kaae;

public class Main {

    private static CaesarCipher CC = new CaesarCipher();

    public static void main(String[] args) {


        System.out.println("Encrypted message with 13 shifts : " + CC.CCEncrypt("This is a secret message", 13));

        String[] allCombinations = CC.CCDecrypt("guvf vf n frperg zrffntr");
        for (int i = 0; i < allCombinations.length; i++) {
            String allCombination = allCombinations[i];
            System.out.println("shifts : " + i + "   -   message : \" " + allCombination + "\" ");
        }
    }
}
