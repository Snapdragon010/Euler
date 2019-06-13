
public class Euler {

	public static void main(String[] args) {
		
		double y0=0,x0=0;
		double h=0.1,N=3;
		double x1=0,yp=0,yc=0,y1=0;
		for(int n=1;n<=N;n++)
		{
			x1=x0+h;
			yp=y0+h*(0-x0*x0-y0*y0*100);
			yc=y0+h*(0-x0*x0-yp*yp*100);
			y1=(yp+yc)/2;
			if(n<=N)
			{
				x0=x1;y0=y1;
			}
		}
		System.out.println(x1);
		System.out.println(y1);
	}
}
