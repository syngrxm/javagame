package makeAGame;

import java.util.Scanner;

class Script {
	Scanner in = new Scanner(System.in);
	String enter;
	
	void fall() {
		// 처음에 갑자기 하늘에서 무인도로 떨어짐
		System.out.println("당신은 방금 눈을 떴습니다.");
		System.out.println(". . .");
		System.out.println("그리고 당신 눈앞에는 야자수가 보입니다.");
		System.out.println(". . .");
		System.out.println("당신은 생각합니다. '원래 한국에 야자수가 있었나?' ");
		System.out.println("주위를 둘러보다가 당신이 속옷만 입고 있다는 걸 깨달았습니다.");
		System.out.println("<system> 다음 내용으로 넘어가려면 skip을 입력하세요.");
		do {
			enter = in.next();
			if (enter.equals("skip"))
				break;
			else
				System.out.println("<system> 다음 내용으로 넘어가려면 skip을 입력하세요.");
		} while (!enter.equals("skip"));
		System.out.print("\n \n \n");
	}
	
	void realize() {
		// 무인도인 것을 인지하고 어떻게든 살아남아 보려고 노력함
		System.out.println("당신은 주변을 더 살핀 후 생각합니다. '아... 여기 무인도구나' ");
		System.out.println(" '내가 어디 있다가 여기로 갑자기 떨어진 거지...?' ");
		System.out.println(". . .");
		System.out.println("당신은 눈에 보이는 안 익은 바나나를 구워 먹고, "
				+ "그늘에서 자는 등 살아가 보려고 노력합니다.");
		System.out.println("<system> 다음 내용으로 넘어가려면 skip을 입력하세요.");
		do {
			enter = in.next();
			if (enter.equals("skip"))
				break;
			else
				System.out.println("<system> 다음 내용으로 넘어가려면 skip을 입력하세요.");
		} while (!enter.equals("skip"));
		System.out.print("\n \n \n");
	}
	
	void sos() {
		// 구조 요청을 하며 그 뒤의 행적
		System.out.println("당신은 수 차례 구조 요청을 해 보지만, "
				+ "결국 소용이 없다는 것을 깨닫게 됩니다.");
		System.out.println(". . .");
		System.out.println("그렇게 날이 얼마나 지나가고 있는지 모르는 채로\n"
				+ "계속 구조 요청을 하다가 어느 날 갑자기 배에 하트 모양으로 "
				+ "털이 있는 원숭이를 만나게 되는데...");
		System.out.println("<system> 다음 내용으로 넘어가려면 skip을 입력하세요.");
		do {
			enter = in.next();
			if (enter.equals("skip"))
				break;
			else
				System.out.println("<system> 다음 내용으로 넘어가려면 skip을 입력하세요.");
		} while (!enter.equals("skip"));
		System.out.print("\n \n \n");
	}
	
	void firstMonkey() {
		// 원숭이를 따라가고 살아남을 수 있는 방법을 모색
		System.out.println("한 번 마주한 후부터 그 원숭이는 당신의 곁을 맴도는 것 같습니다.");
		System.out.println("비슷한 나날이 반복되는 와중에, 그 원숭이는 본인을 따라오라는 제스쳐를 합니다.");
		System.out.println("조금은 망설이다가 당신은 결국 '뭐 있겠어?'라고 생각하며"
				+ " 따라가게 됩니다.");
		System.out.println("원숭이를 따라 도착한 장소에는 원숭이의 아지트와 "
				+ "원숭이와 대화할 수 있는 네 가지 방법이 있었습니다.");
		System.out.println();
		System.out.println("[일주일 후. . .]");
		System.out.println("당신은 이제 눈 감고도 원숭이의 아지트에 갈 수 있었고,"
				+ " 네 가지 방법으로 무엇을 할 수 있는지 알게 되었습니다.");
		System.out.println("바로 의식주였습니다. 어떻게 원숭이와 대화해서 이런 걸"
				+ " 얻을 수 있는 건지 궁금했지만, 그것은 그렇게 중요하지 않다고 생각합니다.");
		System.out.println("당신은 살아남는 게 더 중요했기 때문에 그 네 가지 방법에 몰두하게 됩니다.");
		System.out.println("<system> 다음 내용으로 넘어가려면 skip을 입력하세요.");
		do {
			enter = in.next();
			if (enter.equals("skip"))
				break;
			else
				System.out.println("<system> 다음 내용으로 넘어가려면 skip을 입력하세요.");
		} while (!enter.equals("skip"));
		System.out.print("\n \n \n");
	}
	
	void explainGame() {
		// 기본 게임 설명
		System.out.println("<system> 원숭이와 대화하는 네 가지 방법은 명령어 네 가지와 같습니다. "
				+ "의, 식, 주, 그리고 탈출 수단이 있습니다.");
		System.out.println("하지만 탈출 수단은 의, 식, 주 각각에 해당되는 아이템을 "
				+ "세 개씩 이상 얻어야 접근할 수 있습니다.");
		System.out.println("<system> '의' 아이템을 얻는 게임은 <>이고,"
				+ " '식'에 해당되는 아이템을 얻는 게음은 <>이고,"
				+ " '주'에 해당되는 아이템을 얻는 게임은 <>입니다.");
		System.out.println("<system> 각 게임을 시작하려면 먼저 원숭이를 호출한 후,"
				+ " '의' 또는 '식' 또는 '주'를 말하고 게임을 진행하여"
				+ " 차례대로 게임을 진행하면 됩니다.");
		System.out.println("<system> 과연 당신은 무인도에서 잘 살아남을 수 있을까요. . .");
		System.out.println("<system> 다음 내용으로 넘어가려면 skip을 입력하세요.");
		do {
			enter = in.next();
			if (enter.equals("skip"))
				break;
			else
				System.out.println("<system> 다음 내용으로 넘어가려면 skip을 입력하세요.");
		} while (!enter.equals("skip"));
		System.out.print("\n \n \n");
	}
	void exit() {
		System.out.println("<system> 드디어 아이템을 전부 얻게 되었습니다. 축하합니다! ");
		System.out.println("갑자기 원숭이가 자기 몸집보다 큰 뗏목을 가지고 왔다.");
		System.out.println("Enter 키를 입력해 주세요.");
		enter = in.nextLine();
		System.out.println("바로 알아봤다. 내가 이곳에서 탈출할 수 있는 수단이라는 것을...!");
		System.out.println("⸝ 　　⸝ 　　⸝ 　　⸝ 　　⸝ 　　⸝ 　　⸝\r\n"
				+ "　⸝ 　　⸝ 　　⸝ 　　⸝ 　　⸝ 　　⸝\r\n"
				+ "𓂃𓂃𓂃𓂃𓊝𓄹𓄺𓂃𓂃𓆞𓂃𓂃𓂃\r\n"
				+ "𓆡   𓆟  𓇼   𓆞  𓂂\r\n"
				+ "𓆝    𓂂  𓆉   𓂂");
		System.out.println("Enter 키를 입력해 주세요.");
		enter = in.nextLine();
		System.out.println(".");
		enter = in.nextLine();
		System.out.println(".");
		enter = in.nextLine();
		System.out.println(".");
		enter = in.nextLine();
		System.out.println(".");
		enter = in.nextLine();
		System.out.println(".");
		enter = in.nextLine();
		System.out.println(".");
		System.out.println(" '헉...!' 익숙한 알람소리가 들린다...");
		System.out.println("이게 전부 꿈이었다니....................");
		System.out.println("\n\n-THE END-\n\n");
	}
}