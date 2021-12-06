/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.child;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class CommonChild {


    
    static int commonChild(String s1, String s2){
        
        int[][] dp = new int [s1.length()+1][s2.length()+1];
        
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
          
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
                
            }
        }
        
        return dp[s1.length()][s2.length()];
        
    }
    
    public static void main(String[] args) {
        

        
        CommonChild ob = new CommonChild();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int ans = ob.commonChild(str1,str2);
        System.out.println(ans);
        
    }
    
}
