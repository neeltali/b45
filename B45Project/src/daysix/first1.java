package daysix;

 class first1 {
	
	void disp() {
		System.out.println("i am from parent class");
	}
	
	
	class second1 {
		void disp() {
			System.out.println( "i am from second class");
		}
		
		class third extends first1, second1 {
			void disp() {
				System.out.println("i a from third class");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


