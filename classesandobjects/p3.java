class Microsoft{
	Microsoft(){
		System.out.println("Microsoft Company");
	}

	void display(){
		System.out.println("Microsoft is an American multinational technology company");
	}
}

class msword extends Microsoft{
	msword(){
		System.out.println("Microsoft word is a product of  Microsoft");
	}
}

class User{
	public static void main(String[] args){
		msword obj = new msword();
		obj.display();
	}
}
