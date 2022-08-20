interface IPlayer {
	// internally it is public abstract void walk();
	void walk();
	void run();
	void jump();
	void punch();
	void kick();
	// internally ipublic static final int JUMP_HEIGHT = 100;
	int JUMP_HEIGHT = 100;
}

interface IExtraPower {
	void invisible();
}

abstract class CommonUtils implements IPlayer {
	@Override
	public void walk() {	}

	@Override
	public void run() {		}

	@Override
	public void jump() {	}
}

class King extends CommonUtils implements IPlayer {

	@Override
	public void punch() {}

	@Override
	public void kick() {}
	
}

class Eddy extends CommonUtils implements IPlayer {

	@Override
	public void punch() {	}

	@Override
	public void kick() {	}
	
}

class Paul extends CommonUtils implements IPlayer, IExtraPower {

	@Override
	public void punch() {	}

	@Override
	public void kick() {	}

	@Override
	public void invisible() {	}
	
}

public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
