package com.accenture.lkm.collection.assignment.list;

import java.util.ArrayList;
import java.util.List;

public class TransactionTester {

public static void main(String[] args) {
		
		//TODO
		List<Transaction> transactionList = new ArrayList<>();

		// Create transactions
		transactionList.add(new Transaction("TXN001", 1234567890L, 9876543210L, 5000));
		transactionList.add(new Transaction("TXN002", 1234567890L, 8765432109L, 10000));
		transactionList.add(new Transaction("TXN003", 2345678901L, 1234567890L, 7500));
		transactionList.add(new Transaction("TXN004", 3456789012L, 8765432109L, 12000));
	
		// Create service and print transactions for a specific account
		TransactionService service = new TransactionService();
		service.printAllTransactions(transactionList, 1234567890L); 
			
		//Create an ArrayList to store transaction objects
		
		//Create transaction objects and add them to the ArrayList
		
		//Call print method of service class which prints transactions corresponding to the account number
		

	}
}
