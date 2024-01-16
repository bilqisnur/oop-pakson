public class game {
    public static void main(String[] args) {
        player cupcake= new player();
        
        cupcake.name="vanila";
        cupcake.speed=60;
        cupcake.healthPoin=5;
        cupcake.damage=20;
        cupcake.shield=15;
        cupcake.run();
       
        
        if(cupcake.isDead()){
            System.out.println(cupcake.name +" GAME OVER!");
        }
        
        player enemy = new player();
        enemy.name="enemy";
        enemy.speed=50;
        enemy.healthPoin=5;
        enemy.damage=15;
        enemy.shield=10;
        
        enemy.run();
        cupcake.attack();
        enemy.defense();
    }
    
}
