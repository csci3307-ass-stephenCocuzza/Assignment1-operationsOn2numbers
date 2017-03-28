package src.com.mycompany.basicmathoperations.oop;

public class SubtractOperatorFor2numbers extends OperatorFor2numbers implements Subtract {

	//public class MultiplyOperatorFor2numbers extends OperatorFor2numbers implements Multiply, Has2numbers {

		
		public SubtractOperatorFor2numbers() {
//			super();	
		}
		
		public SubtractOperatorFor2numbers(float _number1, float number2) {
			super(_number1,number2);	// NOTE 1st the parent's constructor executes
			System.out.println("parent's number1 is " + super.number1);
			System.out.println("_number1:" + _number1);
			System.out.println("number2:" + number2);
		}

		public SubtractOperatorFor2numbers(float number1, float number2, String junk) {
			this(number1, number2);	// NOTE 1st the constructor above runs
			Float someJunk = this.subtract2numbers();
//			super(number1,number2);
//			System.out.println("number1:" + number1);
//			System.out.println("number2:" + number2);
			System.out.println("junk:" + junk);
		}
		
		
		
		 
		@Override
		public int subtract(int num1, int num2) {
			return num1 - num2;
		}

		
		@Override
		public float subtract(float num1, float num2) {
			return num1 - num2;
		}

		@Override
		public float subtract2numbers() {
//			System.out.println("parent's number1 is" + super.getNumber1());
			return number1 - number2;
		}

	}
