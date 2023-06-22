package makeAGame;

import java.util.Scanner;

class item extends Abode {
	   Scanner in = new Scanner(System.in);
	   static int rope = 0;
	   static int leaf = 0;
	   static int tree = 0;

	   void Ropewin() {
	      int lastnum = 0;
	      System.out.println("\n" + "독수리 먼저 게임을 시작합니다. 그럼, 시작!\n<play -> enter>");
	      String a = in.nextLine();
	      while (true) {
	         System.out.println("\n~~독수리 차례~~");
	         int cnum = 0;
	         if (lastnum == 27)
	            cnum = 3;
	         else if (lastnum == 28)
	            cnum = 2;
	         else if (lastnum == 29)
	            cnum = 1;
	         else
	            cnum = (int) (Math.random() * 2) + 1;
	         ;
	         for (int i = lastnum + 1; i <= lastnum + cnum; i++) {
	            if (i > 31) {
	               break;
	            }
	            System.out.println("-" + i + "-");
	         }
	         lastnum += cnum;
	         if (lastnum >= 31) {
	            System.out.println("독수리가 졌습니다. 당신은 밧줄을 획득했습니다! \n밧줄을 가지고 돌아갑니다.");
	            rope++;
	            break;
	         }
	         System.out.print("\n~~당신 차례~~\n(1부터 3까지의 숫자 중 고르세요): ");
	         int mnum = in.nextInt();
	         while (true) {
	            if ((3 < mnum) || (1 > mnum)) {
	               System.out.println("1, 2, 3 중 고르세요.");
	               mnum = in.nextInt();
	            } else
	               break;
	         }
	         for (int i = (lastnum + 1); i <= lastnum + mnum; i++) {
	            if (i > 31) {
	               break;
	            }
	            System.out.println("-" + i + "-");
	         }
	         lastnum += mnum;
	         if (lastnum >= 31) {
	            System.out.println("＜￣｀\\、　　　　  　／￣＞\r\n" + "　\\、　　＼　／⌒ ,ノ 　/´\r\n" + "　　　\\、　`（ ´*ω*)／\r\n"
	                  + "　　 　　>　 　 　,ノ 　\r\n" + "　　　　　∠_,,,/´””");
	            System.out.println("당신의 패배입니다. 밧줄획득에 실패했습니다. 안타깝네요!");
	            break;
	         }
	         System.out.println("\n<enter>");
	         in.nextLine();
	         a = in.nextLine();

	      }
	   }

	   void RopeLose() {
	      int lastnum = 0;
	      System.out.println("\n" + "당신 먼저 게임을 시작합니다. 그럼, 시작!\n<play -> enter>");
	      String a = in.nextLine();
	      while (true) {
	         System.out.print("\n~~당신 차례~~\n(1부터 3까지의 숫자 중 고르세요): ");
	         int mnum = in.nextInt();
	         while (true) {
	            if ((3 < mnum) || (1 > mnum)) {
	               System.out.println("1, 2, 3 중 고르세요.");
	               mnum = in.nextInt();
	            } else
	               break;
	         }
	         for (int i = (lastnum + 1); i <= lastnum + mnum; i++) {
	            if (i > 31) {
	               break;
	            }
	            System.out.println("-" + i + "-");
	         }
	         lastnum += mnum;
	         if (lastnum >= 31) {
	            System.out.println("＜￣｀\\、　　　　  　／￣＞\r\n" + "　\\、　　＼　／⌒ ,ノ 　/´\r\n" + "　　　\\、　`（ ´*ω*)／\r\n"
	                  + "　　 　　>　 　 　,ノ 　\r\n" + "　　　　　∠_,,,/´””");
	            System.out.println("당신의 패배입니다. 밧줄획득에 실패했습니다. 안타깝네요!");
	            break;
	         }
	         System.out.println("\n<enter>");
	         in.nextLine();
	         a = in.nextLine();
	         System.out.println("\n~~독수리 차례~~");
	         int cnum = 0;
	         if (lastnum == 27)
	            cnum = 3;
	         else if (lastnum == 28)
	            cnum = 2;
	         else if (lastnum == 29)
	            cnum = 1;
	         else
	            cnum = (int) (Math.random() * 2) + 1;
	         ;
	         for (int i = lastnum + 1; i <= lastnum + cnum; i++) {
	            if (i > 31) {
	               break;
	            }
	            System.out.println("-" + i + "-");
	         }
	         lastnum += cnum;
	         if (lastnum >= 31) {
	            System.out.println("독수리가 졌습니다. 당신은 밧줄을 획득했습니다! \n밧줄을 가지고 돌아갑니다.");
	            rope++;
	            break;
	         }

	      }
	   }

