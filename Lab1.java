
public class Lab1{


public static void main(String[] args) {


//------------------1------------------------------
long[] d = {4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};



//------------------2------------------------------
double Min_Range = -4.0;
double Max_Range = 12.0;

double[] x = new double[17]; 
for (int k = 0; k < 17 ;k++) {
	x[k]= ((double)Math.random() * (Max_Range - Min_Range )) + Min_Range;
}

//------------------3------------------------------

double[][] DD = new double[15][17]; 
int[] Temp_Array = {5,7,11,12,13,15,16};

for (int i=0; i<14; i++) {
	for (int j=0; j<16; j++) {
	if (d[i] ==14) {
			DD[i][j] = Math.atan(0.25 * ( 1/(Math.pow(Math.E, Math.abs(x[j])))));	
				System.out.printf("%.4f ",(float)DD[i][j]);
	
		}else if (IsInArray((int)d[i], Temp_Array)) {
				
	DD[i][j] = Math.asin(Math.sin(Math.asin(Math.pow(Math.E,(-1)*Math.abs(x[j])))));			
			System.out.printf("%.4f ",(float)DD[i][j]);
		}else{
			DD[i][j] = Math.pow(Math.pow(Math.E,( Math.cbrt(Math.tan(x[j]))/2 )),2);
			System.out.printf("%.4f ",(float)DD[i][j]);
}



	
}

System.out.println("");
	
}



}


public static boolean IsInArray(int value ,int[] Array){

	boolean result = false;
		for (int i : Array ) {
			if (i == value) {
				result = true;
			}
		}
return result;
}


}
