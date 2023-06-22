package makeAGame;


import java.util.Arrays;
import java.util.Scanner;

public class Xisland {
	
	public static void main(String[] args) {
		// 로비
		Scanner in = new Scanner(System.in);
		int exiting = 0;
		String inputy, inputi;
		int food = 0;
		Script startgame = new Script();
		startgame.fall();
		startgame.realize();
		startgame.sos();
		startgame.firstMonkey();
		startgame.explainGame();
		System.out.println("<system> 본격적으로 게임을 시작합니다.");
		Clothes c = new Clothes();
		Abode a = new Abode();
		Ministart my = new Ministart();
		item me = new item();
		Food f = new Food();
		
		do {
			exiting = Clothes.numLeaf + Clothes.numLeo + Clothes.numNeedle + item.rope + item.leaf + item.tree;
			if (exiting == 6)
				startgame.exit();
			else { System.out.println("<system> 당신이 보유한 아이템을 확인하시겠습니까?"
					+ "\n<system> 확인하시겠다면 yes, 바로 게임을 진행하시겠다면 no를 입력해 주세요.");
			inputi = in.next();
			if (inputi.equals("yes")) {
				c.checkClothes();
				System.out.println("<system> 당신이 보유하고 있는 음식은 " + food + "개입니다.");
				me.nowitem();
			}
			System.out.print("<system> 원숭이가 왔습니다. '의', '식', '주' 중 얻고 싶은 것을 선택하여 입력하세요. :");
			inputy = in.next();
			if (inputy.equals("의"))
				c.startClothes();
			else if (inputy.equals("식")) {
				 String[] Line3 = { "대화", "대화", "주엽", "정발산", "마두", "백석", "대곡", "화정", "원당", "원흥", "삼송", "지축", "구파발", "연신내", "불광",
				            "녹번", "홍제", "무악재", "독립문", "경복궁", "안국", "종로3가", "을지로3가", "충무로", "동대입구", "약수", "금호", "옥수", "압구정", "신사",
				            "잠원", "고속터미널", "교대", "남부터미널", "양재", "매봉", "도곡", "대치", "학여울", "대청", "일원", "수서", "가락시장", "경찰병원", "오금" };
				      String[] Line2 = { "신설동", "용두", "신답", "용답", "성수", "까치산", "신정네거리", "양천구청", "도림천", "신도림", "시청", "을지로입구", "을지로3가",
				            "을지로4가", "동대문역사문화공원", "신당", "상왕십리", "왕십리", "한양대", "뚝섬", "성수", "건대입구", "구의", "강변", "잠실나루", "잠실", "잠실새내",
				            "종합운동장", "삼성", "선릉", "역삼", "강남", "교대", "서초", "방배", "사당", "낙성대", "서울대입구", "봉천", "신림", "신대방", "구로디지털단지",
				            "대림", "신도림", "문래", "영등포구청", "당산", "합정", "홍대입구", "신촌", "이대", "아현", "충정로" };
				      String[] Line4 = { "당고개", "상계", "노원", "창동", "쌍문", "수유", "미아", "미아사거리", "길음", "성신여대입구", "한성대입구", "혜화", "동대문",
				            "동대문역사문화공원", "충무로", "명동", "회현", "서울역", "숙대입구", "삼각지", "신용산", "이촌", "동작", "총신대입구", "사당", "남태령" };

				      System.out.println("지하철 게임에 오신것을 환영합니다");
				      System.out.println("플레이하실 호선을 숫자만 입력하세요. (단, 2 3 4 중 하나 선택)");

				      String s4 = "4호선";
				      String s3 = "3호선";
				      String s2 = "2호선";
				      int line = in.nextInt();
				      if (line == 4) {
				         System.out.println(s4);
				      }

				      else if (line == 3) {
				         System.out.println(s3);
				      }

				      else if (line == 2) {
				         System.out.println(s2);

				      }


				      String aa = null;
				      int cnt = 0;

				      if (line == 4)
				         for (int i = 0; i <= 9; i++) {
				            System.out.printf("<system> %d호선에 있는 역을 입력해 주세요", line);
				            aa = in.next();
				            if (Arrays.asList(Line4).contains(aa)) {
				               cnt++;
				               if (cnt == 10) {
				                  System.out.println("축하합니다.");
				                  f.checkFood();
				                  food++;
				                  break;
				               }

				               else
				                  continue;
				            } else if (!(Arrays.asList(Line3).contains(aa)))
				               System.out.printf("<system> %d호선에 해당되는 역이 아닙니다." + "\n<system> 게임을 종료합니다.", line);
				            else
				               System.out.println("다시 입력해 주세요.");

				         }

				      if (line == 3)
				         for (int i = 0; i <= 9; i++) {
				            System.out.printf("<system> %d호선에 있는 역을 입력해 주세요", line);
				            aa = in.next();
				            if (Arrays.asList(Line3).contains(aa)) {
				               cnt++;
				               if (cnt == 10) {
				                  System.out.println("축하합니다.");
				                  f.checkFood();
				                  food++;
				                  break;
				               }

				               else
				                  continue;
				            } else if (!(Arrays.asList(Line2).contains(aa)))
				               System.out.printf("<system> %d호선에 해당되는 역이 아닙니다." + "\n<system> 게임을 종료합니다.", line);
				            else
				               System.out.println("다시 입력해 주세요.");
				         }

				      if (line == 2)
				         for (int i = 0; i <= 9; i++) {
				            System.out.printf("<system> %d호선에 있는 역을 입력해 주세요", line);
				            aa = in.next();
				            if (Arrays.asList(Line2).contains(aa)) {
				               cnt++;
				               if (cnt == 10) {
				                  System.out.println("축하합니다.");
				                  f.checkFood();
				                  food++;
				                  break;
				               }

				               else
				                  continue;
				            } else if (!(Arrays.asList(Line2).contains(aa)))
				               System.out.printf("<system> %d호선에 해당되는 역이 아닙니다." + "\n<system> 게임을 종료합니다.", line);
				            else
				               System.out.println("다시 입력해 주세요.");
				         }
			}
			else if (inputy.equals("주")) {
				int rope = 0;
				int leaf = 0;
				int tree = 0;
				my.start();
				String item = in.next();
				while (!item.equals("rope") && !item.equals("leaf") && !item.equals("tree")) {
					System.out.println("다시 입력하세요");
				    item = in.next();
				}
				if (item.equals("rope")) {
					me.RSP();
				    if ((me.win == 1) && (me.lose == 0)) {
				    	me.Ropewin();
				    }		    
				    else if ((me.lose == 1) && (me.win == 0))
				    	me.RopeLose();
				}
				else if (item.equals("leaf")) {
					me.RSP();
					if ((me.win == 1) && (me.lose == 0))
						me.LeafWin();
					else if ((me.lose == 1) && (me.win == 0))
						me.LeafLose();
				      }
					else if (item.equals("tree")) {
						me.RSP();
						if ((me.win == 1) && (me.lose == 0))
							me.TreeWin();
						else if ((me.lose == 1) && (me.win == 0))
							me.TreeLose();
				      }
			}
		}
			
			
		} while (exiting != 6);
	}

}


