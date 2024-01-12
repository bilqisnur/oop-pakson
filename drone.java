public class drone {
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    void terbang(){
        energi--;
        if(energi<10){
            ketinggian++;
            System.out.println(" yeyy drone terbangg.....");
        }else{
            System.out.println("energi lemah : drone tidak bisa terbang");
    }
}
    void matikanMesin(){
        if(ketinggian>0){
            System.out.println("maaf mesin tidak bisa dimatikan karena sedang terbang");
        }else{
            System.out.println("mesin dimatikan...");
        }
    }
    
void turun(){
    ketinggian--;
    energi--;
    System.out.println("drone turun");
}

void belok(){
    energi--;
    System.out.println("drone belok");
    
}

void maju(){
    energi--;
    System.out.println("drone maju");
    kecepatan++;
}

void mundur(){
    energi--;
    System.out.println("drone mundur");
    kecepatan++;
}
}

