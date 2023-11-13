public class Bed {
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;
    private String style;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
        this.style = style;
    }

    public void make() {
        System.out.print("Bed -> Making | ");
    }
    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public String getStyle() {
        return style;
    }
}
