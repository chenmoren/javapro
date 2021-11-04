package com.example.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author renfurui
 * @create -11-04-15:46
 */
public class test {
    public static int[] hidKeybor={
              	  0,  0,  0,  0, 30, 48, 46, 32, 18, 33, 34, 35, 23, 36, 37, 38,
              	 50, 49, 24, 25, 16, 19, 31, 20, 22, 47, 17, 45, 21, 44,  2,  3,
              	  4,  5,  6,  7,  8,  9, 10, 11, 28,  1, 14, 15, 57, 12, 13, 26,
              	 27, 43, 43, 39, 40, 41, 51, 52, 53, 58, 59, 60, 61, 62, 63, 64,
              	 65, 66, 67, 68, 87, 88, 99, 70,119,110,102,104,111,107,109,106,
              	105,108,103, 69, 98, 55, 74, 78, 96, 79, 80, 81, 75, 76, 77, 71,
              	 72, 73, 82, 83, 86,127,116,117,183,184,185,186,187,188,189,190,
              	191,192,193,194,134,138,130,132,128,129,131,137,133,135,136,113,
              	115,114,-1,-1,121,-1, 89, 93,124, 92, 94, 95,-1,-1,-1,
              	122,123, 90, 91, 85,-1,-1,-1,-1,-1,-1,-1,111,-1,-1,-1,
              	-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
              	-1,-1,-1,-1,-1,-1,179,180,-1,-1,-1,-1,-1,-1,-1,-1,
              	-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
              	-1,-1,-1,-1,-1,-1,-1,-1,111,-1,-1,-1,-1,-1,-1,-1,
              	 29, 42, 56,125, 97, 54,100,126,164,166,165,163,161,115,114,113,
              	150,158,159,128,136,177,178,176,142,152,173,140,-1,-1,-1,-1
              };

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int keynum[] =  new int[64];
		int total=0;
		while(true) {
			String HexNum = br.readLine();
			if(HexNum.equals("exit")){
				break;
			}
			keynum[total] = hidKeybor[Integer.parseInt(HexNum, 16)];
			total=total+1;
		}
		for(int i = 0;i<total;i++){
			System.out.println("key  "+keynum[i]);
		}
    }
}
