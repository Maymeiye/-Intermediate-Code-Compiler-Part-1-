import java.util.HashMap;

public abstract class Compiler extends Parser
{
	public static HashMap<String,Integer> MyHm  = new HashMap<String, Integer>();
	public static int index = 0;
	
	//use hashmap to store variable, like make a2 become #0
	public static int instruction(String token)
	  {
	      if(MyHm.get(token) == null)
	      {
	    	  		MyHm.put(token,index);
	    	  		index++;
	      }
	    	  return MyHm.get(token);    
	  }
	
	public static void main(String argv[])
	{
		// argv[0]: input file containing an assignment list
		// argv[1]: output file containing the compiled instruction stream
		
		setIO( argv[0], argv[1] );
		setLex();

		getToken();
		SList slist = sList();// build a parse tree
		if ( ! t.isEmpty() )
			displayln(t + " : Syntax Error, unexpected symbol where id expected");
		else if ( ! syntaxErrorFound )
		{
			slist.emitInstructions();
		}
		closeIO();
	}
}