
public enum Direction {
	UP(90),
	DOWN(270),
	LEFT(180),
	RIGHT(0),
	UPRIGHT(45),
	UPLEFT(135),
	DOWNRIGHT(315),
	DOWNLEFT(225);
	
	private int value;    

	  private Direction(int value) {
	    this.value = value;
	  }

	  public int getValue() {
	    return value;
	  }
}