	   void LeafWin() {
	      int lastnum = 0;
	      System.out.println("\n" + "독수리 먼저 게임을 시작합니다. 그럼, 시작!\n<play -> enter>");
	      String a = in.nextLine();
	      while (true) {
	         System.out.println("\n~~독수리 차례~~");
	         int cnum = 0;
	         if (lastnum == 27)
	            cnum = 3;
	         else if (lastnum == 28)
	            cnum = 2;
	         else if (lastnum == 29)
	            cnum = 1;
	         else
	            cnum = (int) (Math.random() * 2) + 1;
	         ;
	         for (int i = lastnum + 1; i <= lastnum + cnum; i++) {
	            if (i > 31) {
	               break;
	            }
	            System.out.println("-" + i + "-");
	         }
	         lastnum += cnum;
	         if (lastnum >= 31) {
	            System.out.println("독수리가 졌습니다. 당신은 커다란 나뭇잎을 획득했습니다! \n커다란 나뭇잎을 가지고 돌아갑니다.");
	            leaf++;
	            break;
	         }
	         System.out.print("\n~~당신 차례~~\n(1부터 3까지의 숫자 중 고르세요): ");
	         int mnum = in.nextInt();
	         while (true) {
	            if ((3 < mnum) || (1 > mnum)) {
	               System.out.println("1, 2, 3 중 고르세요.");
	               mnum = in.nextInt();
	            } else
	               break;
	         }
	         for (int i = (lastnum + 1); i <= lastnum + mnum; i++) {
	            if (i > 31) {
	               break;
	            }
	            System.out.println("-" + i + "-");
	         }
	         lastnum += mnum;
	         if (lastnum >= 31) {
	            System.out.println("＜￣｀\\、　　　　  　／￣＞\r\n" + "　\\、　　＼　／⌒ ,ノ 　/´\r\n" + "　　　\\、　`（ ´*ω*)／\r\n"
	                  + "　　 　　>　 　 　,ノ 　\r\n" + "　　　　　∠_,,,/´””");
	            System.out.println("당신의 패배입니다. 커다란 나뭇잎 획득에 실패했습니다. 안타깝네요!");
	            break;
	         }
	         if ((lastnum == 7) || (lastnum == 8) || (lastnum == 9)) {
	            System.out.println("＜￣｀\\、　　　　  　／￣＞\r\n" + "　\\、　　＼　／⌒ ,ノ 　/´\r\n" + "　　　\\、　`（ ´*ω*)／\r\n"
	                  + "　　 　　>　 　 　,ノ 　\r\n" + "　　　　　∠_,,,/´””");
	            System.out.println("아악!! 갑작스러운 독수리의 공격을 받아 숫자가 늘어났습니다.");
	            lastnum += 12;
	         }

	         System.out.println("\n<enter>");
	         in.nextLine();
	         a = in.nextLine();
	      }

	   }

