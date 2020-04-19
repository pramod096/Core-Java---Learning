class Test{
int sum;

Test(int num){
	
	for(int i = 1; i <= num; i++)
		sum += i;
}

Test(Test ob){
	
}
int hello(int x) {
	return x;
}


	}

public class PassObRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t = new Test(6);
Test t1 = new Test(t);
System.out.println(t.sum+"\n"+t1.sum);
	}

}
