package PaintWizard;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void LowestPrice(List<Paint> paints, int roomSize)
	{
		
		
		
		
	}
	
	public static void LowestWaste(List<Paint> paints, int roomSize)
	{
		for(Paint p : paints)
		{
			int i =p.getNoOfLitre() * p.getMeterSquaredPerLitre();
			Math.min(i, p.getNoOfLitre());
			
		}
		int int1 = 0, int2 = 0, int3 = 0, int4 = 0;
		
		 while(roomSize>0)
		 {
			 //Logic implementation now need to organise list by lowest value to highest
			 // foreach then implement the same logic
			 if(roomSize - 176 <= 0)
			 {
				 roomSize -= paints.get(2).getTotal();
				 int3 +=1;
			 }
			 else if(roomSize - 210 <= 0)
			 {
				 roomSize -= paints.get(0).getTotal();
				 int1+=1;
			 }
			 else if(roomSize - 220 <= 0)
			 {
				 roomSize -= paints.get(3).getTotal();
				 int4+=1;
			 }
			 else
			 {
				 roomSize -= paints.get(1).getTotal();
				 int2+=1;
			 }			 
		 }
		 System.out.println(String.format("The best to waste the least amount of paint is to buy: %d bucket from: CheapoMax,  %d bucket from: ThatOneWithTheDog, %d bucket from and %d bucket from and you will waste %d worth of meter squared paint", int1, int2, int3,int4, -roomSize));

	}
	
	public static void main(String[] args) {
		Paint CheapoMax = new Paint("CheapoMax", 19.99, 21, 10);
		Paint ThatOneWithTheDog = new Paint("ThatOneWithTheDog", 34.38, 40, 12);
		Paint AverageJoes = new Paint("AverageJoes", 17.99, 16, 11);
		Paint DuluxourousPaints = new Paint("DuluxourousPaints",25,10,22);
		
		
		List<Paint> SupplierList = new ArrayList<Paint>();
		SupplierList.add(new Paint("CheapoMax", 19.99, 21, 10));
		SupplierList.add(new Paint("ThatOneWithTheDog", 34.38, 40, 12));
		SupplierList.add(new Paint("AverageJoes", 17.99, 16, 11));
		SupplierList.add(new Paint("DuluxourousPaints",25,10,22));
		//less waste

		
		 int roomSize = 490;
		 
		 LowestWaste(SupplierList, roomSize);
		
		
		
		
		 /* List<Integer> results = new ArrayList<>();
		for(Paint p : SupplierList)
		{
			int roomSizeLeft = roomSize;
			while(p.getNoOfLitre() * p.getMeterSquaredPerLitre() - roomSizeLeft <= 0)
			{
				roomSizeLeft -= p.getNoOfLitre() * p.getMeterSquaredPerLitre();
			}
			results.add(roomSizeLeft);
		}
		for(int i: results)
		{
			Math.abs(i);
		}
		int minWaste = results.stream()						// Stream<Integer>
		.min(Comparator.naturalOrder()) // Optional<Integer>
		.get();
		
		System.out.println("The minimum waste possible is " + minWaste +" by using: ");
		//less expensive
		 */
	}

}
