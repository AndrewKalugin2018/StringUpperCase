import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *Вводим произвольный текст.
 *Программа должна заменить в тексте первые буквы всех слов на заглавные.
 *Выводим обработанный текст на экран.
 */
public class StringUpperCase {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringIn = reader.readLine();
        String[] words = stringIn.split(" ");
        for (int i=0; i<words.length; i++){
            words[i]=Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
        }
        for (int i=0; i<words.length; i++){
            System.out.print(words[i] + " ");
        }
        reader.close();
    }
}
