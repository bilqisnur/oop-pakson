
public class player {
    String name;
    int speed;
    int healthPoin;
    int shield;
    int damage;
    
    
    
    void run(){
        System.out.println(name+" is running......");
        System.out.println("speed: "+speed);
    }
    
    boolean isDead(){
        if(healthPoin<=0)return true;
        return false;
    }
    void attack(){
        
        
        System.out.println(name+" is attacking enemy ");
    }
    void defense(){
        
        System.out.println(name+" defense");
    }
}
