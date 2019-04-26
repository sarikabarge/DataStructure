/******************************************************************************
 *  Purpose: To find prime and anagram using queue
 *
 *  @author  Sarika barge
 *  @version 1.0
 *  @Date   24-04-2019
 *
 ******************************************************************************/

package com.bridgeit.datastructure.queue;

import com.Utilpack.Utility;

public class PrimeAnagramUsingQueue
{
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>(165);
		int res[]=Utility.primeAnagrams(1000);
		for(int i:res)
			queue.enQueue(i);  //add to queue
			queue.show();
}
}