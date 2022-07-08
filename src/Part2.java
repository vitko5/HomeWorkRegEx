import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part2 {
    // Зробити валідацію для емейл-адрес, зберігаті лише ті, які закінчуються на @gmail.com
    public static void main(String[] args) {
        String emailInput = "cp.advert0@gmail.com tester2228@ukr.net lamda337@gmail.com betatester5584@mail.com";

        System.out.println("Emails tt we should save: ");
        for (String strOut : parseEmail(emailInput)) {
            System.out.println(strOut);
        }
    }

    private static String[] parseEmail(String inputEmails) {
        List<String> outputList = new ArrayList<String>();
        Pattern regex = Pattern.compile(".+@gmail.com$");
        String[] inputArray = inputEmails.split(" ");
        for (String stringWord:inputArray) {
            Matcher matcher = regex.matcher(stringWord);
            if (matcher.matches()) {
                outputList.add(stringWord);
            }
        }
        return outputList.toArray(new String[0]);
    }

    // Output: cp.advert0@gmail.com lamda337@gmail.com

}
