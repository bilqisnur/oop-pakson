public class playerdrone {
    public static void main(String[] args) {
        drone cupcake = new drone();
        
        cupcake.energi=10;
        cupcake.ketinggian=80;
        cupcake.kecepatan=25;
        cupcake.merek="honda";
        
        cupcake.terbang();
        cupcake.belok();
        cupcake.maju();
        cupcake.turun();
      
    }
    
}