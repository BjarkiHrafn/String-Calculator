class StringCalculator{

	public StringCalculator{
	
	}
	
	public int add(string numbers){
		
		int sum = 0;
		String[] strArray = numbers.split(",");
		int[] intArray = new int[strArray.length];
			
			for(int i = 0; i < strArray.length; i++) {
			
				intArray[i] = Integer.parseInt(strArray[i]);
				sum += intArray[i];
			}
			
			return sum;
	}

}