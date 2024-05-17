package strings;

public class SubSequenceOfString {

    public static void main(String[] args) {
        String primary = "ABCDEF";
        String subSequence = "BEF";
        System.out.println(isSubSequence(primary, subSequence));
    }

    public static boolean isSubSequence(String primary, String subSequence) {
        int subSeqIndex = 0;
        for(int primIndex=0; primIndex<primary.length() && subSeqIndex<subSequence.length(); primIndex++) {
            if(primary.charAt(primIndex) == subSequence.charAt(subSeqIndex)) {
                subSeqIndex++;
            }
        }
        return (subSeqIndex == subSequence.length());
    }

}
