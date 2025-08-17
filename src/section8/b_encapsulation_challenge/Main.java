package section8.b_encapsulation_challenge;

public class Main {
    public static void main(String[] args) {
        Printer duplexPrinter = new Printer(50, true);
        Printer singleSidePrinter = new Printer(75, false);

        System.out.println("Initial duplex printed pages: "+ duplexPrinter.getPagesPrinted());
        System.out.println(duplexPrinter.printPages(21));
        System.out.println("Final duplex printed pages: "+ duplexPrinter.getPagesPrinted());

        System.out.println("Initial single-side printed pages: "+ singleSidePrinter.getPagesPrinted());
        System.out.println(singleSidePrinter.printPages(21));
        System.out.println(singleSidePrinter.printPages(15));
        System.out.println("Final single-side printed pages: "+ singleSidePrinter.getPagesPrinted());

        System.out.println(duplexPrinter.addToner(30));
        System.out.println(duplexPrinter.addToner(50));
        System.out.println(singleSidePrinter.addToner(-100));
    }
}
