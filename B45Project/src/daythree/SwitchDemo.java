package daythree;

public class SwitchDemo {

	public static void main(String[] args) {
		char x='w';
		switch (x)
		{
		case 'l':  
		case 'L':    
			System.out.println(x+ " is a letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x+" is a digit");
			break;
			
		case 'w':
		case 'W':
			System.out.println(x+ " is a white space");
			break;
		case 's':
		case 'S':
			System.out.println(x+ " is special letter");
			break;
		default:
			System.out.println(x+" is other than letter");
			break;
		}

	}

}
