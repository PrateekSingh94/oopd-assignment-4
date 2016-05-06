package hw4;
import java.util.*;

public class RankMobile {
	public void getMobile()
	{
		
	}
	public static void main(String args[])
	{
		Mobile[] mobiles = new Mobile[5];
		Mobile m1 = new Mobile("x1",2.3,3100,2,5, 13.1,35000);
		Mobile m2 = new Mobile("x2",1.3,2200,1,5, 8.1,13000);
		Mobile m3 = new Mobile("x3",3.3,4500,3,5, 13.1,46000);
		Mobile m4 = new Mobile("x4",0.3,1200,1,5, 1.1,8000);
		Mobile m5 = new Mobile("x5",5.3,7800,16,5, 20.1,87000);
		int N = 5;
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		
		mobiles[0] = m1;
		mobiles[1] = m2;
		mobiles[2] = m3;
		mobiles[3] = m4;
		mobiles[4] = m5;
		
		Arrays.sort(mobiles);
		PriorityQueue<Mobile> q = new PriorityQueue<Mobile>();
		q.add(mobiles[0]);
		q.add(mobiles[1]);
		q.add(mobiles[2]);
		q.add(mobiles[3]);
		q.add(mobiles[4]);
		if(k>N)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			Mobile temp = null;
			for(int i=1;i<=k;i++){
				temp = q.remove();
				System.out.println("Rank "+i+" "+temp.type+" "+temp.ram+"GB "+temp.battery+"mAh "+temp.processor+"GHz "+temp.storage+"GB "+temp.camera+"MP Rs"+temp.price+" ");
			}
		}
		
	}
}