	   void LeafLose() {
	      int lastnum = 0;
	      System.out.println("\n" + "당신 먼저 게임을 시작합니다. 그럼, 시작!\n<play -> enter>");
	      String a = in.nextLine();
	      while (true) {
	         System.out.print("\n~~당신 차례~~\n(1부터 3까지의 숫자 중 고르세요): ");
	         int mnum = in.nextInt();
	         while (true) {
	            if ((3 < mnum) || (1 > mnum)) {
	               System.out.println("1, 2, 3 중 고르세요.");
	               mnum = in.nextInt();
	            } else
	               break;
	         }
	         for (int i = (lastnum + 1); i <= lastnum + mnum; i++) {
	            if (i > 31) {
	               break;
	            }
	            System.out.println("-" + i + "-");
	         }
	         lastnum += mnum;
	         if (lastnum >= 31) {
	            System.out.println("＜￣｀\\、　　　　  　／￣＞\r\n" + "　\\、　　＼　／⌒ ,ノ 　/´\r\n" + "　　　\\、　`（ ´*ω*)／\r\n"
	                  + "　　 　　>　 　 　,ノ 　\r\n" + "　　　　　∠_,,,/´””");
	            System.out.println("당신의 패배입니다. 커다란 나뭇잎 획득에 실패했습니다. 안타깝네요!");
	            break;
	         }
	         System.out.println("\n<enter>");
	         in.nextLine();
	         a = in.nextLine();
	         System.out.println("\n~~독수리 차례~~");
	         int cnum = 0;
	         if (lastnum == 27)
	            cnum = 3;
	         else if (lastnum == 28)
	            cnum = 2;
	         else if (lastnum == 29)
	            cnum = 1;
	         else
	            cnum = (int) (Math.random() * 2) + 1;
	         ;
	         for (int i = lastnum + 1; i <= lastnum + cnum; i++) {
	            if (i > 31) {
	               break;
	            }
	            System.out.println("-" + i + "-");
	         }
	         lastnum += cnum;
	         if (lastnum >= 31) {
	            System.out.println("독수리가 졌습니다. 당신은 커다란 나뭇잎을 획득했습니다! \n커다란 나뭇잎을 가지고 돌아갑니다.");
	            leaf++;
	            break;
	         }
	         if ((lastnum == 7) || (lastnum == 8) || (lastnum == 9)) {
	            System.out.println("＜￣｀\\、　　　　  　／￣＞\r\n" + "　\\、　　＼　／⌒ ,ノ 　/´\r\n" + "　　　\\、　`（ ´*ω*)／\r\n"
	                  + "　　 　　>　 　 　,ノ 　\r\n" + "　　　　　∠_,,,/´””");
	            System.out.println("아악!! 갑작스러운 독수리의 공격을 받아 숫자가 늘어났습니다.");
	            lastnum += 12;
	         }

	      }

	   }

	   void TreeWin() {

	      int lastnum = 0;
	      System.out.println("\n\n나무를 얻는 게임은 어렵습니다. 추가되는 룰을 알려드리겠습니다.\n<enter>\n");
	      System.out.println("1. 독수리가 몇 개의 숫자를 말했는지만 알 수 있습니다." + "\n2. 현재 몇 번째 숫자까지 말했는지 알 수 없습니다. "
	            + "\n3. 당신은 숫자를 5초 이내로 입력해야 합니다. "
	            + "\n4. 하지만 만약 당신이 31번째로 숫자를 말해야 할 때 31이 넘는 숫자를 1~3 중에서 아무거나 먼저 말하고 end를 외치면 나무를 얻을 수 있습니다. "
	            + "\n그럼, 행운을 빕니다!\n<enter>");

	      String k = in.nextLine();
	      System.out.println("\n" + "독수리 먼저 게임을 시작합니다. 그럼, 시작!\n<play -> enter>");
	      String a = in.nextLine();
	      while (true) {
	         System.out.println("\n~~독수리 차례~~");
	         int cnum = 0;
	         if (lastnum == 27)
	            cnum = 3;
	         else if (lastnum == 28)
	            cnum = 2;
	         else if (lastnum == 29)
	            cnum = 1;
	         else
	            cnum = (int) (Math.random() * 2) + 1;
	         if (lastnum > 31) {
	            break;
	         }
	         System.out.println("-" + cnum + "-");
	         lastnum += cnum;
	         if (lastnum >= 31) {
	            System.out.println("독수리가 졌습니다. 당신은 나무 막대를 획득했습니다! \n나무 막대를 가지고 돌아갑니다.");
	            tree++;
	            break;
	         }
	         System.out.print("\n~~당신 차례~~\n(1부터 3까지의 숫자 중 고르세요): ");
	         long start2 = System.currentTimeMillis();
	         int mnum = in.nextInt();
	         long end2 = System.currentTimeMillis();
	         if ((end2 - start2) > 5000) {
	            System.out.println("\n5초 안에 입력을 실패하셨습니다. 게임이 종료됩니다.");
	            break;
	         }
	         while (true) {
	            if ((3 < mnum) || (1 > mnum)) {
	   	         long start3 = System.currentTimeMillis();
		         mnum = in.nextInt();
		         long end3 = System.currentTimeMillis();
		         if ((end3 - start3) > 5000) {
		            System.out.println("\n5초 안에 입력을 실패하셨습니다. 게임이 종료됩니다.");
		            break;
		         }
	            } else
	               break;
	         }
	         if (lastnum > 31) {
	            break;
	         }
	         System.out.println("-" + mnum + "-");
	         lastnum += mnum;
	         if (lastnum >= 31) {
	            System.out.println("\n<next -> 점 >\n");
	            String n = null;
	            if (n.equals("end")) {
	               System.out.println("다행히도 당신은 나무 막대를 획득했습니다.\n독수리가 아쉬워하며 날아가네요. 잘하셨습니다!");
	               tree++;
	            } else {
	               System.out.println("＜￣｀\\、　　　　  　／￣＞\r\n" + "　\\、　　＼　／⌒ ,ノ 　/´\r\n" + "　　　\\、　`（ ´*ω*)／\r\n"
	                     + "　　 　　>　 　 　,ノ 　\r\n" + "　　　　　∠_,,,/´””");
	               System.out.println("당신은 end입력에 실패하여 나무 막대 획득에 실패했습니다. 안타깝네요!");
	            }
	            break;
	         }
	         System.out.println("\n<next -> 점 >");
	         a = in.next();

	      }

	   }

