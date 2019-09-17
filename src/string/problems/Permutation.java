package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String example = "EAT";
        String[] newArray = example.split("");

        for (int i=0; i<newArray.length;i++){
            String newWord = "";
            newWord += newArray[i];

        }
    }
}
//Answer is eat, ate, eta,tae,tea,aet
