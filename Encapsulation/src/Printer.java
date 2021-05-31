public class Printer {

    //Printer class instances
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    //Printer class constructor
    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    //Printer class methods
    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            return (tonerAmount + tonerLevel > 100) ? -1 : (tonerLevel += tonerAmount);
        }
        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = (duplex) ? (Math.round((float) pages/2)) : pages;
        pagesToPrint += pagesPrinted;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
