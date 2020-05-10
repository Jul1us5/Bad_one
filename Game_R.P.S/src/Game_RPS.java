/**
 *
 * @author Julius
 * Project: Game Rock Rock paper scissors
 */

    import java.util.Scanner;

public class Game_RPS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0 - Pabaiga");
        System.out.println("1 - Akmuo");
        System.out.println("2 - Popierius");
        System.out.println("3 - Zirkles");
        System.out.println("--------GAME_RPS---------------");
        
        
        int kompiuteris = (int)Math.floor(Math.random() * 3 + 1);
        
//        System.out.println(kompiuteris);

        
                int pasirinkimas = sc.nextInt();
                System.out.println(kompiuteris);
                System.out.println("---------");
                if(kompiuteris > pasirinkimas) {
                    System.out.println("Pralaimejai");
                } else if (kompiuteris == pasirinkimas) {
                    System.out.println("Lygiosios");
                } else {
                    System.out.println("laimejai");
                }
        
                
    }
    
}
