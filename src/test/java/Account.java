public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        // Проверяем, что имя и фамилия удовлетворяют всем условиям
        if (name == null || name.length() < 3 || name.length() > 19) {
            return false;
        }

        // Проверяем, что в строке только один пробел, и он не в начале и не в конце
        if (name.startsWith(" ") || name.endsWith(" ")) {
            return false;
        }

        int spaceCount = name.split(" ").length - 1;
        return spaceCount == 1;
    }
}
