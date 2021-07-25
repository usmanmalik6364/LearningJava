public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;
    public void make(){
        System.out.println("bed is being made");
    }

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilt() {
        return quilt;
    }

    public int getSheets() {
        return sheets;
    }
}
