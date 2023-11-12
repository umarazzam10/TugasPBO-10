package id.ac.unand.fti.si.pbo;

public class MemberReguler extends Member {

    @Override
    public Integer hitungTotalBayar(Integer totalBayar) {
        if (totalBayar >= 500000 && totalBayar <= 1000000){
            totalBayar = totalBayar - totalBayar * 1/100;
            this.totalBayar = totalBayar;
        }
        if (totalBayar > 1000000 && totalBayar <= 7000000){
            totalBayar = totalBayar - totalBayar * 2/100;
            this.totalBayar = totalBayar;
        }
        else if (totalBayar > 7000000){
            totalBayar =  totalBayar - totalBayar * 3/100;
            this.totalBayar = totalBayar;
        }
        
        this.totalBayar = totalBayar;
        return this.totalBayar;
    }

    void display(){
        System.out.println("Total =  " + totalBayar);
    }
}
