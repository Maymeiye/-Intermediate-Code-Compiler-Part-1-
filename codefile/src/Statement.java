abstract class Statement
{
	Assignment assignment;
	Print print;
	Block block;
	void printParseTree(String indent)
	{
		IO.displayln(indent + indent.length() + " <statement>");
	}
	
	void emitInstructions()
	{
		assignment.emitInstructions();
		print.emitInstructions();
		block.emitInstructions();
		
	}
}
