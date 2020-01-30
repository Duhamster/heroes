
public class Sheep extends Unit{
    public Sheep(){
        health = 1;
        int i =(int)(Math.random()*10);
        if(i>7) {
            System.out.println("Овца: Бееееее");
        }
        else{
            System.out.println("Овца: Убейте меня, пожалуйста");
        }
    }
}