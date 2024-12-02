package observerdesignpattern;
import java.util.*;
 public class weatherdata implements obserableinterface {
      private List<observerinterface>observers;
      private float temp;
      private float humidity;
      private float pressur;

      public weatherdata(){
        observers=new ArrayList<>();
      }

      @Override
      public void add(observerinterface obj){
        observers.add(obj);
      }

      @Override
      public void remove(observerinterface obj){
        observers.remove(obj);
      }

      @Override
      public void notifyobserver(){
          for(observerinterface observer:observers){
             observer.update(temp,humidity,pressur);
          }
      }
      public void setdata(float temp,float humidity,float pressur){
          this.temp=temp;
          this.humidity=humidity;
          this.pressur=pressur;
          notifyobserver();
      }

}
