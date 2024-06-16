package support;

import java.util.Random;

public class GeradorEmail {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final String DOMAIN = "@gmail.com";
    private static final Random RANDOM = new Random();

    public static String gerar() {
        StringBuilder email = new StringBuilder();
        int length = RANDOM.nextInt(10) + 1; // Gera um comprimento aleatório entre 1 e 10 para o nome do email

        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(ALPHABET.length());
            char randomChar = ALPHABET.charAt(index);
            email.append(randomChar);
      }

        email.append(DOMAIN);
        return email.toString();
    }
}