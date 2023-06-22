package makeAGame;

import java.util.Scanner;

import java.util.Random;

import java.util.ArrayList;

class Clothes extends ClothesRule {
	// 필요한 거 미리 정의하기
	Scanner in = new Scanner(System.in);
	Random r = new Random();
	
	String leopard, bigLeaf, boneNeedle, enter;
	static int numLeo = 0, numLeaf = 0, numNeedle = 0, h, y;

	String[][] g1 = new String[7][3];
	{
	for (int i = 0; i < g1.length; i++) {
		for (int j = 0; j < g1[i].length; j++) {
			g1[i][j] = "O";
		}
	}
	}
	
	void startClothes() {
		System.out.println("<system> 의식주 중 '의'를 얻는 게임을 선택했습니다.");
		
		
		// 세 개 모두 없을 때 명령어
		if (numLeo == 0 && numLeaf == 0 && numNeedle == 0) {
			do {
				System.out.println("<system> 표범 가죽(leopard)과 대왕 나뭇잎(bigLeaf), 뼈바늘(boneNeedle) 중"
						+ "\n하나를 선택해 게임을 진행할 수 있습니다.");
				System.out.println("<system> 한 가지를 선택하여 해당되는 영문을 입력해 주세요");
				enter = in.next();
				if (enter.equals("leopard")) {
					System.out.println("\n<system> 표범 가죽을 얻는 게임을 시작합니다.");
					System.out.println("<system> 표범 가죽으로는 상의를 만들 수 있습니다.");
					getLeopard();
					break;
				}
				else {
					if (enter.equals("bigLeaf")) {
						System.out.println("\n<system> 대왕 나뭇잎을 얻는 게임을 시작합니다.");
						System.out.println("<system> 대왕 나뭇잎으로는 하의를 만들 수 있습니다.");
						getBigLeaf();
						break;
					}
					else if (enter.equals("boneNeedle")) {
						System.out.println("\n<system> 뼈바늘을 얻는 게임을 시작합니다.");
						System.out.println("<system> 뼈바늘은 옷을 만드는 과정에 사용될 예정입니다.");
						getBoneNeedle();
						break;
					}
					else
						System.out.println("\n<system> 세 가지 중 한 가지를 다시 입력해 주세요.");
				}
			} while (!enter.equals("leopard") || !enter.equals("bigLeaf") || !enter.equals("boneNeedle"));
		}
		// 뼈바늘을 보유 중인 경우
		else if (numNeedle == 1) {
			if ((numLeo == 0) && (numLeaf == 0)) {
				do {
					System.out.println("\n<system> 당신은 현재 뼈바늘을 보유 중입니다.");
					System.out.println("<system> 표범 가죽(leopard)과 대왕 나뭇잎(bigLeaf) 중"
							+ "\n하나를 선택해 게임을 진행할 수 있습니다.");
					System.out.println("<system> 한 가지를 선택하여 해당되는 영문을 입력해 주세요.");
					enter = in.next();
					if (enter.equals("leopard")) {
						System.out.println("\n<system> 표범 가죽을 얻는 게임을 시작합니다.");
						System.out.println("<system> 표범 가죽으로는 상의를 만들 수 있습니다.");
						getLeopard();
						break;
					}
					else {
						if (enter.equals("bigLeaf")) {
							System.out.println("\n<system> 대왕 나뭇잎을 얻는 게임을 시작합니다.");
							System.out.println("<system> 대왕 나뭇잎으로는 하의를 만들 수 있습니다.");
							getBigLeaf();
							break;
						}
						else {
							System.out.println("\n<system> 두 가지 중 한 가지를 다시 입력해 주세요.");
						}
					}
			} while (!enter.equals("leopard") || !enter.equals("bigLeaf"));
		}
			else {
				if ((numLeo == 1) && (numLeaf == 0)) {
					System.out.println("\n<system> 당신은 현재 뼈바늘과 표범 가죽을 보유 중입니다.");
					System.out.println("<system> 대왕 나뭇잎을 얻는 게임을 자동으로 실행합니다.");
					getBigLeaf();
				}
				else if ((numLeo == 0) && (numLeaf == 1)) {
					System.out.println("\n<system> 당신은 현재 뼈바늘과 대왕 나뭇잎을 보유 중입니다.");
					System.out.println("<system> 표범 가죽을 얻는 게임을 자동으로 실행합니다.");
					getLeopard();
				}
				else {
					System.out.println("\n<system> 당신은 현재 모든 '의' 아이템을 보유하고 있습니다."
							+ "\n메인 화면으로 돌아갑니다.");
				}
			}
	}
		// 대왕 나뭇잎을 보유 중인 경우
		else if (numLeaf == 1) {
			if ((numLeo == 0) && (numNeedle == 0)) {
				do {
					System.out.println("\n<system> 당신은 현재 대왕 나뭇잎을 보유 중입니다.");
					System.out.println("<system> 표범 가죽(leopard)과 뼈바늘(boneNeedle) 중"
							+ "\n하나를 선택해 게임을 진행할 수 있습니다.");
					System.out.println("<system> 한 가지를 선택하여 해당되는 영문을 입력해 주세요.");
					enter = in.next();
					if (enter.equals("leopard")) {
						System.out.println("\n<system> 표범 가죽을 얻는 게임을 시작합니다.");
						System.out.println("<system> 표범 가죽으로는 상의를 만들 수 있습니다.");
						getLeopard();
						break;
					}
					else {
						if (enter.equals("boneNeedle")) {
							System.out.println("\n<system> 뼈바늘을 얻는 게임을 시작합니다.");
							System.out.println("<system> 뼈바늘은 옷을 만드는 과정에서 사용될 예정입니다.");
							getBoneNeedle();
							break;
						}
						else {
							System.out.println("\n<system> 두 가지 중 한 가지를 다시 입력해 주세요.");
						}
					}
			} while (!enter.equals("leopard") || !enter.equals("boneNeedle"));
		}
			else {
				if ((numLeo == 1) && (numNeedle == 0)) {
					System.out.println("\n<system> 당신은 현재 대왕 나뭇잎과 표범 가죽을 보유 중입니다.");
					System.out.println("<system> 뼈바늘을 얻기 위한 게임을 자동으로 실행합니다.");
					getBoneNeedle();
				}
				else if ((numLeo == 0) && (numNeedle == 1)) {
					System.out.println("\n<system> 당신은 현재 대왕 나뭇잎과 뼈바늘을 보유 중입니다.");
					System.out.println("<system> 표범 가죽을 얻는 게임을 자동으로 실행합니다.");
					getLeopard();
				}
				else {
					System.out.println("\n<system> 당신은 현재 모든 '의' 아이템을 보유하고 있습니다."
							+ "\n메인 화면으로 돌아갑니다.");
				}
			}
		}
		
		// 표범 가죽을 보유 중인 경우
		else {
			if ((numLeaf == 0) && (numNeedle == 0)) {
				do {
					System.out.println("\n<system> 당신은 현재 표범 가죽을 보유 중입니다.");
					System.out.println("<system> 대왕 나뭇잎(bigLeaf)과 뼈바늘(boneNeedle) 중"
							+ "\n하나를 선택해 게임을 진행할 수 있습니다.");
					System.out.println("<system> 한 가지를 선택하여 해당되는 영문을 입력해 주세요.");
					enter = in.next();
					if (enter.equals("bigLeaf")) {
						System.out.println("\n<system> 대왕 나뭇잎을 얻는 게임을 시작합니다.");
						System.out.println("<system> 대왕 나뭇잎으로는 하의를 만들 수 있습니다.");
						getBigLeaf();
						break;
					}
					else {
						if (enter.equals("boneNeedle")) {
							System.out.println("\n<system> 뼈바늘을 얻는 게임을 시작합니다.");
							System.out.println("<system> 뼈바늘은 옷을 만드는 과정에서 사용될 예정입니다.");
							getBoneNeedle();
							break;
						}
						else {
							System.out.println("\n<system> 두 가지 중 한 가지를 다시 입력해 주세요.");
						}
					}
			} while (!enter.equals("bigLeaf") || !enter.equals("boneNeedle"));
		}
			else {
				if ((numLeaf == 1) && (numNeedle == 0)) {
					System.out.println("\n<system> 당신은 현재 표범 가죽과 대왕 나뭇잎을 보유 중입니다.");
					System.out.println("<system> 뼈바늘을 얻기 위한 게임을 자동으로 실행합니다.");
					getBoneNeedle();
				}
				else if ((numLeaf == 0) && (numNeedle == 1)) {
					System.out.println("\n<system> 당신은 현재 표범 가죽과 뼈바늘을 보유 중입니다.");
					System.out.println("<system> 대왕 나뭇잎을 얻기 위한 게임을 자동으로 실행합니다.");
					getBigLeaf();
				}
				else {
					System.out.println("\n<system> 당신은 현재 모든 '의' 아이템을 보유하고 있습니다."
							+ "\n메인 화면으로 돌아갑니다.");
			}
		}
	}
}
	
