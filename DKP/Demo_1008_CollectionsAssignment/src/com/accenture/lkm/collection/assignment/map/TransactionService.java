package com.accenture.lkm.collection.assignment.map;

import java.util.Map;

public class TransactionService {
	// Method to print transaction ids for an account number
	
	public void printAllTransactions(Map<String, Transaction> transactions, long accountNumber) {
		//TODO
		System.out.println("Transaction IDs for Account Number: " + accountNumber);

		transactions.forEach((txnId, txn) -> {
			if (txn.getSenderAccountNumber() == accountNumber || txn.getRecipientAccountNumber() == accountNumber) {
				System.out.println("Transaction ID: " + txnId);
			}
		});
		
		//Check whether account number of each element in the collection is matching the provided account number
		
				//Print transaction id if a match of account number is found
				

	}
}
