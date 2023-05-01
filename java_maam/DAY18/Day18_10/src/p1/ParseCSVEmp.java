package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ParseCSVEmp 
{
	public static EmpPojo parseEmp(String line)
	{
		try
		{
			EmpPojo e = new EmpPojo();
			String[] parts = line.split(",");
			e.setId(Integer.parseInt(parts[0]));
			e.setName(parts[1]);
			e.setJob(parts[2]);
			e.setMgr(Integer.parseInt(parts[3]));
			e.setSal(Integer.parseInt(parts[4]));
			e.setDeptno(Integer.parseInt(parts[5]));
			return e;			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
	}
	

	public static void main(String[] args)
	{
		File f = new File(args[0]);
		ArrayList<EmpPojo> empList = new ArrayList<EmpPojo>();
		
		try(Scanner sc = new Scanner(f))
		{
			while(sc.hasNextLine())
			{
				String line = sc.nextLine();
				EmpPojo e = parseEmp(line);
				if(e!=null)
					empList.add(e);
			}
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
		System.out.println("Records from CSV Files are ");
		for(EmpPojo ep : empList)
			System.out.println(ep);
		System.out.println();
		System.out.println("Records from CSV Files are fetched and printed using Method reference");
		empList.forEach(System.out::println);

	}

}