	void getLeopard() {
		String[][] g1 = new String[7][3];
		{
		for (int i = 0; i < g1.length; i++) {
			for (int j = 0; j < g1[i].length; j++) {
				g1[i][j] = "O";
			}
		}
		int chance = 50;
		int row[] = new int[2];
		for (int i = 0; i < row.length; i++) {
			row[i] = r.nextInt(7);
		}
		int column[] = new int[2];
		for (int i = 0; i < column.length; i++) {
			column[i] = r.nextInt(3);
		}
		int avoidy = row[0], avoidi = column[0];
		int findy = row[1], findi = column[1];
		
			
		System.out.println("\n<system> '표범 가죽'을 얻을 수 있는 게임을 진행하겠습니다.");
		System.out.println("<system> 게임의 룰을 간단하게 설명하겠습니다.");
		rule();
		System.out.println("<system> '표범 가죽'을 얻는 게임의 지뢰와 보물은 각 1개씩 있습니다.");
		System.out.println("<system> 기회는 총 50번입니다.");
		System.out.println("<system> 행운을 빕니다, 파이팅!!\n\n\n\n\n\n");
		System.out.println("<system> 게임을 시작합니다.\n\n\n\n\n\n");
		
		for (int i = 0; i < g1.length; i++) {
			for (int j = 0; j < g1[i].length; j++) {
				System.out.print(g1[i][j] + " ");
			}
			System.out.println();
		}
		
		do {
			System.out.println("<game message> 기회는 " + chance-- + "번 남았습니다.");
			System.out.println("<game message> 확인하고 싶은 행과 열을 입력해 주세요. (단, 행 <= 7, 열 <= 3)");
			System.out.print("행: ");
			h = (in.nextInt() - 1);
			System.out.print("열: ");
			y = (in.nextInt() - 1);
			
			if ((h > 7) || (y > 3)) {
				System.out.println("\n\n ***** <game message> 단, 행 <= 7, 열 <= 3 ***** ");
				chance++;
				continue;
			}
			
			if ((h == avoidy) && (y == avoidi)) {
				g1[h][y] = "X";
				for (int i = 0; i < g1.length; i++) {
					for (int j = 0; j < g1[i].length; j++) {
						System.out.print(g1[i][j] + " ");
					}
					System.out.println();
				}
				System.out.print("<game message> Enter키를 누르면 넘어갑니다.\n");
				String a = in.nextLine();
				System.out.println("三☞三☞\r\n"
						+ "  三☞三☞\r\n"
						+ "　三☞三☞\r\n"
						+ "　  三☞三☞\r\n"
						+ "　　三☞三☞\r\n"
						+ "　　  三☞三☞\r\n"
						+ "　　　三☞三☞\r\n"
						+ "(☞'ω')☞三☞三☞\r\n"
						+ "　　　三☞三☞\r\n"
						+ "　　  三☞三☞\r\n"
						+ "　　三☞三☞\r\n"
						+ "　  三☞三☞\r\n"
						+ "　三☞三☞\r\n"
						+ "");
				System.out.println("<game message> 지뢰의 공격에 당했습니다.");
				System.out.println("<game message> 게임을 종료합니다.\n");
				break;
			}
			
			else if ((h == findy) && (y == findi)) {
				g1[h][y] = "X";
				for (int i = 0; i < g1.length; i++) {
					for (int j = 0; j < g1[i].length; j++) {
						System.out.print(g1[i][j] + " ");
					}
					System.out.println();
				}
				System.out.print("<game message> Enter키를 누르면 넘어갑니다.\n");
				String a = in.nextLine();
				System.out.println("  /\\__/\\\r\n"
						+ "꒰˶• ༝ •˶꒱~♡︎\r\n"
						+ " / v v  \\\r\n"
						+ " |      |\r\n"
						+ "  づ___づ\r\n"
						+ "");
				System.out.println("<game message> 보물을 찾았습니다!");
				System.out.println("<game message> '표범 가죽'을 얻었습니다.");
				numLeo = 1;
				System.out.println("<game message> 게임을 종료합니다.\n");
				break;
			}
			
			else {
				g1[h][y] = "X";
				for (int i = 0; i < g1.length; i++) {
					for (int j = 0; j < g1[i].length; j++) {
						System.out.print(g1[i][j] + " ");
						}
					System.out.println();
					}
				System.out.print("<game message> Enter키를 누르면 넘어갑니다.\n");
				String a = in.nextLine();
				}
			} while ((chance != 0) || ((h == avoidy) && (y == avoidi)) || ((h == findy) && (y == findi)));
		}
	}
	
