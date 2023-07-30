//Given temp of person in Farenheit. Print whether the person has high, normal or low temp.
//>98.6 -> high
//98.0>= and <= 98.6-> normal
//<98.0 -> low

class Temp{
	public static void main(String[] args){
		float temp=98.6f;
		if(temp>98.6){
			System.out.println("High");
		}else if(temp<98.0){
			System.out.println("Low");
	}
	else{
		System.out.println("Normal");
	}
	}
}
