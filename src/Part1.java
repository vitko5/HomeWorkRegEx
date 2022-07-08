import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {
    // Користувач вводить слова з консолі, в масив додавати лише ті, що починаються на "а"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String stringInput = sc.nextLine();

        System.out.println("Words tt begin from a: ");
        for (String strOut : parseString(stringInput)) {
            System.out.println(strOut);
        }
    }

    private static String[] parseString(String stringInput) {
        List<String> outputList = new ArrayList<String>();
        Pattern regex = Pattern.compile("^a.+");
        String[] inputArray = stringInput.split(" ");
        for (String stringWord:inputArray) {
            Matcher matcher = regex.matcher(stringWord);
            if (matcher.matches()) {
                outputList.add(stringWord);
            }
        }
        return outputList.toArray(new String[0]);
    }

    // Input: a340j 409ghj 348d9f a3490j 43r8gfh
    // Output: a340j a3490j

}
