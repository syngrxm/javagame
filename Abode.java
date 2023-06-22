package makeAGame;

import java.util.Random;
import java.util.Scanner;

class Abode {
   Scanner in = new Scanner(System.in);
   static int win = 0;
   static int lose = 0;

   void RSP() {
	  win = 0;
	  lose = 0;
      Random ran = new Random();

      System.out.println("지금부터 베스킨라빈스 31 게임을 시작합니다.\n<next -> enter>");
      String a = in.nextLine();
      System.out.println("게임의 진행 방법은 독수리와 차례대로 1부터 31까지의 수를 순차적으로 부르고, \n"
            + "3개의 수 까지 연달아 부를 수 있으며 마지막 31을 부르면 지게 됩니다. \n<next -> enter>");
      a = in.nextLine();
      System.out.println("\n게임에 앞서 먼저 게임 순서를 정하기 위해 가위바위보를 합니다. 이기면 나중에 시작하게 됩니다.\n<next -> enter>\n");
      a = in.nextLine();
      while (true) {

         System.out.print("가위바위보!\n가위(r), 바위(s), 보(p)중에서 하나를 영어로 입력하세요. : ");
         String rsp = in.next();
         while (true) {
            if (!rsp.equals("r") && rsp.equals("s") && rsp.equals("p")) {
               System.out.println("r, s, p 중에서 다시 입력하세요.");
               rsp = in.next();
            } else {
               break;
            }
         }
         String computer, r, s, p;
         int i = ran.nextInt(2);
         if (i == 0) {
            computer = "r";
         } else if (i == 1) {
            computer = "s";
         } else {
            computer = "p";
         }
         System.out.println("\n독수리가 낸 것 : " + computer);
         if (rsp.equals(computer)) {
            System.out.println("무승부입니다. 가위바위보를 다시 합니다.\n");
            continue;
         } else if (rsp.equals("r")) {
            if (computer.equals("s")) {
               System.out.println("이기셨습니다. 게임을 나중에 시작합니다.\n그럼, 행운을 빕니다!");
               win++;
               break;
            } else {
               System.out.println("졌습니다. 게임을 먼저 시작합니다.\n그럼, 행운을 빕니다!");
               lose++;
               break;
            }

         } else if (rsp.equals("p")) {
            if (computer.equals("s")) {
               System.out.println("졌습니다. 게임을 먼저 시작합니다.\n그럼, 행운을 빕니다!");
               lose++;
               break;
            } else {
               System.out.println("이겼습니다. 게임을 나중에 시작합니다.\n그럼, 행운을 빕니다!");
               win++;
               break;
            }

         } else if (rsp.equals("s")) {
            if (computer.equals("r")) {
               System.out.println("졌습니다. 게임을 먼저 시작합니다.\n그럼, 행운을 빕니다!");
               lose++;
               break;
            } else {
               System.out.println("이겼습니다. 게임을 나중에 시작합니다.\n그럼, 행운을 빕니다!");
               win++;
               break;
            }

         }
      }

   }
}