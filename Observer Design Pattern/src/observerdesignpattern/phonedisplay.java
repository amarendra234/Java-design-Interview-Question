package observerdesignpattern;

public class phonedisplay implements observerinterface{
       private float temp;
       private float humidity;
       private float pressur;

       @Override
       public void update(float temp,float humidity,float pressur){
         this.temp=temp;
         this.humidity=humidity;
         this.pressur=pressur;
         display();
       }

       public void display() {
        System.out.println("Phone Display - Temp: " + 
        temp+ "°C, Humidity: " + humidity + "%, Pressure: " + pressur + " Pa");
    }
}
