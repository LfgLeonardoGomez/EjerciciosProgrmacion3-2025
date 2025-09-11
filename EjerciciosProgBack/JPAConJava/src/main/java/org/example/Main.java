package org.example;


public class Main {
    public static void main(String[] args) {

        int nums[]={2,5,7,9,1};
        int objetivo= 12;
        boolean res= false;
        String ind1=null, ind2= null;
        int suma =0;
        for(int i=0; i < 5 ;i++){
            for(int j=0; j<5;j++){
                System.out.print(i);
                System.out.println(j);
                suma = nums[i]+nums[j];
                if(suma==objetivo){
                    res=true;
                    
                    ind1 = i + "";
                    ind2 = j + "";

                }

            }
        }
        System.out.println("indice 1: " + ind1);
        System.out.println("indice 2: " + ind2);

    }
}