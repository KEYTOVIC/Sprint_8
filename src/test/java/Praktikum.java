public class Praktikum {

    public static void main(String[] args) {
        // Пример имени и фамилии
        String testName = "Тимоти Шаламе";

        // Создаем экземпляр Account и проверяем имя
        Account account = new Account(testName);
        boolean canEmboss = account.checkNameToEmboss();

        // Выводим результат
        if (canEmboss) {
            System.out.println("Имя и фамилия могут быть напечатаны на банковской карте.");
        } else {
            System.out.println("Имя и фамилия не могут быть напечатаны на банковской карте.");
        }
    }
}

