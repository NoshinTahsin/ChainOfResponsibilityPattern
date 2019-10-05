package cor;

public class Divide implements IOperation{

	private IOperation nextInChain; 
	  
    public void setNext(IOperation c) 
    { 
        nextInChain = c; 
    } 
  
    @Override
	public void calculate(String command,Number request1, Number request2) {
		// TODO Auto-generated method stub
    	
    	if (command.equals("divide")) 
        { 
            System.out.println("Result after Division is : " + (request1.getNumber1()/request2.getNumber1())); 
        } 
        else
        { 
            nextInChain.calculate(command,request1,request2); 
        } 
		 
	}

}
