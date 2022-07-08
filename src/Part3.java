public class Part3 {

    // 1. Перевірити чи є в стрічці слово "Java"
    // 2. Замінити слово "Java" на "C#"
    // 3. Засінити всі слова "Java" на "C#"

    public static void main(String[] args) {
        String str = "I love Java more than my friend. Java is so beautiful.";

        // 1
        if (str.matches(".+Java.+")) {
            System.out.println("Yes. Str contain a Java word");
        }

        // 2
        String str2 = str.replaceFirst("Java","C#");
        System.out.println("New string is: " + str2);

        // 3
        String str3 = str.replace("Java","C#");
        System.out.println("New string is: " + str3);
    }
}
