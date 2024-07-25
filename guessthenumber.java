

import java.util.Random;
import java.util.Scanner;
// create a custom class 
class GuessTheNumber{
   public int userinput,computerinput,no_of_gusess=0; // take neccesery inputs 
     
    public void userrinput(int num)
    {
        userinput=num;
    }
    // constructor to random guess the number
    public GuessTheNumber(){
        Random random = new Random();
    computerinput = random.nextInt(100);
    }
    //method to check whether user is guessing the corect number or not
    //there will be three condiddtions as mentioned below
    public boolean Iscorrect(){
        if(userinput>computerinput)
        {
            System.out.println("guessed number is higher! ");
            no_of_gusess++;
            return false;
        }
        else if(userinput<computerinput)
        {
            System.out.println("Guessed num is smaller! ");
            no_of_gusess++;
            return false;
        }
        else
        {
            System.out.println("you have Gussed tthe correct number!!....Hurray....!");
            no_of_gusess++;
            System.out.println("total no of guesses are"+no_of_gusess);
            return true;
        }


    }
}

public class guessthenumber {
    public static void main(String[] args) throws NoClassDefFoundError{
        System.out.println("welcome to the game:'guess the number' ");
        
        System.out.println("guess the number from 0-100");
        Scanner sc =new Scanner(System.in);
       
        GuessTheNumber input = new GuessTheNumber(); //instating of a object named input
        input.userrinput(sc.nextInt());  //taking input from user
        //loop will run until the user guesses the correct numbeer...
        
        while(!input.Iscorrect())
        {
            System.out.println("Guess the number again: ");
            input.userrinput(sc.nextInt());

        }

        
        
    }
    
}
