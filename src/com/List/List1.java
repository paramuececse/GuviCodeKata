package com.List;
import java.util.*;
import java.util.stream.Collectors;
public class List1 {

	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		int n=object.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
		list.add(object.nextInt());
		}
		List<Integer> newlist = list.stream()
                .distinct()
                .collect(Collectors.toList());
		//System.out.println(newlist);
		Integer[] array=newlist.toArray(new Integer[0]);
		for(int i=0;i<array.length-1;i++) {
			System.out.print(array[i]+" ");
				
		}
		System.out.print(array[array.length-1]);
	}
}
/*Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).

Input Description:
First line of input contains length of linked list and next line contains the linked list data(separated by space).

Output Description:
Single line of output which contains linked list with no duplicates(separated by space).

Sample Input :
4
2 2 4 5
Sample Output :
2 4 5*/