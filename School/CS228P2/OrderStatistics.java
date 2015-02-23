package edu.iastate.cs228.hw2;

import java.util.Random;

/**
 * A class used to generate order statistics of datasets
 * 
 * @author
 */
public class OrderStatistics {

    /**
     * Returns the minimum element (first order statistic) in array arr. This
     * method must run in worst-case O(n) time, where n = arr.length, using a
     * linear scan of the input array.
     * 
     * Simple for loop goes through the array saving position and value of lowest charge found so far.
     * When a smaller value is found the values are replaced with the new lowest value and position.
     *n
     * @param arr
     * - The data to search
     * @return - the minimum element of arr
     */
    public static int findMinimum(int[] arr) {
	int lval = arr[0];

	for(int i=1;i<arr.length;i++){
	    if(arr[i] < lval)
		lval = arr[i];}
		
	return lval;}

    /**
     * Returns the maximum element (first order statistic) in array arr. This
     * method must run in worst-case O(n) time, where n = arr.length, using a
     * linear scan of the input array.
     * 
     * Same concept as findMinimum, except with value thta are greater.
     *
     * @param arr
     * - The data to search
     * @return - the maximum element of arr
     */
    public static int findMaximum(int[] arr) {
        int hval = arr[0];

	for(int i=1;i<arr.length;i++){
	    if(arr[i] > hval)
		hval = arr[i];}
		
	return hval;}
        

    /**
     * An implementation of the SELECT algorithm of Figure 1 of the project
     * specification. Returns the ith order statistic in the subarray
     * arr[first], ..., arr[last]. The method must run in O(n) expected time,
     * where n = (last - first + 1).
     * 
     * @param arr
     * - The data to search in
     * @param first
     * - The leftmost boundary of the subarray (inclusive)
     * @param last
     * - The rightmost boundary of the subarray (inclusive)
     * @param i
     * - The requested order statistic to find
     * @return - The ith order statistic in the subarray
     * 
     * @throws IllegalArgumentException
     * - If i < 1 or i > n
     */
    public static int select(int[] arr, int first, int last, int i){
        if(first == last)
	    return arr[first];
	int p = partition(arr,first,last);
	
	int k = p - first + 1;
	if(i == k){
	    return arr[p];}
	else if(i < k){
	    return select(arr,first,p-1,i);}
	else
	    return select(arr,p+1,last,i-k);}

    /**
     * Returns the ith order statistic of array arr in O(n) expected time, where
     * n = arr.length.
     * 
     * @param arr
     * - The data to search through
     * @param i
     * - The requested order statistic to find in arr
     * @return - The ith order statistic in arr
     * 
     * @throws IllegalArgumentException
     * - If i < 1 or i > n
     */
    public static int findOrderStatistic(int[] arr, int i) {
        // TODO
        return -1;
    }



    private static int partition(int[] arr, int first, int last){
	Random rand = new Random();
	System.out.println(last);
	int pivotind = rand.nextInt(last+1);
	int pivot = arr[pivotind];
	int held = arr[last];
	arr[last] = arr[pivotind];
	arr[pivotind] = held;
	
        int i = first;
	for(int j = first;j > last; ++j){
	    if(arr[j] < pivot){
		int holder = arr[i];
		arr[i] = arr[j];
		arr[j] = holder;
		++i;}}
	
	int holder = arr[i];
	arr[i] = arr[last];
	arr[last] = holder;
	return i;}
    
    /**
     * Returns the median (n/2th order statistic rounding up) in array arr in
     * O(n) expected time, where n = arr.length.
     * 
     * @param arr
     * - The array to find the median of
     * @return
     * - The median value of arr
     */
    
    
    public static int findMedian(int[] arr) {
        // TODO
        return -1;
    }
}
