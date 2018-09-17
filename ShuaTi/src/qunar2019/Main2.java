package qunar2019;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @date 2018年9月17日 上午10:28:48
 * @author 龙
 * 类描述：骑士跳问题的简单版
 */
class MazeNode{
	int x;
	int y;
	int step;
	public MazeNode(int xx, int yy, int steps) {
		x = xx;
		y = yy;
		step = steps;
	}
}

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//记录起点和终点
		int startX = input.nextInt();
		int startY = input.nextInt();
		int endX = input.nextInt();
		int endY = input.nextInt();
		
		Queue<MazeNode> list = new LinkedList<>();
		MazeNode startNode = new MazeNode(startX, startY, 0);
		MazeNode temp = null;
		int[][] maze = new int[9][9];
		list.add(startNode);
		int min = 9999;
		//广度优先搜索策略，将8种可能的点存入队列，在出队判断是否是终点，不是则继续计算8个点
		while(!list.isEmpty()) {
			//出队，不是终点，就将8个点放入
			temp = list.poll();
			int newStep = temp.step;
			if(temp.x == endX && temp.y == endY) {
				if(newStep < min) {
					min = newStep;
				}
				break;
			}else {
				newStep++;
				//入队8个
				if(outOfMaze(temp.x - 2, temp.y + 1))
					list.add(new MazeNode(temp.x - 2, temp.y + 1, newStep));
				if(outOfMaze(temp.x - 1, temp.y + 2))
					list.add(new MazeNode(temp.x - 1, temp.y + 2, newStep));
				if(outOfMaze(temp.x + 1, temp.y + 2))
					list.add(new MazeNode(temp.x + 1, temp.y + 2, newStep));
				if(outOfMaze(temp.x + 2, temp.y + 1))
					list.add(new MazeNode(temp.x + 2, temp.y + 1, newStep));
				if(outOfMaze(temp.x + 2, temp.y - 1))
					list.add(new MazeNode(temp.x + 2, temp.y - 1, newStep));
				if(outOfMaze(temp.x + 1, temp.y - 2))
					list.add(new MazeNode(temp.x + 1, temp.y - 2, newStep));
				if(outOfMaze(temp.x - 1, temp.y - 2))
					list.add(new MazeNode(temp.x - 1, temp.y - 2, newStep));
				if(outOfMaze(temp.x - 2, temp.y - 1))
					list.add(new MazeNode(temp.x - 2, temp.y - 1, newStep));
			}
		}
		System.out.println(min);
	}

	private static boolean outOfMaze(int x, int y) {
		return (x >= 1) && (x <= 8) && (y >= 1) && (y <= 8);
	}
}
