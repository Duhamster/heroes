public class Knight extends Unit implements Guard {
    public void Knight(){
        health=30;
    }
    @Override
    public void attack(Unit unit){
        int r = (int) Math.random()*10;
        if (r<1){
            unit = null;
        } else {
            unit.setHealth(unit.getHealth()-7);
        }
    }
    @Override
    public void kick(Unit unit){
        Point poz = unit.getPosition();
        poz.setX(poz.getX()-5);
        poz.setY(poz.getY()-5);
        unit.setPosition(poz);
    }
    @Override
    public void follow(Unit unit) {
        moveTo(unit.getPosition());
    }
    @Override
    public void greet(Unit unit){
        System.out.println("Knight: Nice to see you in the Enrime, "+unit.getName());
    }
}