	void getBigLeaf() {
		String[][] g1 = new String[7][3];
		{
		for (int i = 0; i < g1.length; i++) {
			for (int j = 0; j < g1[i].length; j++) {
				g1[i][j] = "O";
			}
		}
	}
		int chance = 30;
		int[] row = new int[4];
		for (int i = 0; i < row.length; i++) {
			row[i] = r.nextInt(7);
		}
		int column[] = new int[4];
		for (int i = 0; i < column.length; i++) {
			column[i] = r.nextInt(3);
		}
		
		int avoidy1 = row[0], avoidy2 = row[1], avoidi1 = column[0], avoidi2 = column[1];
		int findy1 = row[2], findy2 = row[3], findi1 = column[2], findi2 = column[3];
		
		System.out.println("\n<system> '대왕 나뭇잎'을 얻을 수 있는 게임을 진행하겠습니다.");
		
		System.out.println("<system> 게임의 룰을 간단하게 설명하겠습니다.");
		rule();
		System.out.println("<system> '대왕 나뭇잎'을 얻는 게임의 지뢰와 보물은 각 2개씩 존재합니다.");
		System.out.println("기회는 총 30번입니다.");
		System.out.println("<system> 행운을 빕니다, 파이팅!!\n\n\n\n\n\n");
		System.out.println("<system> 게임을 시작합니다.\n\n\n\n\n\n");
		
		for (int i = 0; i < g1.length; i++) {
			for (int j = 0; j < g1[i].length; j++) {
				System.out.print(g1[i][j] + " ");
			}
			System.out.println();
		}
		
		do {
			System.out.println("<game message> 기회는 " + chance-- + "번 남았습니다.");
			System.out.println("<game message> 확인하고 싶은 행과 열을 입력해 주세요. (단, 행 <= 7, 열 <= 3)");
			System.out.print("행: ");
			h = (in.nextInt() - 1);
			System.out.print("열: ");
			y = (in.nextInt() - 1);
			
			if ((h > 7) || (y > 3)) {
				System.out.println("\n\n ***** <game message> 단, 행 <= 7, 열 <= 3 *****");
				chance++;
				continue;
			}
			
			if (((h == avoidy1) && (y == avoidi1) || (h == avoidy2) && (y == avoidi2))) {
				g1[h][y] = "X";
				for (int i = 0; i < g1.length; i++) {
					for (int j = 0; j < g1[i].length; j++) {
						System.out.print(g1[i][j] + " ");
					}
					System.out.println();
				}
				System.out.print("<game message> Enter키를 누르면 넘어갑니다.\n");
				String a = in.nextLine();
				System.out.println("三☞三☞\r\n"
						+ "  三☞三☞\r\n"
						+ "　三☞三☞\r\n"
						+ "　  三☞三☞\r\n"
						+ "　　三☞三☞\r\n"
						+ "　　  三☞三☞\r\n"
						+ "　　　三☞三☞\r\n"
						+ "(☞'ω')☞三☞三☞\r\n"
						+ "　　　三☞三☞\r\n"
						+ "　　  三☞三☞\r\n"
						+ "　　三☞三☞\r\n"
						+ "　  三☞三☞\r\n"
						+ "　三☞三☞\r\n"
						+ "");
				System.out.println("<game message> 지뢰의 공격에 당했습니다.");
				System.out.println("<game message> 게임을 종료합니다.\n");
				break;
			}
			
			else if ((h == findy1) && (y == findi1) || (h == findy2) && (y == findi2)) {
				g1[h][y] = "X";
				for (int i = 0; i < g1.length; i++) {
					for (int j = 0; j < g1[i].length; j++) {
						System.out.print(g1[i][j] + " ");
					}
					System.out.println();
				}
				System.out.print("<game message> Enter키를 누르면 넘어갑니다.\n");
				String a = in.nextLine();
				System.out.println("  /\\__/\\\r\n"
						+ "꒰˶• ༝ •˶꒱~♡︎\r\n"
						+ " / v v  \\\r\n"
						+ " |      |\r\n"
						+ "  づ___づ\r\n"
						+ "");
				System.out.println("<game message> 보물을 찾았습니다!");
				System.out.println("<game message> '대왕 나뭇잎'을 얻었습니다.");
				numLeaf = 1;
				System.out.println("<game message> 게임을 종료합니다.\n");
				break;
			}
			
			else {
				g1[h][y] = "X";
				for (int i = 0; i < g1.length; i++) {
					for (int j = 0; j < g1[i].length; j++) {
						System.out.print(g1[i][j] + " ");
					}
					System.out.println();
				}
				System.out.print("<game message> Enter키를 누르면 넘어갑니다.\n");
				String a = in.nextLine();
			}
		} while ((chance != 0) || ((h == avoidy1) && (y == avoidi1)) || ((h == findy1) && (y == findi1)) || ((h == avoidy2) && (y == avoidi2)) || ((h == findy2) && (y == findi2)));
	}
		
