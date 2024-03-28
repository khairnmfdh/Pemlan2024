import java.util.Scanner;

public class mainLCD{
    public static void main(String[] args) {
        LCD  lcd = new LCD();
        Scanner input = new Scanner(System.in);
        System.out.println("LCD INITIAL STATE");
        lcd.display();

        System.out.println("\nGUNAKAN HURUF KAPITAL!");
        lcd.statusInput();
        lcd.volumeInput();
        lcd.brightInput();
        lcd.cableInput();
        lcd.volumeDown();
        lcd.brightDown();
        

        System.out.println("\nLCD UPDATED STATE");
        lcd.display();
        
    }
    }