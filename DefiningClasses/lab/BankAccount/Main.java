package advanced.DefiningClasses.lab.BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Integer, BankAccount> map = new HashMap<>();

        while(!input.equals("End")){
            String[] data = input.split(" ");

            String print = null;
            if(data[0].equals("Create")){
                BankAccount bankAccount = new BankAccount();
                int key = bankAccount.getId();
                map.put(key, bankAccount);
                print = "Account ID" + key + " created";
            }else if(data[0].equals("Deposit")){
                int id = Integer.parseInt(data[1]);
                int amount = Integer.parseInt(data[2]);
                BankAccount bankAccount = map.get(id);
                if(bankAccount != null){
                    bankAccount.deposit(amount);
                    print = "Deposited " + amount + " to ID" + id;
                }else{
                    System.out.println("Account does not exist");
                }
            }else if(data[0].equals("SetInterest")){
                double interest = Double.parseDouble(data[1]);
                BankAccount.setInterestRate(interest);
            }else if(data[0].equals("GetInterest")){
                int id = Integer.parseInt(data[1]);
                int years = Integer.parseInt(data[2]);
                BankAccount bankAccount = map.get(id);
                if(bankAccount != null){
                    print = String.format("%.2f", bankAccount.getInterest(years));
                }else{
                    System.out.println("Account does not exist");
                }
            }
            if(print != null){
                System.out.println(print);
            }
            input = scanner.nextLine();
        }
    }
}
