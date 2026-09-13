import java.util.*;
class Main{
    public static void main(String[] args){
        boolean infiniteLoop=true;
        double[] accountBalance=new double[1000];
        String[] accountName=new String[1000];
        int option, size=100;
        while(infiniteLoop){
            System.out.println("Welcome to Codingal Banking Service");
            System.out.println("Banking Menu:");
            System.out.println("Select any of the options below");
            System.out.println("1-> Add new customer");
            System.out.println("2-> Change customer name");
            System.out.println("3-> Check account balance");
            System.out.println("4-> Update account balance");
            System.out.println("5-> Account summary");
            System.out.println("6-> Quit");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter option to proceed ahead");
            option=sc.nextInt();
            if(option==1){
                System.out.println("\nAdd account\nMenu->");
                sc.nextLine();
                System.out.println("Enter customer name");
                String name=sc.nextLine();
                accountName[size]=name;
                System.out.println("Enter opening balance");
                double amt=sc.nextDouble();
                accountBalance[size]=amt;
                System.out.println("Account created successfully\n");
                System.out.println("Account details:\n");
                System.out.println("Account number "+(size));
                System.out.println("Account name "+accountName[size]);
                System.out.println("Account balance "+accountBalance[size]+" Rs\n");
                System.out.println("==================");
                size=size+1;
            }
            else if(option==2){
                System.out.println("\nChange customer name menu");
                System.out.println("\nEnter your account number");
                int accountIndex;
                String temp;
                accountIndex=sc.nextInt();
                sc.nextLine();
                if(accountIndex>size){
                    System.out.println("Account does not exist");
                    System.out.println("Terminating....");
                }
                else{
                    temp=accountName[accountIndex];
                    System.out.println("Enter the new name");
                    String name=sc.nextLine();
                    accountName[accountIndex]=name;
                    System.out.println("Name is successfully updated from "+temp+" to "+name+"\n");
                }
                System.out.println("==================");
            }
            else if(option==3){
                System.out.println("\nCheck account balance");
                System.out.println("\nEnter account number");
                int accountIndex;
                accountIndex = sc.nextInt();
                if (accountIndex > size) {
                    System.out.println("Account does not exist");
                    System.out.println("Terminating....");
                }
                else{
                    System.out.println(accountName[accountIndex]+" your balance is "+accountBalance[accountIndex]+" Rs.");
                }
                System.out.println("==================");
            }
            else if(option==4){
                System.out.println("\nUpdate account balance menu");
                System.out.println("\nEnter account number");
                int accountIndex;
                accountIndex = sc.nextInt();
                if (accountIndex > size) {
                    System.out.println("Account does not exist");
                    System.out.println("Terminating....");
                }
                else{
                    System.out.println("Enter the amount to be deposited");
                    double amt=sc.nextDouble();
                    accountBalance[accountIndex]+=amt;
                    System.out.println(accountName[accountIndex]+" your updated balance is "+accountBalance[accountIndex]+" Rs.\n");
                }
                System.out.println("==================");
            }
            else if(option==5){
                System.out.println("Accounts registered\n");
                for(int i=100;i<size;i++){
                    System.out.println("Account Number: "+i+", Name: "+accountName[i]+", Balance: "+accountBalance[i]+" Rs.\n");
                }
                System.out.println("==================");
            }
            else if(option==6){
                System.out.println("Terminating...");
                System.out.println("Developed & Managed by Kanishk");
                infiniteLoop=false;
            }
            else{
                System.out.println("Invalid input");
                System.out.println("Terminating...");
                System.out.println("Developed & Managed by Kanishk");
                System.exit(0);
            }
        }
    }
}