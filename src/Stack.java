
public class Stack {
	public static int stackSize = 100;
	String[] stackContainer = new String[stackSize];
	int topIndex = -1;
	Stack(int size)
	{
		stackSize = size;
		stackContainer= new String[stackSize];
	}
	public void push(String element) {
		
		

		
		if (!isHundredPercentFull()) {

			topIndex++;
			stackContainer[topIndex] = element;
		}
		else{
			resize(stackContainer.length*2);
		}

	}
	
	public void resize(int targetSize){
		String[] resizedStackContainer = new String[targetSize];

		for(int x = 0; x<stackContainer.length ;x++){
			if(stackContainer[x]!=null){
				resizedStackContainer[x] = stackContainer[x];

			}
		}
		stackContainer = resizedStackContainer;
		System.out.println("new Size ="+stackContainer.length);
	}
	
	public boolean isEmpty(){
		if (topIndex <0) {
			return true;
		} else {
			return false;
		}
	}
	public boolean isHundredPercentFull(){
		if(topIndex == stackContainer.length-1){
			return true;
		}
		
		return false;
		
	}
	public boolean isTwentyFivePercentFull(){
		if(topIndex == (stackContainer.length-1)/4){
			return true;
		}
		
		return false;
	}
	
	public String pop() throws IllegalAccessException {
		String returnValue ="";
		if(isTwentyFivePercentFull()){
			resize(stackContainer.length/2);
		}
		if (!isEmpty()) {
			returnValue = stackContainer[topIndex];
			topIndex--;
		} else {
			throw new IllegalAccessException();
		}
		return returnValue;
	}

	public String peek() throws IllegalAccessException {
		if (isEmpty()) {
			throw new IllegalAccessException();

		} else {
			return stackContainer[topIndex];

		}
	}
}
