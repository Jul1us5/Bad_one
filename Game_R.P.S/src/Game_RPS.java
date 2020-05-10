/**
 *
 * @author Julius
 * Project: Game Rock Rock paper scissors
 */

    import java.util.Scanner;

public class Game_RPS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("[ 0 - Pabaiga ]");
        System.out.print("[ 1 - Akmuo ]");
        System.out.print("[ 2 - Popierius ]");
        System.out.println("[ 3 - Zirkles ]");
        System.out.println("-----------------GAME_RPS---------------");
        
        
//        int kompiuteris = (int)Math.floor(Math.random() * 3 + 1);
        
//        System.out.println(kompiuteris);

        
//                int pasirinkimas = sc.nextInt();
//                System.out.println(kompiuteris);
//                System.out.println("---------");
//                if(kompiuteris > pasirinkimas) {
//                    System.out.println("Pralaimejai");
//                } else if (kompiuteris == pasirinkimas) {
//                    System.out.println("Lygiosios");
//                } else {
//                    System.out.println("laimejai");
//                }

//            boolean pabaiga = true;
//            int kompiuteris = (int)Math.floor(Math.random() * 3 + 1);
            for(int i=0; i<=i; i++) {
                   
                   int kompiuteris = (int)Math.floor(Math.random() * 3 + 1);
                   int pasirinkimas = sc.nextInt();
                System.out.println(kompiuteris);
//                System.out.println("---------");
                
           
                if(pasirinkimas == 1 && kompiuteris == 1) {
                    System.out.println("- -[ Lygiosios! ]- -");
                }
                if(pasirinkimas == 1 && kompiuteris == 2) {
                    System.out.println("- -[ Pralaimejai.. ]- -");
                }
                if(pasirinkimas == 1 && kompiuteris == 3) {
                    System.out.println("- -[ Laimejai! ]- -");
                }
                if(pasirinkimas == 2 && kompiuteris == 1) {
                    System.out.println("- -[ Laimejai! ]- -");
                }
                if(pasirinkimas == 2 && kompiuteris == 2) {
                    System.out.println("- -[ Lygiosios ]- -");
                }
                if(pasirinkimas == 2 && kompiuteris == 3) {
                    System.out.println("- -[ Pralaimejai.. ]- -");
                }
                if(pasirinkimas == 3 && kompiuteris == 1) {
                    System.out.println("- -[ Pralaimejai.. ]- -");
                }
                if(pasirinkimas == 3 && kompiuteris == 2) {
                    System.out.println("- -[ Laimejai! ]- -");
                }
                if(pasirinkimas == 3 && kompiuteris == 3) {
                    System.out.println("- -[ Lygiosios ]- -");
                }                 


                
                if(pasirinkimas == 0) {
                    System.out.println("Pabaiga");
                    break;
                } 
                if(pasirinkimas >= 4 || pasirinkimas < 0) {
                    System.out.println("!!! [ Toks variantas negalimas ] !!!");
                    continue;
                } 
            }
        
                
    }
    
}
