public class StringCalculator{

	public StringCalculator(){
	
	}
	
	public int add(String numbers){
		
		if(numbers == " "){
			return 0;
		}
		int sum = 0;
		String[] strArray = numbers.split(",|\n");
		int[] intArray = new int[strArray.length];
			
			for(int i = 0; i < strArray.length; i++) {
				
				intArray[i] = Integer.parseInt(strArray[i]);
				sum += intArray[i];
			}
			
			return sum;
	}

}