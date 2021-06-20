interface Charging380V{
    public void charing380();
}
interface Charging220V{
    public void charing220();
}
class Chr380V implements Charging380V{
    @Override
    public void charing380(){
        System.out.println("Подключено зарядное устройство 380V");
    }
}
class Chr220V implements Charging220V{
    @Override
    public void charing220(){
        System.out.println("Подключено зарядное устройство 220V");
    }
}
class CharingAdapter220 implements Charging380V{
    Charging220V Charging220V;
    public CharingAdapter220(Charging220V Charging220V){
        this.Charging220V = Charging220V;
    }
    @Override
    public void charing380(){
        Charging220V.charing220();
    }
}
class Using{
    private Charging380V telephone;
    public Using(Charging380V telephone){
        this.telephone = telephone;
    }
    public void work(){
        telephone.charing380();
    }
}
public class Lab_15{
    public static void main(String[] args){
        Charging380V chr380 = new Chr380V();
        Using cp = new Using(chr380);
        cp.work();
        CharingAdapter220 chr220 = new CharingAdapter220(new Chr220V());
        Using cpRus = new Using(chr220);
        cpRus.work();
    }
}