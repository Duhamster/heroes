public class Dragon extends Unit implements Guard {
    public void Dragon(){
        health=100;
    }
    @Override
    public void attack(Unit unit){
        int r = (int) Math.random()*10;
        if (r<6){
            unit = null;
        } else {
            unit.setHealth(unit.getHealth()-20);
        }
    }
    @Override
    public void follow(Unit unit) {
        moveTo(unit.getPosition());
    }
    @Override
    public void kick(Unit unit){
        attack(unit);
    }
    @Override
    public void greet(Unit unit){
        System.out.println("Dragon: AARGHH!");
    }
}
