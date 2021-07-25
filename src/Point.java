public class Point {
    private  int x;
    private  int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Point(){

    }
    public Point(int x, int y){
        this.x = x;
        this.y=y;
    }
    public double distance(){
        return (this.x+this.y);
    }
    public double distance(int x, int y){
        return -1;//Math.sqrt((x-this.x) *)
    }
}
