import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
		int flag = 0;
		final int N = 20;
		String[] words = new String[N];

		Scanner scnr = new Scanner(System.in);
		String key = scnr.next();
		int cnt = scnr.nextInt();
		for (int i = 0; i < cnt; i++) {
		   try{
			words[i] = scnr.next();
		   } catch (Exception e) {
		      words[i] = Integer.toString(scnr.nextInt());  
		   }
		   }
		}

    for(

    int j = 0;j<words.length;j++)
    {
        if (key.equals(words[j])) {
            flag = 1;
            break;
        }
    }

    if(flag==1)System.out.println(true);else System.out.println(false);
}}
