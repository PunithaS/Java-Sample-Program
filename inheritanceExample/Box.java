package inheritanceExample;

 class Box {
	double height;
	double width;
	double depth;
	/*Box(){
		height=width=depth=-1;
	}*/
	Box(double h,double w,double d){
		height=h;
		width=w;
		depth=d;
	}
	Box(double len){
		width=height=depth=len;
	}
	
	double volume(){
		return width*height*depth;
	}
}
