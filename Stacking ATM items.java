import java.util.*;

class ATM{
    
    String name;
    String OfItems[];
    int front;
    
    ATM(){
        
        name="";
        OfItems= new String[9];
        front=-1;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the passcode");
        int x=sc.nextInt();
        if(x!=2757){
            System.out.print("Wrong Passcode entered,");
            accept();
        }
       int a=1;
        String ansq="";
       while(a!=0){
           System.out.println("MENU DRIVE press 0 to terminate the menu");
           System.out.println("1. Push inside");
           System.out.println("2. Pop outside");
           System.out.println("3.Watch the contents");
            a=sc.nextInt();
            switch(a){
               case 0:
               System.out.println("Thank you");
               break;
           
               case 1:
               System.out.println("What would you like to push inside, Thats what she said XD");
               ansq=sc.nextLine();
               ansq=sc.nextLine();
               itemspush(ansq);
               break;
               
           case 2:
               System.out.println(popitem());
               break;
           
           case 3:
               display();
               break;
           
           default:
               System.out.print("Wrong input,");
               accept();
               break;
           }
       }
    }
    void itemspush(String item){
        if(front<100){
            OfItems[++front]=item;
        }
        else{ 
            System.out.println("Overflow");
        }
    }
    String popitem(){
       if(front>0){ 
           return OfItems[front--];
        
    }
       else{
           System.out.println("AR YOU CRAZY we have no contents inside");
           return "-9999";
       }
    
}
    void display(){
        for(int i=front;i>=0;i--){
            System.out.println(i+1+"."+OfItems[i]);
        }
        System.out.println("End of contents");
        
    }
    public static void main(String[]args){
    
    ATM ob=new ATM();
    ob.accept();
}
}