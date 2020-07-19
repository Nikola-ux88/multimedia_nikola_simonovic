
package main.multimedia_nikola_simonovic;


public class Main {
   
    public static void main(String[] args) {
        
        System.out.println("Start");
        
        Television TV1 = new Television(10, 5, true);
        TV1.printAttributes();
        
        Radio Radio1 = new Radio(93.6, 900, 'A');
        Radio1.printAttributes();
    }
    
    
}
