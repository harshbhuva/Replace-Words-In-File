import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Replace 
{
	public static void main(String[] args) 
	{
		String fna,word,nw;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter File :  ");
		fna=sc.next();
		System.out.println("Enter Word :  ");
		word=sc.next();
		System.out.println("Enter New Word :  ");
		nw=sc.next();
		
		try
		{
			FileReader fr=new FileReader("src//"+fna);
			BufferedReader br=new BufferedReader(fr);
			
			String line="",data="";
			while(line!= null)
			{
				line=br.readLine();
				if(line!=null)
				{
					data=data+line+"\n";
				}
			}
			fr.close();
			data=data.replace(word, nw);
			//FileWriter fw=new FileWriter("src//"+fna,true); open file to append
			FileWriter fw=new FileWriter("src//"+fna);//open file to write
			
			fw.write(data);
			fw.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Error Read"+e.getMessage());
		}
	}
}
