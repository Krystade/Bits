public class BitCounting {

	public static int countBits(int n){
	  String binary = "";
    int n = 1234;
    int bits = 0;
    while (n > 0){
      long remainder = n % 2;
      binary += remainder;
      n /= 2;
    }
    for (int i = 0; i < binary.length(); i++){
      if (binary.substring(i, i + 1).equals("1")){
        bits++;
      }else{}
	}
}
