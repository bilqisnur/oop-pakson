public class playerdrone {
    public static void main(String[] args) {
        drone cupcake = new drone();
        
        cupcake.energi=10;
        cupcake.ketinggian=10;
        cupcake.kecepatan=10;
        cupcake.merek="honda";
        
        cupcake.terbang();
    }
    
}