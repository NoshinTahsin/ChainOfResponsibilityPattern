package cor;

public class TestChain {
	
	 
	    public static void main(String[] args) { 
	        //configure Chain of Responsibility 
	        IOperation c1 = new AddUp(); 
	        IOperation c2 = new Substract(); 
	        IOperation c3 = new Multiply(); 
	        IOperation c4 = new Divide(); 
	        
	        c1.setNext(c2); 
	        c2.setNext(c3);
	        c3.setNext(c4);
	  
	    
	        //calling chain of responsibility 
	        c1.calculate("add", new Number(9), new Number(2)); 
	        c1.calculate("substract", new Number(9), new Number(2)); 
	        c1.calculate("multiply", new Number(9), new Number(2)); 
	        c1.calculate("divide", new Number(9), new Number(2)); 
	    } 
	

}
