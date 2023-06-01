public class Person {
    private String firstName;
    private String lastName;

    private String replaceWord;

    private String stripWhiteSpace;

    private String address = "12345 Big St., Alphabet City, CA 90210";

    private final String changeString = " alphabet ";

    private String getBuildingNumber(String address) {
        String[] splitAddress = address.split(",");
        int gettingBuildingNumber = splitAddress[0].indexOf(" ");
        String buldingNumber = splitAddress[0].substring(0,gettingBuildingNumber);
        return buldingNumber;
    }

    private String getTheStreet(String address) {
        String[] splitAddress = address.split(",");
        int gettingTheStreet = splitAddress[0].indexOf("B");
        String theStreet = splitAddress[0].substring(gettingTheStreet);
        return theStreet;
    }

    private String getCity(String address) {
        String[] splitAddress = address.split(",");
        String theCity = splitAddress[1].strip();
        return theCity;
    }

    private String getState(String address) {
        String[] splitAddress = address.split(",");
        int gettingtheState = splitAddress[2].lastIndexOf(" ");
        String theState = splitAddress[2].substring(1,gettingtheState);
        return theState;
    }

    private String getPostalCode(String address) {
        String[] splitAddress = address.split(",");
        int gettingPostalCode = splitAddress[2].lastIndexOf(" ");
        String thePostalCode = splitAddress[2].substring(gettingPostalCode + 1);
        return thePostalCode;
    }
    private String keepUperCaseName(String firstName) {
      String upperCaseFirstName = firstName.toUpperCase();
        return upperCaseFirstName;
    }
    private String changeWordForWord(String replaceWord){
        String recpalceWordForWord = replaceWord.toLowerCase().replace("cat","dog");
        return recpalceWordForWord;
    }

    private String removeWhiteSpace(String stripWhiteSpace) {
        String functionToRemoveWhiteSpace = stripWhiteSpace.strip();
        return functionToRemoveWhiteSpace;
    }

    private String stringChange(String changeString) {
        String stripString = changeString.strip();
        String changingString = stripString.replace('t','T');
        return changingString;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.firstName = "petr";
        p1.replaceWord = "I like pets, but mostly I like cat";
        p1.stripWhiteSpace = "   LOL   ";

        System.out.println(p1.keepUperCaseName(p1.firstName));
        System.out.println(p1.changeWordForWord(p1.replaceWord));
        System.out.println(p1.removeWhiteSpace(p1.stripWhiteSpace));
        System.out.println(p1.stringChange(p1.changeString) + "\n");
        System.out.println(p1.getBuildingNumber(p1.address));
        System.out.println(p1.getTheStreet(p1.address));
        System.out.println(p1.getCity(p1.address));
        System.out.println(p1.getState(p1.address));
        System.out.println(p1.getPostalCode(p1.address));
    }
}
