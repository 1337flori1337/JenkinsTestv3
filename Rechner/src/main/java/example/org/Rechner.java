package example.org;

public class Rechner {

	public double addiere(double x, double y) {
		return x+y;
	}
	
	public double subtrahiere(double x, double y) {
		 double round =  Math.round((x-y)*10);
		 return (round/10);
	}
	
	public double multipliziere(double x, double y) {
		return x*y;
	}
	
	public double dividiere(double x, double y) {
		return x/y;
	}
	
	public int fakultaet(int n) {
		int res = 1;
		for(int i=1; i<=n; i++) {
			res = res *i;
		}
		return res;
	}
}
