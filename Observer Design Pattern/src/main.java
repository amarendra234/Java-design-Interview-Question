import java.util.WeakHashMap;

import observerdesignpattern.Webdisplay;
import observerdesignpattern.phonedisplay;
import observerdesignpattern.weatherdata;

public class main {
   public static void main(String[] args){
      phonedisplay Phonedisplay=new phonedisplay();
      Webdisplay webdisplay=new Webdisplay();
      weatherdata Weatherdata=new weatherdata();
      Weatherdata.add(Phonedisplay);
      Weatherdata.add(webdisplay);
      Weatherdata.setdata(25.5f,65.0f, 1010.0f);
      Weatherdata.remove(webdisplay);
      Weatherdata.setdata(24.05f, 56.060f, 2000.0f);

   }
}
