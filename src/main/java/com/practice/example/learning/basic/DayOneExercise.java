public class DayOneExercise {
    public boolean oddOrEven(int input){
        if(input%2 == 0){
            return true;
        } else {
            return false;
        }
    }
	public void checkNumber(int input){
        if(input >500 && input<1000){
            System.out.println("Yes it comes between 500 to 1000");
        } else {
            System.out.println("No it did not come between 500 to 1000");
        }
    }
	public String[] reverseArray(String[] inputArr){
        String outputArr [] = new String [inputArr.length];
        for(int i=0;i<inputArr.length;i++){//i=0
            outputArr[inputArr.length-i-1] = inputArr[i];
        }
        return outputArr;
    }
	public boolean checkPalindrome(String inputStr){//NEHA
        char chIn [] =  inputStr.toCharArray();
        char chOut [] = new char[inputStr.length()];
        for(int i=0;i<chIn.length;i++){
            chOut[chOut.length-i-1] = chIn[i];
        }

		String out = String.valueOf(chOut);
        if(inputStr.equals(out)){
            return true;
        } else {
            return false;
        }
    }
}