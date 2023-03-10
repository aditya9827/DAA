package com.adi.algo.search;

/*
 * def binary_search(list, item): low = 0
	igh = len(list)—1
	while low <= high: mid = (low + high) guess = list[mid] if guess == item:
	return mid
	if guess > item: high = mid - 1
	else:
	low = mid + 1
	return None
 * 
 * Requirement: Input should be sorted
 * 
 * Time Complexity : O(logn)
 */
public class BinarySearch {
	
	public static void main(String[] args) {
		int[] input = {1,2,5,6,7,9,11,14,15,17};
		int item = 5;
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.binarySearch(input, item));
		
	}
	
	int binarySearch(int[] arr, int item ) {
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid = (high+low)/2;
			int guess = arr[mid];
			
			if(guess == item) {
				return mid;
			}
			if(guess > item) {
				high = mid -1;			
			} else {
				low = mid +1;
			}
		}
		return -1;
		
	}

}
