package section8.b_encapsulation_challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel>=0 && tonerLevel<=100) ? tonerLevel : -1;
        pagesPrinted = 0;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount) {
        if (tonerAmount>0 && tonerAmount<=100 && tonerLevel+tonerAmount<=100) {
            tonerLevel += tonerAmount;
            return tonerLevel;
        }
        return -1;
    }
    public int printPages(int pagesToPrint) {
        int pages = pagesToPrint;
        if (duplex) {
            pages = (pagesToPrint/2)+(pagesToPrint%2);
            System.out.println("Printer is running in Duplex mode.");
        }
        pagesPrinted += pages;
        return pages;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
