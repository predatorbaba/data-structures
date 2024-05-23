package strings;

public class OperationsOnVariable {

    public static void main(String[] args) {
        String[] operations = {"X++","++X","--X","X--"};
        int result = performOperationsOnVariable(operations);
        System.out.println(result);
    }

    public static int performOperationsOnVariable(String[] operations) {
        int result = 0;
        for(int i=0; i<operations.length; i++) {
            if(operations[i].equals("++X") || operations[i].equals("X++")) result++;
            else if(operations[i].equals("--X") || operations[i].equals("X--")) result--;
            else return -1;
        }
        return result;
    }

}
