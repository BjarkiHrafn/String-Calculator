public class StringCalculator{

	public StringCalculator(){

	}

	public int add(String numbers){

		String[] strArray = numbers.split(",|\n");

		if(numbers == " "){
			return 0;
		}

		int sum = 0;
		String denied = "";
		int[] intArray = new int[strArray.length];

			for(int i = 0; i < strArray.length; i++) {

				intArray[i] = Integer.parseInt(strArray[i]);
				if(intArray[i] < 1000)
				sum += intArray[i];
				if(intArray[i] < 0){
                    denied  += intArray[i] + ",";
				}
			}

			if(!denied.isEmpty()){
               throw new RuntimeException("Negatives not allowed: " + denied);
			}


			return sum;
	}

}
