package anders.kaae;


class CaesarCipher {

    // Encrypt
    String CCEncrypt(String msg, int shift) {
        msg = msg.toLowerCase();

        String decryptMsg = "";
        int msgLength = msg.length();

        for (int i = 0; i < msgLength; i++) {

            if (msg.charAt(i) == ' ') {
                decryptMsg += " ";
            } else {
                char c = (char) (msg.charAt(i) + shift);
                if (c > 'z')
                    decryptMsg += (char) (msg.charAt(i) - (26 - shift));
                else
                    decryptMsg += (char) (msg.charAt(i) + shift);
            }
        }
        return decryptMsg;
    }

    // Decrypt
    String[] CCDecrypt(String msg) {
        int counter = 0;

        String[] results = new String[27];

        while (counter < 27) {
                results[counter] = CCEncrypt(msg, counter);
            counter++;
        }
        return results;
    }
}
