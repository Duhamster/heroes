public class Wizard extends Unit implements Writter,Guard {

    public Wizard(String name) {
        super(name);
            health=15;
    }

    @Override
    public void write() {
        double r = Math.random();
        String text = (Math.random() > 0.5) ? "Хм..., видимо важно, запишу." : "WTF!";
        System.out.println(getName() + ": " + text);
    }

    @Override
    public void follow(Unit unit) {
        moveTo(unit.getPosition());
    }
    @Override
    public void attack(Unit unit){
        int r = (int) Math.random()*10;
        if (r<3){
            unit = new Sheep();
        } else {
            unit.setHealth(unit.getHealth()-(int)(Math.random()*10));
        }
    }
    @Override
    public void kick(Unit unit){
        Point poz = unit.getPosition();
        poz.setX((int)(Math.random()*1000));
        poz.setY((int)(Math.random()*1000));
        unit.setPosition(poz);
    }
    @Override
    public void greet(Unit unit){
        System.out.println("Wizard: Hi golodranci, "+unit.getName());
    }
    public void heal(Unit unit){
        unit.health=unit.health+2;
    }
}
