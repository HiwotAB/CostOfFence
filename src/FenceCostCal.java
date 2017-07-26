import java.util.Scanner;

public class FenceCostCal { //Class Start 

    public static void main(String[] args) { //Main Function 
        //Declaration of variables 
    	int length,width;
        String type;
        double typePrice=0.0;
        Double totalCost=0.0;
        int gate=0;
        int buildPermit=50;
        double calfenceCost=0.0;
      
        Scanner scan =new Scanner(System.in);//Input from the user 
        System.out.print("Please Enter the length of the fence:");//Display to the user to input the length of fence.
        length=scan.nextInt();//Accept values of length from the user and assign to the length variable.
        System.out.print("Please Enter the width of the fence:");//Display to the user to input the width of fence.
        width=scan.nextInt();  //Accept values of width from the user and assign to the width variable. 
        System.out.print("Please Enter the type of the fence i.e (wooden/Chain-Link):");//Display to the user to input the type of fence.
        type=scan.next();//Accept values of type from the user and assign to the type variable.
        System.out.print("Please Enter the gate of the fence:");	//Display to the user to input the gate of fence. 
        gate=scan.nextInt();//Accept values of gate from the user and assign to the gate variable.
        if (gate==1){ //Check the gate value that come from the user and set it.
    	 gate=150;
        }
        else if (gate==2){
    	 gate=gate+300;
        }
    	 
        else if (gate==3){
    	 gate=gate+450;
        }
        if(type.equalsIgnoreCase("Wooden")){//Check the type value that come from the user and set it.
          // In this block of statement  Local variable declaration and there process to get the area ,the total cost and to calculate the cost of the fence type chosen by the user 
            typePrice=25;       
            int area=length*width;
            totalCost=(area*typePrice+gate)*0.06;           
            calfenceCost=totalCost+buildPermit;
            System.out.println("Cost of a Fence is:"+ calfenceCost);//Display the amount of cost of fence.
           
        }
        else if(type.equalsIgnoreCase("Chain-link")){ //Check the type value that come from the user and set it.  
        	// In this block of statement  Local variable declaration and there process to get the area ,the total cost and to calculate the cost of the fence type chosen by the user
            typePrice=15;       
            int area=length*width;
            totalCost=(area*typePrice+gate)*0.06;           
            calfenceCost=totalCost+buildPermit;
            System.out.println("Cost of a Fence is:"+ calfenceCost);//Display the amount of cost of fence.
        }
       
    
}

}

