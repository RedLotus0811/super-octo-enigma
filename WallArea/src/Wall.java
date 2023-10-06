public class Wall {
    private double width;
    private double height;

    public Wall() {
        this(0, 0);
        System.out.println("Created wall!");
    }

    public Wall(double w, double h) {
        this.width = (w < 0) ? 0 : w;
        this.height = (h < 0) ? 0 : h;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    public double getArea() {
        return this.height * this.width;
    }
}
