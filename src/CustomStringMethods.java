public class CustomStringMethods {
    public CustomStringMethods() { }

    public boolean longerThan(String myString, int maxLength) {
        if (myString.length() <= maxLength) {
            return false;
        } else {
            return true;
        }
    }

    public String funnyString(String str, int idx) {
        String letter = str.substring(idx, idx + 1);
        str = letter + str;
        str += letter;
        return str;
    }

    public String halvesReversed(String myString) {
        String firstHalf;
        int halfIdx = myString.length() / 2;
        firstHalf = myString.substring(0, halfIdx);
        String secondHalf = myString.substring(halfIdx);
        return secondHalf + firstHalf;
    }

    public String pigLatin(String orig) {
        String firstLetter = orig.substring(0, 1);
        return orig.substring(1) + firstLetter + "ay";
    }

    public String removeCharacter(String myString, int removeIdx) {
        if (myString.length() > removeIdx) {
            return myString.substring(0, removeIdx) + myString.substring(removeIdx + 1);
        } else {
            return myString;
        }
    }

    public String insertAt(String orig, String insertText, String searchStr) {
        int idx = orig.indexOf(searchStr);
        if (idx == -1){
            return orig + insertText;
        }
        return orig.substring(0, idx) + insertText + orig.substring(idx);
    }

    public String endUp(String myString, int numToCap){
        if (myString.length() >= numToCap){;
            int idx = myString.length() -  numToCap;
            return myString.substring(0, idx) + myString.substring(idx).toUpperCase();
        } else {
            return myString.toUpperCase();
        }
    }

    public String yellOrWhisper(String myString) {
        String firstLetter = myString.substring(0, 1);
        if (firstLetter.equals(firstLetter.toUpperCase())) {
            return myString.toUpperCase();
        } else {
            return myString.toLowerCase();
        }
    }

    public String starBetween(String str){
        int idx = 0;
        String starString = "";
        while (idx < str.length()){
            starString += str.substring(idx, idx + 1);
            starString += "*";
            idx ++;
        }
        return starString;
    }
}
