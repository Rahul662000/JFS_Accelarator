package com.accenture.lkm.collection.assignment.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionMapTester {

	public static void main(String[] args) {
		//TODO
		List<Transaction> txnList = new ArrayList<>();
		txnList.add(new Transaction("TXN1001", 100001L, 200001L, 5000));
		txnList.add(new Transaction("TXN1002", 100002L, 100001L, 8000));
		txnList.add(new Transaction("TXN1003", 300001L, 400001L, 12000));
		txnList.add(new Transaction("TXN1004", 200001L, 100001L, 10000));

		// Create a map to store transactionId and transaction object
		Map<String, Transaction> txnMap = new HashMap<>();
		for (Transaction txn : txnList) {
			txnMap.put(txn.getTransactionId(), txn);
		}

		// Call service method
		TransactionService service = new TransactionService();
		service.printAllTransactions(txnMap, 100001L);
		
		// Create a list to hold transaction
		
		// Add transaction objects to the list
		
		// Create a map to store transactionId and transaction object
		
		// Call print method 
		

	}
}
