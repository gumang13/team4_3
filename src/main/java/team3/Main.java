package team3;

import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.주인 정보 등록, 2.매칭, 0. 프로그램 종료");
			String menu = sc.nextLine();
			OwnerClaimDTO dto = new OwnerClaimDTO();
			OwnerClaimDAO dao = new OwnerClaimDAO();
			
			int result = 0;
			
			if(menu.equals("1")) {
				System.out.println("주인 정보 등록");
				
			}else if(menu.equals("2")) {
				System.out.println("매칭");
				
			}else if(menu.equals("3")) {
				System.out.println("조회");
				       List<OwnerClaimDTO> list=dao.selectAll();
				       for(OwnerClaimDTO a : list) {
				    	   System.out.println("확인용 아이디 : "+a.getLost_item_id()+"    오너클레임아이디"+a.getOwner_claim_id()+"오너 네임"+a.getOwner_name());
				       }
				       
				
			}else if(menu.equals("0")) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}

}