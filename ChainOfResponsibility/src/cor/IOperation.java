package cor;

public interface IOperation {
	
	public abstract void setNext(IOperation nextInChain); 
    public abstract void calculate(String command,Number request1, Number request2); 
    

}
