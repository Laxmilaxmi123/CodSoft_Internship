import java.util.Scanner;
class range{
    public int generate(int max,int min){
        return (int)(Math.random()*(max-min+1)+min);
    }
}
public class Number_Grade{
    Run|Debug
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        range rg = new range();
        int TA=0;
        int win=0;
        while(true){
            System.out.println(x:"Enter the minimum number:");
            int min = s.nextInt();
            System.out.println(x:"Enter the maximum number:");
            int max = s.nextInt();
            s.nextLine();
            int c = rg.generate(max,min);
            int A = 0;
            while(true){
                System.out.println("Guess a number between"+min+"and"+max);
                int g = s.nextInt();
                A++;
                if(g>c){
                    System.out.println(x:"Its Greater");
                }
                else if(g<c){
                    System.out.println(x:"Its lower");
                }
                else{
                    System.out.println(x:"Correct guess");
                    win++;
                    break;
                }
            }
            TA = TA+A;
            System.out.println("Attempt="+A);
            System.out.println("Wins="+win);
            double winrate=(double)win/TA*100;
            System.out.printf(format:"your winrate is %2f%%\n",winrate);
            System.out.println(x:"Do you want to play again(y/n)");
            string PA = s.next();
            if(!PA.equals IsIgnoreCase(anotherString:"y")){
                s.close();
                System.exit(status:0);
            }  
            s.nextLine(); 
            } 
    }
}
