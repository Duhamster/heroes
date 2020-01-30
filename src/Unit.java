public class Unit {
    private String name;
    protected int health;
    private int power;



    private Point position;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public Unit(String name, Point p) {
        this.name = name;
        position = p;
    }

    public Unit(String name) {
        this(name, new Point(1, 1));
    }

    public Unit() {
        this("Неопознанный чужестранец");
    }

    public String getName() {
        return name;
    }

    public void moveTo(Point p) {
        System.out.println(String.format("%s перемещается на %s", this.getName(), p));
    }
}
