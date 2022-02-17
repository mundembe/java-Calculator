package com;

import java.io.*;

public class test {
	
	int n1 = 2;
	int n2 = 1;
	char p1 = '+';
	static int ans = 0;
	
	public static void main(String args[]) throws IOException {
		
		boolean saveNextTerm = false;
		int[] terms = new int[5];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("input here: ");
			String input = "";

			
			try {
			BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in) );
			
				input = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Integer in = Integer.parseInt(input);
			terms[i] = in;
			if (saveNextTerm)
				terms[i-1] = ans;
			int PrevAns = (int) terms[i-1];
			if(i == 2)
				PrevAns = ans;
			
			if (input.equals("*")) {
				if(saveNextTerm) {
					ans = (PrevAns * terms[i+1] );
				}
				saveNextTerm = !saveNextTerm;
				
			}
		}

		
		System.out.println(ans);
	}
	
	public int sum(int n1, int n2) {
		
		return ans;
		
	}

}
