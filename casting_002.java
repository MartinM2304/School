package sinya_jaba2Pack;

class casting_002 {

	public static void main(String[] args) {
        
        //World population today
        long currentWorldPop = 7000000000L;
        System.out.println("Current World Population: " +currentWorldPop);
        
        //World population in 1950,  Source: United Nations Population Division
        //2.52 Billion
        long africaPop   =   221000000;
        long asiaPop     = 1402000000;
        long europePop   =   547000000;
        long americasPop =   339000000;
        long oceanaPop   =    13000000;
        System.out.println("World Population in 1950: " 
                +(africaPop +asiaPop +europePop +americasPop +oceanaPop));
        
        //The current population of Asia is an estimated 60% of the world population
        double percentAsia = 0.6;
        long currentAsiaPop = (long)(currentWorldPop * percentAsia);
        System.out.println("Current Asia Population: " +currentAsiaPop);      
       
    }  
}