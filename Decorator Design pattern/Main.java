public class Main {
    public static void main(String args[]){
        BasePizza pizza=new VegDelight();
        System.out.println("Price of VegDeligt Pizza "+pizza.cost());
        BasePizza Pizza1=new FarmHouse();
        System.out.println("Price of FarmHouse pizza: "+Pizza1.cost());
        BasePizza extrachees=new ExtraChees(pizza);
        System.out.println("Price of vegdelight pizza + extra chees: "+extrachees.cost());
        BasePizza mashroom=new Mushroor(extrachees);
        System.out.println("Vegdelight pizza + extra Chees+Mushrrom pizaa pirce: "+mashroom.cost());
        BasePizza Farm_chees_mashroom=new Mushroor(new ExtraChees(new FarmHouse()));
        System.out.println("FarmHouse pizza with chees+extra mashroom: "+Farm_chees_mashroom.cost());
    }
}
