public class WhiteSpacesRemoveInString {

    public void whiteSpacesRemoveInString(){
        String s = "java    programming   selenium      automation";

        s = s.replaceAll("\\s","");
        System.out.println(s);
    }
}
