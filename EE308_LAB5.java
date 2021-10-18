import java.util.*;
public class EE308_LAB5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please input your grade");
		int grade=sc.nextInt();
		System.out.println("please input the question num");
		int questionNum=sc.nextInt();
		if(grade==1||grade==2) {
			int []judge= new int[questionNum];
			for(int i=0;i<questionNum;i++) {
				int rightAns=addLess100();
				int ans=sc.nextInt();
				if(ans==rightAns)
					judge[i]=1;
			}
			countScore(judge,questionNum);
		}else if(grade==3||grade==4) {
			int []judge= new int[questionNum];
			for(int i=0;i<questionNum;i++) {
				int rightAns=randomChooseNoDecimal();
				int ans=sc.nextInt();
				if(ans==rightAns)
					judge[i]=1;
			}
			countScore(judge,questionNum);
		}else if(grade==5||grade==6) {
			int []judge= new int[questionNum];
			for(int i=0;i<questionNum;i++) {
				double rightAns=randomChoose();
				double ans=sc.nextInt();
				if(ans==rightAns)
					judge[i]=1;
			}
			countScore(judge,questionNum);
		}else {
			System.out.println("WRONG");
		}
		for(int i=0;i<questionNum;i++) {
			
		}
		

	}
	public static double creatRandomNum(int min, int max) {
		double randNum=(min+Math.random()*(max-min+1));
		return randNum;
	}
//	public static void grade1_2() {
//		int num1,num2;
//	}
//	public static void grade3_4() {
//		
//	}
//	public static void grade5_6() {
//		
//	}
	public static int addLess100() {
		int num1,num2;
		num1=(int)creatRandomNum(0,100);
		num2=(int)creatRandomNum(0,100-num1);
		System.out.printf(num1+" + "+num2+"=?");
		return num1+num2;
	}
	public static double add() {
		double numa,numb;
		numa=creatRandomNum(0,10000);
		numb=creatRandomNum(0,10000-(int)numa);
		String num1 = String.format("%.2f",numa);
	    String num2 = String.format("%.2f",numb);
		System.out.println(num1+" + "+num2+"=?");
		return numa+numb;
	}
	public static double sub() {
		double numa,numb;
		numa=creatRandomNum(0,10000);
		numb=creatRandomNum(0,10000);
		String num1 = String.format("%.2f",numa);
	    String num2 = String.format("%.2f",numb);
		System.out.println(num1+" - "+num2+"=?");
		return numa-numb;
	}
	public static double mul() {
		double numa,numb;
		numa=creatRandomNum(0,10000);
		numb=creatRandomNum(0,10000);
		String num1 = String.format("%.2f",numa);
	    String num2 = String.format("%.2f",numb);
		System.out.println(num1+" * "+num2+"=?");
		return numa*numb;
	}
	public static double div() {
		double numa,numb;
		numa=creatRandomNum(0,10000);
		numb=creatRandomNum(0,10000);
		String num1 = String.format("%.2f",numa);
	    String num2 = String.format("%.2f",numb);
		System.out.println(num1+" / "+num2+"=?");
		return numa/numb;
	}
	
	////////
	
	public static int intadd() {
		int num1,num2;
		num1=(int)creatRandomNum(0,10000);
		num2=(int)creatRandomNum(0,10000-num1);
		System.out.println(num1+" + "+num2+"=?");
		return num1+num2;
	}
	public static int intsub() {
		int num1,num2;
		num1=(int)creatRandomNum(0,10000);
		num2=(int)creatRandomNum(0,10000);
		System.out.println(num1+" - "+num2+"=?");
		return num1+num2;
	}
	public static int intmul() {
		int num1,num2;
		num1=(int)creatRandomNum(0,100);
		num2=(int)creatRandomNum(0,100);
		System.out.println(num1+" * "+num2+"=?");
		return num1*num2;
	}
	public static int intdiv() {
		int num1,num2;
		num1=(int)creatRandomNum(0,100);
		num2=(int)creatRandomNum(0,100);
		System.out.println(num1+" / "+num2+"=?");
		return (int)(num1/num2);
	}
	////////
	public static void countScore(int arr[],int arrLen) {
		double score=0;
		for(int i=0;i<arrLen;i++) {
			if(arr[i]==1) {
				score+=100/(double)arrLen;
			}
		}
		System.out.println(score+" points");;
	}
//	public static void judge(int num) {
//		int []question= new int[num];
//		
//	}
	public static double randomChoose() {
		int num=(int)creatRandomNum(1,4);
		if(num==1) {
			return add();
		}else if(num==2) {
			return sub();
		}else if(num==3) {
			return mul();
		}else if(num==4) {
			return div();
		}else {
			System.out.println("WRONG");
			return 0;
		}
	}
	public static int randomChooseNoDecimal() {
		int num=(int)creatRandomNum(1,4);
		if(num==1) {
			return intadd();
		}else if(num==2) {
			return intsub();
		}else if(num==3) {
			return intmul();
		}else if(num==4) {
			return intdiv();
		}else {
			System.out.println("WRONG");
			return 0;
		}
	}
}

