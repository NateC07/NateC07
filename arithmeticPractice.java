import java.util.Scanner;
import java.util.Random;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("╔╦╗┌─┐┌┬┐┬ ┬  ╔═╗┬  ┌─┐┌─┐┬ ┬┌─┐┌─┐┬─┐┌┬┐┌─┐\n║║║├─┤ │ ├─┤  ╠╣ │  ├─┤└─┐├─┤│  ├─┤├┬┘ ││└─┐\n╩ ╩┴ ┴ ┴ ┴ ┴  ╚  ┴─┘┴ ┴└─┘┴ ┴└─┘┴ ┴┴└──┴┘└─┘");
        System.out.println("What would you like to practice?\nAddition,Subtraction,Multiplying or Dividing?");
        System.out.print("➤ ");
        
        
        String practiceType = input.nextLine();
        practiceType = practiceType.toLowerCase();
        
        int num1;
        int num2;
        int ans1;
        int gues;
        if(practiceType.substring(0,1).equals("a")){
            //creates addition problems
            System.out.println("Addition Chosen");
            int a = 0;
            int streak = 0;
            while(a < 3){
                
                 //remembers streak of current player
                int numR1 = random.nextInt(11) + 1; 
                int numR2 = random.nextInt(11) + 1; //generates random number components
                if(numR1 + numR2 > 10){
                //void, used to stop big equations
                }else{
                    num1 = numR1;
                    num2 = numR2;
                    System.out.println(num1 + " + " + num2 + " = ?");
                    System.out.print("➤ ");
                    gues = input.nextInt();
                    
                    if(gues == (num1 + num2)){
                        streak += 1;
                        System.out.println("Correct!\nYou have gotten " + streak + " question(s) right.");
                    }else{
                        a++;
                        System.out.println("Wrong, it was " + (num1 + num2) + "!!!\nYou have " + (3 - a) + " chances left.");
                        
                    }
                }
                
            }
            System.out.println("You got " + streak + " problem(s) right, and " + a + " problem(s) wrong.");
        }
        if (practiceType.substring(0,1).equals("s")){
            //creates subtraction
            System.out.println("Subtraction Chosen");
            int s = 0;
            int streak = 0;
            while(s < 3){
                 //remembers streak of current player
                int numR1 = random.nextInt(20) + 1; //generates the larger number
                int numR2 = random.nextInt(11) + 1; //generates random number components
                if(numR1 - numR2 <= 0){
                //void, used to stop big equations
                }else{
                    num1 = numR1;
                    num2 = numR2;
                    System.out.println(num1 + " - " + num2 + " = ?");
                    System.out.print("➤ ");
                    gues = input.nextInt();
                    if(gues == (num1 - num2)){
                        streak += 1;
                        System.out.println("Correct!\nYou have gotten " + streak + " question(s) right.");
                    }else{
                        s++;
                        System.out.println("Wrong, it was " + (num1 - num2) + "!!!\nYou have " + (3 - s) + " chances left.");
                    }
                }
            }
            System.out.println("You got " + streak + " problem(s) right, and " + s + " problem(s) wrong.");
        }
        if (practiceType.substring(0,1).equals("m")){
            
            System.out.println("Multiplication Chosen");
            int m = 0;
            int streak = 0;
            while(m < 3){
                 //remembers streak of current player
                int numR1 = random.nextInt(11) + 1; //generates the larger number
                int numR2 = random.nextInt(11) + 1; //generates random number components
                if(numR1 * numR2 <= 0 || numR1 * numR2 > 100){
                //void, used to stop big equations
                }else{
                    num1 = numR1;
                    num2 = numR2;
                    System.out.println(num1 + " * " + num2 + " = ?");
                    System.out.print("➤ ");
                    gues = input.nextInt();
                    if(gues == (num1 * num2)){
                        streak += 1;
                        System.out.println("Correct!\nYou have gotten " + streak + " question(s) right.");
                    }else{
                        m++;
                        System.out.println("Wrong, it was " + (num1 * num2) + "!!!\nYou have " + (3 - m) + " chances left.");
                    }
                }
            }
            System.out.println("You got " + streak + " problem(s) right, and " + m + " problem(s) wrong.");
        }
        if (practiceType.substring(0,1).equals("d")){
            
            System.out.println("Division Chosen");
            int d = 0;
            int streak = 0;
            while(d < 3){
                 //remembers streak of current player
                num1 = random.nextInt(10) + 1; //generates
                num2 = random.nextInt(10) + 1; //generates random number components
                int genNum = num1 * num2;
                System.out.println(genNum + " ÷ " + num2 + " = ?");
                System.out.print("➤ ");
                gues = input.nextInt();
                if(gues == num1){
                    streak += 1;
                    System.out.println("Correct!\nYou have gotten " + streak + " question(s) right.");
                }else{
                    d++;
                    System.out.println("Wrong, it was " + num1 + "!!!\nYou have " + (3 - d) + " chances left.");
                }
            }            
            System.out.println("You got " + streak + " problem(s) right, and " + d + " problem(s) wrong.");
            
        }
        
    }
}
