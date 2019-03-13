
public class PredictableDie extends Die
{
	private int[] throwSequence = {};
	private int nextInSequence = 0;
	
	public PredictableDie(int[] sequence) 
	{
		if (sequence==null || sequence.length==0) {
			throw new RuntimeException("null or empty sequence");
		}
		this.throwSequence = sequence;		
	}
	
	
	public void roll() {
		
		if (throwSequence == null) {
			throw new RuntimeException("null initializing int[] array");
		}
			
		if (nextInSequence==throwSequence.length) {
			nextInSequence = 0;
		}
		super.setLastRoll(throwSequence[nextInSequence]); 
		nextInSequence++;
	}
	
	protected void setThrowSequence(int[] sequence) {
		this.throwSequence = sequence;
	}
	public static void main(String[] args)
	{
		
	}


}