	void getBoneNeedle() {
		String[][] g1 = new String[7][3];
		{
		for (int i = 0; i < g1.length; i++) {
			for (int j = 0; j < g1[i].length; j++) {
				g1[i][j] = "O";
			}
		}
	}
		int chance = 10;
		int[] row = new int[4];
		for (int i = 0; i < row.length; i++) {
			row[i] = r.nextInt(7);
		}
		int column[] = new int[4];
		for (int i = 0; i < column.length; i++) {
			column[i] = r.nextInt(3);
		}
		
		int avoidy1 = row[0], avoidy2 = row[1], avoidi1 = column[0], avoidi2 = column[1];
		int findy1 = row[2], findy2 = row[3], findi1 = column[2], findi2 = column[3];
		
		System.out.println("\n<system> '뼈바늘'을 얻을 수 있는 게임을 진행하겠습니다.");
		
		System.out.println("<system> 게임의 룰을 간단하게 설명하겠습니다.");
		rule();
		System.out.println("<system> '뼈바늘'을 얻는 게임의 지뢰와 보물은 각 2개씩 존재합니다.");
		System.out.println("기회는 총 10번입니다.");
		System.out.println("<system> 행운을 빕니다, 파이팅!!\n\n\n\n\n\n");
		System.out.println("<system> 게임을 시작합니다.\n\n\n\n\n\n");
		
		for (int i = 0; i < g1.length; i++) {
			for (int j = 0; j < g1[i].length; j++) {
				System.out.print(g1[i][j] + " ");
			}
			System.out.println();
		}
		
		do {
			System.out.println("<game message> 기회는 " + chance-- + "번 남았습니다.");
			System.out.println("<game message> 확인하고 싶은 행과 열을 입력해 주세요. (단, 행 <= 7, 열 <= 3)");
			System.out.print("행: ");
			h = (in.nextInt() - 1);
			System.out.print("열: ");
			y = (in.nextInt() - 1);
			
			if ((h > 7) || (y > 3)) {
				System.out.println("\n\n ***** <game message> 단, 행 <= 7, 열 <= 3 *****");
				chance++;
				continue;
			}
			
			if (((h == avoidy1) && (y == avoidi1) || (h == avoidy2) && (y == avoidi2))) {
				g1[h][y] = "X";
				for (int i = 0; i < g1.length; i++) {
					for (int j = 0; j < g1[i].length; j++) {
						System.out.print(g1[i][j] + " ");
					}
					System.out.println();
				}
				System.out.print("<game message> Enter키를 누르면 넘어갑니다.\n");
				String a = in.nextLine();
				System.out.println("三☞三☞\r\n"
						+ "  三☞三☞\r\n"
						+ "　三☞三☞\r\n"
						+ "　  三☞三☞\r\n"
						+ "　　三☞三☞\r\n"
						+ "　　  三☞三☞\r\n"
						+ "　　　三☞三☞\r\n"
						+ "(☞'ω')☞三☞三☞\r\n"
						+ "　　　三☞三☞\r\n"
						+ "　　  三☞三☞\r\n"
						+ "　　三☞三☞\r\n"
						+ "　  三☞三☞\r\n"
						+ "　三☞三☞\r\n"
						+ "");
				System.out.println("<game message> 지뢰의 공격에 당했습니다.");
				System.out.println("<game message> 게임을 종료합니다.\n");
				break;
			}
			
			else if ((h == findy1) && (y == findi1) || (h == findy2) && (y == findi2)) {
				g1[h][y] = "X";
				for (int i = 0; i < g1.length; i++) {
					for (int j = 0; j < g1[i].length; j++) {
						System.out.print(g1[i][j] + " ");
					}
					System.out.println();
				}
				System.out.print("<game message> Enter키를 누르면 넘어갑니다.\n");
				String a = in.nextLine();
				System.out.println("  /\\__/\\\r\n"
						+ "꒰˶• ༝ •˶꒱~♡︎\r\n"
						+ " / v v  \\\r\n"
						+ " |      |\r\n"
						+ "  づ___づ\r\n"
						+ "");
				System.out.println("<game message> 보물을 찾았습니다!");
				System.out.println("<game message> '뼈바늘'을 얻었습니다.");
				numNeedle = 1;
				System.out.println("<game message> 게임을 종료합니다.\n");
				break;
			}
			
			else {
				g1[h][y] = "X";
				for (int i = 0; i < g1.length; i++) {
					for (int j = 0; j < g1[i].length; j++) {
						System.out.print(g1[i][j] + " ");
					}
					System.out.println();
				}
				System.out.print("<game message> Enter키를 누르면 넘어갑니다.\n");
				String a = in.nextLine();
			}
		} while ((chance != 0) || ((h == avoidy1) && (y == avoidi1)) || ((h == findy1) && (y == findi1)) || ((h == avoidy2) && (y == avoidi2)) || ((h == findy2) && (y == findi2)));
	
	}
	
