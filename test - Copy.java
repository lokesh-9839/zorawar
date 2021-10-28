import java.util.*;
import java.io.*;

public class Test {

	public static void main(String[] args) {

		try {
			BufferedReader br;
			File f;
			FileReader fr;
			BufferedWriter bw;
			String s;
			FileWriter fw;
			f = new File("C:\\Users\\lokesh\\Desktop\\main.txt");
			br = new BufferedReader(new FileReader(f));
			fw = new FileWriter(f, true);

			try {
				fw.write("\n|lokesh|2200|ljsj|up| male|\r\n" + "");

				fw.write("|balvant|1400|mnv|bihar| male|\r\n" + "");

				fw.write("|vishav|1200|vish|jk| male|\r\n" + "");

				fw.close();

				while ((s = br.readLine()) != null)
					System.out.println(s);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}