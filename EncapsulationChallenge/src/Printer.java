public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        this.tonerLevel += tonerAmount;

        if(this.tonerLevel > 100 || this.tonerLevel < 0) {
            return -1;
        }

        return this.tonerLevel;
    }

    public int printPages(int pages) {
        int jobPages = (this.duplex) ? (pages / 2) + (pages % 2) : pages;
        this.pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
