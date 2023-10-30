package tp04_1;

public class App {
    public static void main(String[] args) {
       try {
           EntierNaturel num = new EntierNaturel(3);
           for (int i = 0; i < 4; i++) {
               num.decrement();
               System.out.println(num.getVal());
           }
       }catch (NombreNegatifException e) {
           System.out.println(e.getMessage());
       }
        System.out.println("Fin.");
    }
}
