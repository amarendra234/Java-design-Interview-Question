public class ExtraChees extends Topping {
    private BasePizza Pizza;
    public ExtraChees(BasePizza Pizza){
        this.Pizza=Pizza;
    }

    @Override
    public int cost(){
        return this.Pizza.cost()+20;
    }
}
