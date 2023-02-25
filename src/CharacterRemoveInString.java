public class CharacterRemoveInString {
    public void characterRemoveInString(){
        String s = "a8.,76';834 546  fdas6544[p;. fdf[]d'";

        s = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
}
