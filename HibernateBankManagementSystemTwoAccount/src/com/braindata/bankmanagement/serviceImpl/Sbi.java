package com.braindata.bankmanagement.serviceImpl;

import com.braindata.bankmanagement.Exception.*;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

import jakarta.transaction.Transaction;

import java.util.Scanner;

import org.hibernate.Hibernate;
import org.hibernate.Session;

public class Sbi implements Rbi {

	Scanner sc = new Scanner(System.in);

	//Account arr[] = new Account[2];
	Account acc = new Account();
	
	Session session = HibernateUtil.getSessionFactory().openSession();


	    @Override
	    public void createAccount() { 
	        //for (int i = 0; i < arr.length; i++) { 
	           // System.out.println("\n--- Creating Account " + (i + 1) + " of " + arr.length + " ---");
	            Account acc = new Account(); 

	            // 1. Validate Account Number
	            while (true) { 
	                try { 
	                	session.clear();
	                    System.out.print("Enter your 12-digit Account Number: "); 
	                    String accNo = sc.next(); 
	                    if (accNo.length() == 12) { 
	                        acc.setAccNo(accNo); 
	                        System.out.println("Valid account number."); 
	                        break; // Fixed: Now correctly exits the loop
	                    } else { 
	                        throw new InvalidException("Invalid account number! Must be exactly 12 digits."); 
	                    } 
	                } catch (InvalidException e) { 
	                    System.out.println(e.getMessage()); 
	                } 
	            } 

	            // 2. Validate Name (Must be UPPERCASE)
	            while (true) { 
	                try { 
	                    System.out.print("Enter your name (UPPERCASE only): "); 
	                    String name = sc.next(); 
	                    if (name.equals(name.toUpperCase())) { 
	                        acc.setName(name); 
	                        break; 
	                    } else { 
	                        throw new InvalidException("Invalid Name! Name must be in all UPPERCASE letters."); 
	                    } 
	                } catch (InvalidException e) { 
	                    System.out.println(e.getMessage()); 
	                } 
	            } 

	            // 3. Validate Mobile Number
	            while (true) { 
	                try { 
	                    System.out.print("Enter your 10-digit Mobile Number: "); 
	                    String mobno = sc.next(); 
	                    if (mobno.length() == 10) { 
	                        acc.setMobno(mobno); 
	                        System.out.println("Valid mobile number."); 
	                        break; // Fixed: Moved break to the end of the block
	                    } else { 
	                        throw new InvalidException("Invalid mobile number! Must be exactly 10 digits."); 
	                    } 
	                } catch (InvalidException e) { 
	                    System.out.println(e.getMessage()); 
	                } 
	            } 

	            // 4. Validate Aadhar Number
	            while (true) { 
	                try { 
	                    System.out.print("Enter your 12-digit Aadhar Number: "); 
	                    String adharNo = sc.next(); 
	                    if (adharNo.length() == 12) { 
	                        acc.setAdharNo(adharNo); 
	                        System.out.println("Valid Aadhar number."); 
	                        break; 
	                    } else { 
	                        throw new InvalidException("Invalid Aadhar number! Must be exactly 12 digits."); 
	                    } 
	                } catch (InvalidException e) { 
	                    System.out.println(e.getMessage()); 
	                } 
	            } 

	            // 5. Gather Gender
	            System.out.print("Enter your gender: "); 
	            String gender = sc.next(); 
	            acc.setGender(gender);

	            // 6. Validate Age
	            while (true) { 
	                try { 
	                    System.out.print("Enter your age: "); 
	                    if (!sc.hasNextInt()) {
	                        System.out.println("Please enter a valid integer for age.");
	                        sc.next(); // Clear invalid input
	                        continue;
	                    }
	                    int age = sc.nextInt(); 
	                    if (age >= 18) { 
	                        acc.setAge(age); 
	                        System.out.println("Valid age."); 
	                        break; 
	                    } else { 
	                        throw new InvalidException("Invalid age! Account holder must be 18 or older."); 
	                    } 
	                } catch (InvalidException e) { 
	                    System.out.println(e.getMessage()); 
	                } 
	            } 

	            // 7. Validate Initial Balance
	            while (true) { 
	                try { 
	                    System.out.print("Enter initial deposit balance (Min 500): "); 
	                    if (!sc.hasNextDouble()) {
	                        System.out.println("Please enter a valid numerical amount.");
	                        sc.next(); // Clear invalid input
	                        continue;
	                    }
	                    double balance = sc.nextDouble(); 
	                    if (balance >= 500) { 
	                        acc.setBalance(balance); 
	                        System.out.println("Sufficient initial balance."); 
	                        break; 
	                    } else { 
	                        throw new InvalidException("Insufficient balance! Minimum opening balance is 500."); 
	                    } 
	                } catch (InvalidException e) { 
	                    System.out.println(e.getMessage()); 
	                } 
	                
	                
	            }

	            // Save the completely configured account object into the array
	           // arr[i] = acc;
	            Transaction tx = session.beginTransaction();
                session.persist(acc);
                tx.commit();
	            System.out.println("Account " + (i + 1) + " successfully created and saved!\n");
	            //session.close();
	        } 
	    } 
	
	@Override
	public void displayAllDetails() {
		System.out.println("Enter Account number:");
		int accNo = sc.nextInt();
		Account acc = session.get(Account.class,accNo);
       if(acc!=null)
       {
		//for (int i = 0; i < arr.length; i++) {
			System.out.println("Your AccountNo:" + acc.getAccNo());
			System.out.println("Your Name:" + acc.getName());
			System.out.println("Your Mobno:" + acc.getMobno());
			System.out.println("Your Adharno:" + acc.getAdharNo());
			System.out.println("Your Gender:" + acc.getGender());
			System.out.println("Your Age:" + acc.getAge());
			System.out.println("Your Balance:" + acc.getBalance());
		//}
       }else {
    	   System.out.println("Account not Found");
       }
	}

	@Override
	public void depositeMoney() {
		//for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter the amount");
			double amount = sc.nextDouble();

			double newbalance = acc.getBalance() + amount;
			acc.setBalance(newbalance);
			System.out.println(acc.getBalance());
		}
	}

	@Override
	public void withdrawal() {
		//for (int i = 0; i < arr.length; i++) {
			while (true) {
				try {
					System.out.println("Enter the withdraw balance");
					double amount = sc.nextDouble();

					// double withdrawbal = arr[i].getBalance() - amount;
					// arr[i].setBalance(withdrawbal);
					if (amount <= acc.getBalance()) {
						double withdrawbal = acc.getBalance() - amount;
						arr[i].setBalance(withdrawbal);
						break;
						
					} else {
						throw new InvalidException("unsufficient balance");
					}
				} catch (InvalidException e) {
					System.out.println(e.getMessage());
				}
			}
		}

		System.out.println(acc.getBalance());
	}

	@Override
	public void balanceMoney() {
		System.out.println("Enter Account Number");
		String accNo = sc.next();
		Account acc = session.get(Account.class,accNo);
		if(acc!=null) {
		//for (int i = 0; i < arr.length; i++) {
			System.out.println("Your Current balance:" + acc.getBalance());
		//}
		}else {
			System.out.println("Accound not Found");
		}
	}

}
