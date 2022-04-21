
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int num1, num2=0;
		boolean flag = false;
			try (Scanner scanner = new Scanner (System.in)) {
				System.out.println("Введите выражение вида: a + b");
				String str1 = scanner.nextLine();
				String str2 [] = new String [4];
				str2 = str1.split(" ");
				try {
					 if (str2.length==3) { 
				 }else {throw new Exception ();}
				 
				  }
				 catch (Exception ex) {
				 System.out.println("Ошибка! Неверный формат введенных значений");
				 System.exit(1)
				 ;}
				char [] op = str2[1].toCharArray();
				char oper = op [0];
				String [] roman = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
				
				for (int i = 0; i < roman.length; i++){  for (int j = 0; j < roman.length; j++) {
      
				if ((str2[0].equals(roman[i]))&&(str2[2].equals(roman[j]))){
				        flag = true;
				        break;}
				}}
				if(flag) {	
						num1 = convert(str2[0]);
						num2 = convert(str2[2]);
						int result = calculate (num1, num2, oper);
						String res = convertNumToRoman(result);
						System.out.println(res);
						}
				else {
					num1 = Integer.parseInt(str2[0]);
				    num2 = Integer.parseInt(str2[2]);
				    int result = calculate (num1, num2, oper);
				    System.out.println(result);
					}
				}  
				catch (NumberFormatException ex){ System.out.println("Ошибка! Используются разные систсемы счисления");}
			
	}

    public static int convert (String n) {
    	
    	if (n.equals("I")) return 1 ;
    	if (n.equals("II")) return 2 ;
    	if (n.equals("III")) return 3 ;
    	if (n.equals("IV")) return 4;
        if (n.equals("V")) return 5;
        if (n.equals("VI")) return 6;
        if (n.equals("VII")) return 7;
        if (n.equals("VIII")) return 8;
        if (n.equals("IX")) return 9;
        if (n.equals("X")) return 10;
    	
    	return 0;
    	
    }
    public static int calculate (int num1, int num2, char  oper) {
    	int output=0; 
    	if((num1>0 && num1<=10)&&(num2>0 && num2<=10) ) {
           		switch (oper) {
    			case '+':
    				output=num1+num2;
    				break;
    			case '-':
    				output=num1-num2;
    				break;
    			case '/':
    				
    				try {
    					output=num1/num2;
    					} 
    				catch (ArithmeticException | InputMismatchException e) {
    	                    System.out.println("Exception : " + e);
    	                    System.out.println("Делить на ноль нельзя!");
    	                    }break;
    			case '*':
    				output=num1*num2;
    				break;
           		} 		
           		}
    	else {
    		System.out.println("Ошибка! Введите значение от 1 до 10 арабском или римском формате");
    		System.exit(1);;
    	}
    		return output;
}
    private static String convertNumToRoman (int numArabian) {
       try { String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        final String s = roman[numArabian];
        return s;
    } catch (ArrayIndexOutOfBoundsException exe) {System.out.println("В риском формате нет отрицательных значений и нуля!");}
	System.exit(1);
       return null; } 
      
    }

