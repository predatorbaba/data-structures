package strings;

public class LeftmostRepeatingCharacter {

    public static void main(String[] args) {
        String str = "abbbcdb";
        int index = findLeftmostRepeatingCharacterIndex(str);
        System.out.println(index);
    }

    public static int findLeftmostRepeatingCharacterIndex(String str) {
        int CHAR = 256;
        boolean[] visited = new boolean[CHAR];
        int index = -1;
        for(int i=str.length() -1; i>=0; i--) {
            if(visited[str.charAt(i)]) {
                index = i;
            } else {
                visited[str.charAt(i)] = true;
            }
        }
        return index;
    }

}
