public class BattleshipGame
{
	public static void main(String[] args)
	{
		char[][] computerLayout = new char[10][10];
		
		char[][] computerGrid = {{'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'}};
								 
		char[][] playerLayout = {{'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
								 {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'}};
								 
		computerLayout = randomizeBoards(computerLayout);
		playerLayout = randomizeBoards(playerLayout);
		
		
		printGrid(computerGrid);
		System.out.println();
		System.out.println();
		printGrid(playerLayout);
		
		
	}
	public static char[][] randomizeBoards(char[][] a)
	{
		boolean[] x = new boolean[10];
		boolean[] y = new boolean[10];
		
		for(int i = 0; i < 8; i++)
		{
		
			//coordinates randomized
			int xCoordinate = (int) (Math.random() * 10);
			while(x[xCoordinate])
			{
				xCoordinate = (int) (Math.random() * 10);
			}
			x[xCoordinate] = true;
			
			int yCoordinate = (int) (Math.random() * 10);
			while(y[yCoordinate])
			{
				yCoordinate = (int) (Math.random() * 10);
			}
			y[yCoordinate] = true;

			
			//direction is random 0 == y placement of ships and 1 == x placement of ship
			int direction = (int) (Math.random() * 2); 
			
			//ship placement length 2
			if(direction == 0 && (i == 0 || i == 1))
			{
				if(a.length - 3 >= yCoordinate && a.length - 3 >= xCoordinate)
				{	
					a[yCoordinate][xCoordinate] = 'S';
					a[yCoordinate + 1][xCoordinate] = 'S';
				}
				else if(a.length - 3 <= yCoordinate && a.length - 3 <= xCoordinate)
				{	
					a[yCoordinate][xCoordinate] = 'S';
					a[yCoordinate - 1][xCoordinate] = 'S';
				}
				else 
				{
					i--;
					y[yCoordinate] = false;
					x[xCoordinate] = false;
				}
				
			}
			else if(direction == 1 && (i == 0 || i == 1))
			{
			
				if(a.length - 3 >= yCoordinate && a.length - 3 >= xCoordinate)
				{	
					a[yCoordinate][xCoordinate] = 'S';
					a[yCoordinate][xCoordinate + 1] = 'S';
				}
				else if(a.length - 3 <= yCoordinate && a.length - 3 <= xCoordinate)
				{	
					a[yCoordinate][xCoordinate] = 'S';
					a[yCoordinate][xCoordinate - 1] = 'S';
				}
				else 
				{
					i--;
					y[yCoordinate] = false;
					x[xCoordinate] = false;
				}
				
			}
			//ship length 3 placement
			if(direction == 0 && (i == 2 || i == 3 || i == 4))
			{
				if(a.length - 4 >= yCoordinate && a.length - 4 >= xCoordinate)
				{	
					a[yCoordinate][xCoordinate] = 'S';
					a[yCoordinate + 1][xCoordinate] = 'S';
					a[yCoordinate + 2][xCoordinate] = 'S';
		
				}
				else if(a.length - 4 <= yCoordinate && a.length - 4 <= xCoordinate)
				{	
					a[yCoordinate][xCoordinate] = 'S';
					a[yCoordinate - 1][xCoordinate] = 'S';
					a[yCoordinate - 2][xCoordinate] = 'S';
		
				}
				else 
				{
					i--;
					y[yCoordinate] = false;
					x[xCoordinate] = false;
				}
			}
			else if(direction == 1 && (i == 2 || i == 3 || i == 4))
			{
				if(a.length - 4 >= yCoordinate && a.length - 4 >= xCoordinate)
				{	
					a[yCoordinate][xCoordinate] = 'S';
					a[yCoordinate][xCoordinate + 1] = 'S';
					a[yCoordinate][xCoordinate + 2] = 'S';
				}
				else if(a.length - 4 <= yCoordinate && a.length - 4 <= xCoordinate)
				{	
					a[yCoordinate][xCoordinate] = 'S';
					a[yCoordinate][xCoordinate - 1] = 'S';
					a[yCoordinate][xCoordinate - 2] = 'S';
				}
				else 
				{
					i--;
					y[yCoordinate] = false;
					x[xCoordinate] = false;
				}
			}
			//ship length 4 placement
			if(direction == 0 && (i == 5 || i == 6))
			{
				if(a.length - 5 >= yCoordinate && a.length - 5 >= xCoordinate)
				{	
					a[yCoordinate][xCoordinate] = 'S';
					a[yCoordinate + 1][xCoordinate] = 'S';
					a[yCoordinate + 2][xCoordinate] = 'S';
					a[yCoordinate + 3][xCoordinate] = 'S';
				}
				else if(a.length - 5 <= yCoordinate && a.length - 5 <= xCoordinate)
				{	
					a[yCoordinate][xCoordinate] = 'S';
					a[yCoordinate - 1][xCoordinate] = 'S';
					a[yCoordinate - 2][xCoordinate] = 'S';
					a[yCoordinate - 3][xCoordinate] = 'S';
				}
				else 
				{
					i--;
					y[yCoordinate] = false;
					x[xCoordinate] = false;
				}
				
			}
			else if(direction == 1 && (i == 5 || i == 6))
			{
				if(a.length - 5 >= yCoordinate && a.length - 5 >= xCoordinate)
				{	
					a[yCoordinate][xCoordinate] = 'S';
					a[yCoordinate][xCoordinate + 1] = 'S';
					a[yCoordinate][xCoordinate + 2] = 'S';
					a[yCoordinate][xCoordinate + 3] = 'S';
				}
				else if(a.length - 5 <= yCoordinate && a.length - 5 <= xCoordinate)
				{	
					a[yCoordinate][xCoordinate] = 'S';
					a[yCoordinate][xCoordinate - 1] = 'S';
					a[yCoordinate][xCoordinate - 2] = 'S';
					a[yCoordinate][xCoordinate - 3] = 'S';
				}
				else 
				{
					i--;
					y[yCoordinate] = false;
					x[xCoordinate] = false;
				}
				
			}
			//ship length 6 placement
			if(direction == 0 && i == 7)
			{
				if(a.length - 7 >= yCoordinate && a.length - 7 >= xCoordinate)
				{
					a[yCoordinate][xCoordinate] = 'S';
					a[yCoordinate + 1][xCoordinate] = 'S';
					a[yCoordinate + 2][xCoordinate] = 'S';
					a[yCoordinate + 3][xCoordinate] = 'S';
					a[yCoordinate + 4][xCoordinate] = 'S';
					a[yCoordinate + 5][xCoordinate] = 'S';
				}
				else if(a.length - 7 <= yCoordinate && a.length - 7 <= xCoordinate)
				{
					a[yCoordinate][xCoordinate] = 'S';
					a[yCoordinate - 1][xCoordinate] = 'S';
					a[yCoordinate - 2][xCoordinate] = 'S';
					a[yCoordinate - 3][xCoordinate] = 'S';
					a[yCoordinate - 4][xCoordinate] = 'S';
					a[yCoordinate - 5][xCoordinate] = 'S';
				}
				else 
				{
					i--;
					y[yCoordinate] = false;
					x[xCoordinate] = false;
				}
				
			}
			else if(direction == 1 && i == 7)
			{
				if(a.length - 7 >= yCoordinate && a.length - 7 >= xCoordinate)
				{
					a[yCoordinate][xCoordinate] = 'S';
					a[yCoordinate][xCoordinate + 1] = 'S';
					a[yCoordinate][xCoordinate + 2] = 'S';
					a[yCoordinate][xCoordinate + 3] = 'S';
					a[yCoordinate][xCoordinate + 4] = 'S';
					a[yCoordinate][xCoordinate + 5] = 'S';
				}
				else if(a.length - 7 <= yCoordinate && a.length - 7 <= xCoordinate)
				{
					a[yCoordinate][xCoordinate] = 'S';
					a[yCoordinate][xCoordinate - 1] = 'S';
					a[yCoordinate][xCoordinate - 2] = 'S';
					a[yCoordinate][xCoordinate - 3] = 'S';
					a[yCoordinate][xCoordinate - 4] = 'S';
					a[yCoordinate][xCoordinate - 5] = 'S';
				}
				else 
				{
					i--;
					y[yCoordinate] = false;
					x[xCoordinate] = false;
				}

			}
						
		}//end for loop
		
		return a;
		
	}//end randomizeBoard()
		
		public static void printGrid(char[][] a)
		{
			System.out.println("1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10");
			System.out.println("----------------------------------------");
			
			int count = 1;
			
			for(int i = 0; i < a.length; i++)
			{
				System.out.print(count + "|");
				
				for(int j = 0; j < a.length; j++)
				{
					System.out.print(a[i][j] + " | ");
				}//end inner loop
				
				count++;
				System.out.println();
			}//end outer loop
			
		}//end printGrid()

}//end class