package com.accenture.lkm.collection.assignment.list;

import java.util.List;
import java.util.function.Predicate;

public class TransactionService {
	
	//This method helps to print transactions corresponding to a particular account

	public void printAllTransactions(List<Transaction> transactions, long accountNumber) {
		/*TODO
		Create a stream on the collection which contains all transaction objects.
		Use a Predicate functional interface to filter transactions 
					corresponding to the account number.*/
		// Predicate to filter transactions related to the given account number
				Predicate<Transaction> filterByAccount = t -> 
					t.getSenderAccountNumber() == accountNumber || t.getRecipientAccountNumber() == accountNumber;

				// Print the filtered transactions
				System.out.println("Transactions for Account Number: " + accountNumber);
				transactions.stream()
				            .filter(filterByAccount)
				            .forEach(System.out::println);
	}
}
