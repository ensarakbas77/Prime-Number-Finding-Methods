import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	public static void main(String[] args) {
	
	int num=541;
	
	long startTime1=System.nanoTime();
	//1.Yaklaşım
	if (Approach1(num)) {
		System.out.println(num+" is a prime");
	}
	else {
		System.out.println(num+" isn't a prime");
	}
	long endTime1=System.nanoTime();
	long approach1=endTime1-startTime1;
	System.out.println("1.Yaklaşımın Süresi: "+approach1);
	System.out.println();
	
	
	long startTime2=System.nanoTime();
	//2.Yaklaşım
	if (Approach2(num)) {
		System.out.println(num+" is a prime");
	}
	else {
		System.out.println(num+" isn't a prime");
	}
	long endTime2=System.nanoTime();
	long approach2=endTime2-startTime2;
	System.out.println("2.Yaklaşımın Süresi: "+approach2);
	System.out.println();
	
	
	long startTime3=System.nanoTime();
	//3.Yaklaşım
	if (Approach3(num)) {
		System.out.println(num+" is a prime");
	}
	else {
		System.out.println(num+" isn't a prime");
	}
	long endTime3=System.nanoTime();
	long approach3=endTime3-startTime3;
	System.out.println("3.Yaklaşımın Süresi: "+approach3);
	
	
	
	}
	
	//1.Yaklaşım
	public static boolean Approach1(int number) {
		boolean sitution=true;
		if (number < 2) return false;
		for (int i = 2; i < number; i++) {
			if (number%i==0) {
				sitution=false;
				break;
			}
		}
		return sitution;
	}
	
	//2.Yaklaşım
	public static boolean Approach2(int number) {
        if (number < 2) return false; 
        
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < number; i++) {
            if (Approach1(i)) { 
                primes.add(i);
            }
        }
        
        for (int prime : primes) {
            if (number % prime == 0) {
                return false; 
            }
        }
        
        return true; 
    }
	
	//3.Yaklaşım
	public static boolean Approach3(int number) {
		if (number < 2) return false;
		for (int i = 2; i <=Math.sqrt(number); i++) {
			if (number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
}
