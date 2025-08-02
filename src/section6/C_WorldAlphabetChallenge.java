package section6;

public class C_WorldAlphabetChallenge {
    public static void main(String[] args) {
        getWord('A');
        getWord('E');
        getWord('I');
        getWord('O');
        getWord('U');
        getWord('a');
    }
    public static void getWord(char alphabet) {
        switch(alphabet) {
            case 'A':
                System.out.println("America");
                break;
            case 'B':
                System.out.println("Brazil");
                break;
            case 'C':
                System.out.println("China");
                break;
            case 'D':
                System.out.println("Denmark");
                break;
            case 'E':
                System.out.println("Europe");
                break;
            case 'F':
                System.out.println("France");
                break;
            case 'G':
                System.out.println("Germany");
                break;
            case 'H':
                System.out.println("Hungary");
                break;
            case 'I':
                System.out.println("India");
                break;
            case 'J':
                System.out.println("Japan");
                break;
            case 'K':
                System.out.println("Korea");
                break;
            case 'L':
                System.out.println("Lebanon");
                break;
            case 'M':
                System.out.println("Mexico");
                break;
            case 'N':
                System.out.println("Nepal");
                break;
            case 'O':
                System.out.println("Oman");
                break;
            case 'P':
                System.out.println("Pakistan");
                break;
            case 'Q':
                System.out.println("Qatar");
                break;
            case 'R':
                System.out.println("Russia");
                break;
            case 'S':
                System.out.println("Singapore");
                break;
            case 'T':
                System.out.println("Taiwan");
                break;
            case 'U':
                System.out.println("Ukraine");
                break;
            case 'V':
                System.out.println("Vietnam");
                break;
            case 'W':
                System.out.println("Wales");
                break;
            case 'X':
                System.out.println("X-ray");
                break;
            case 'Y':
                System.out.println("Yemen");
                break;
            case 'Z':
                System.out.println("Zimbabwe");
                break;
            default:
                System.out.println("Not found!");
        }
    }

}
