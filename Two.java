package pkg2;
import pkg1.One;
  
public class Two extends One {
   public void callShowMe() {
        showMe(); // calling protected method through inheritance
    }
}