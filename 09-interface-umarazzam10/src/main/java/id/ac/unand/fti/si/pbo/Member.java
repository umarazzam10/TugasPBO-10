package id.ac.unand.fti.si.pbo;

public abstract class Member implements CanGetDiskon{
    protected Integer poin = 0;
    public Integer totalBayar = 0;
    public Integer saldo = 10000000;
    
    public Integer getPoin(){
        if (this.totalBayar >= 10000){
            Integer x = 0;
            for (Integer i = 10000; i <= this.totalBayar;){
                this.totalBayar = this.totalBayar - 10000;
                x++;
            }
            this.poin = this.poin + x;
        }
        return this.poin;
    }

    public void redeemPoin(Integer hargaSouvenir){
        this.poin = this.poin - hargaSouvenir;
    }

    protected Integer getBonusPoin(Integer totalBayar){
        Integer poin = (int) (totalBayar / 10000);
        return poin;
    }


}