	   void TreeLose() {
	      int lastnum = 0;
	      System.out.println("나무를 얻는 게임은 어렵습니다. 추가되는 룰을 알려드리겠습니다.\n<enter>\n");
	      System.out.println("1. 독수리가 몇 개의 숫자를 말했는지만 알 수 있습니다." + "\n2. 현재 몇 번째 숫자까지 말했는지 알 수 없습니다. "
	            + "\n3. 당신은 숫자를 5초 이내로 입력해야 합니다. "
	            + "\n4. 하지만 만약 당신이 31번째로 숫자를 말해야 할 때 31이 넘는 숫자를 1~3 중에서 아무거나 먼저 말하고 end를 외치면 나무를 얻을 수 있습니다. "
	            + "\n그럼, 행운을 빕니다!\n<enter>");

	      String k = in.nextLine();
	      System.out.println("\n" + "당신 먼저 게임을 시작합니다. 그럼, 시작!\n<play -> enter>");
	      String a = in.nextLine();
	      while (true) {
	         System.out.print("\n~~당신 차례~~\n(1부터 3까지의 숫자 중 고르세요): ");
	         long start2 = System.currentTimeMillis();
	         int mnum = in.nextInt();
	         long end2 = System.currentTimeMillis();
	         if ((end2 - start2) > 5000) {
	            System.out.println("\n5초 안에 입력을 실패하셨습니다. 게임이 종료됩니다.");
	            break;
	         }
	         while (true) {
	            if ((3 < mnum) || (1 > mnum)) {
	   	         start2 = System.currentTimeMillis();
		         mnum = in.nextInt();
		         end2 = System.currentTimeMillis();
		         if ((end2 - start2) > 5000) {
		            System.out.println("\n5초 안에 입력을 실패하셨습니다. 게임이 종료됩니다.");
		            break;
		         }
	            } else
	               break;
	         }
	         if (lastnum > 31) {
	            break;
	         }
	         System.out.println("-" + mnum + "-");
	         lastnum += mnum;
	         if (lastnum >= 31) {
	            System.out.println("\n<next -> 점 >\n");
	            String n = in.next();
	            if (n.equals("end")) {
	               System.out.println("다행히도 당신은 나무 막대를 획득했습니다.\n독수리가 아쉬워하며 날아가네요. 잘하셨습니다!");
	               tree++;
	            } else {
	               System.out.println("＜￣｀\\、　　　　  　／￣＞\r\n" + "　\\、　　＼　／⌒ ,ノ 　/´\r\n" + "　　　\\、　`（ ´*ω*)／\r\n"
	                     + "　　 　　>　 　 　,ノ 　\r\n" + "　　　　　∠_,,,/´””");
	               System.out.println("당신은 end입력에 실패하여 나무 막대 획득에 실패했습니다. 안타깝네요!");
	            }
	            break;
	         }
	         System.out.println("\n<next -> 점 >");
	         a = in.next();
	         System.out.println("\n~~독수리 차례~~");
	         int cnum = 0;
	         if (lastnum == 27)
	            cnum = 3;
	         else if (lastnum == 28)
	            cnum = 2;
	         else if (lastnum == 29)
	            cnum = 1;
	         else
	            cnum = (int) (Math.random() * 2) + 1;
	         if (lastnum > 31) {
	            break;
	         }
	         System.out.println("-" + cnum + "-");
	         lastnum += cnum;
	         if (lastnum >= 31) {
	            System.out.println("독수리가 졌습니다. 당신은 나무 막대를 획득했습니다! \n나무 막대를 가지고 돌아갑니다.");
	            tree++;
	            break;
	         }
	      }

	   }

	   void nowitem() {
	      System.out.printf("<system> 현재 보유하고 있는 '주'의 아이템은 밧줄 %d개, 커다란 나뭇잎 %d개, 나무 막대 %d개 입니다.\n", rope, leaf, tree);
	   }

}