	void checkClothes() {
		if ((numLeo == 0) && (numLeaf == 0) && (numNeedle == 0)) {
			System.out.println("<system> 현재 보유하고 있는 '의' 아이템은 없습니다.");
		}
		else if (numLeaf == 0) {
			if ((numLeo == 0) && (numNeedle == 1))
				System.out.println("<system> 현재 보유하고 있는 '의' 아이템은 뼈바늘뿐입니다.");
			else if ((numLeo == 1) && (numNeedle == 0))
				System.out.println("<system> 현재 보유하고 있는 '의' 아이템은 표범 가죽입니다.");
			else if ((numLeo == 1) && (numNeedle == 1))
				System.out.println("<system> 현재 보유하고 있는 '의' 아이템은 표범 가죽과 뼈바늘입니다.");
		}
		else if (numNeedle == 0) {
			if ((numLeo == 0) && (numLeaf == 1))
				System.out.println("<system> 현재 보유하고 있는 '의' 아이템은 대왕 나뭇잎뿐입니다.");
			else if ((numLeo == 1) && (numLeaf == 0))
				System.out.println("<system> 현재 보유하고 있는 '의' 아이템은 표범 가죽뿐입니다.");
			else if ((numLeo == 1) && (numLeaf == 1))
				System.out.println("<system> 현재 보유하고 있는 '의' 아이템은 표범 가죽과 대왕 나뭇입니다.");
		}
		else if (numLeo == 0) {
			if ((numLeaf == 0) && (numNeedle == 1))
					System.out.println("<system> 현재 보유하고 있는 '의' 아이템은 뼈바늘뿐입니다.");
			else if ((numLeaf == 1) && (numNeedle == 0))
				System.out.println("<system> 현재 보유하고 있는 '의' 아이템은 대왕 나뭇잎뿐입니다.");
			else if ((numLeaf == 1) && (numNeedle == 1))
				System.out.println("<system> 현재 보유하고 있는 '의' 아이템은 대왕 나뭇잎과 뼈바늘입니다.");
		}
		else if ((numLeo == 1) && (numLeaf == 1) && (numNeedle ==1)) {
			System.out.println("<system> 현재 당신은 모든 '의' 아이테을 보유 중입니다.");
		}
	}
}