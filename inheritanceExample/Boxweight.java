package inheritanceExample;
//import inheritanceExample.Box;
 class Boxweight extends Box {
	double weight;
	Boxweight(double w,double h,double d,double wgt)
	{
		super(wgt);
		/*double volume=super.volume();
		System.out.println("volume of Box class :"+ volume);*/
		
		width=w;
		height=h;
		depth=d;
		weight=wgt;
	}
	
}
