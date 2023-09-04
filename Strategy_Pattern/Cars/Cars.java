
public abstract class Cars {
	ISound s; // this is a composition relationship
	public Cars(ISound s1) {
		this.s=s1;
	}
	
	public void mysound() {
		s.sound();
	}
	public void setIsond(ISound s2) {
		this.s=s2;
	}

}
