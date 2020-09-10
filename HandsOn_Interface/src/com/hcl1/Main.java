package com.hcl1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ChooseStall Type\n" + "1)Gold Stall\n" + "2)Premium Stall\n" + "3)Executive Stall\n");
		int choice = Integer.parseInt(br.readLine());
		switch (choice) {

		case 1:
			GoldStall s = new GoldStall();
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
			String str = br.readLine();
			String x[] = str.split(",");
			s.setStallName(x[0]);
			s.setCost(Integer.parseInt(x[1]));
			s.setOwnerName(x[2]);
			s.setTvSet(Integer.parseInt(x[3]));
			s.display();
			break;

		case 2:
			PremiumStall ps = new PremiumStall();
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
			String p = br.readLine();
			String y[] = p.split(",");
			ps.setStallName(y[0]);
			ps.setCost(Integer.parseInt(y[1]));
			ps.setOwnerName(y[2]);
			ps.setProjector(Integer.parseInt(y[3]));
			ps.display();
			break;

		case 3:
			ExecutiveStall es = new ExecutiveStall();
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
			String e = br.readLine();
			String z[] = e.split(",");
			es.setStallName(z[0]);
			es.setCost(Integer.parseInt(z[1]));
			es.setOwnerName(z[2]);
			es.setScreen(z[3]);
			es.display();
			break;

		}
	}

}
