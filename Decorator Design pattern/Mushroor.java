public class Mushroor extends Topping {
     private BasePizza Pizza;
     public Mushroor(BasePizza Pizza){
        this.Pizza=Pizza;
     }

     @Override
     public int cost(){
        return this.Pizza.cost()+50;
     }
}
