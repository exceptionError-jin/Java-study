package methodTest;

public class MethodTask {
//   1~10���� println()���� ����ϴ� �޼ҵ�
	void printFrom1To10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

//   "ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
	void printHong(int end){
		for (int i = 0; i < end; i++) {
			System.out.println("ȫ�浿");
		}
	}
	
//   �̸��� n�� println()���� ����ϴ� �޼ҵ�
	void printName(String name, int end) {
		for (int i = 0; i < end; i++) {
			System.out.println(name);
		}
	}

//   �� ������ �������ִ� �޼ҵ�
	int sub(int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}

//   �� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ�
	int[] div(int num1, int num2){
		int[] result = null;
		
		if(num2 != 0) {
			result = new int[2];
			result[0] = num1 / num2;
			result[1] = num1 % num2;
		}
		return result;
	}

//   1~n������ ���� �����ִ� �޼ҵ�
	int total(int end){
		int total = 0;
		
		for (int i = 0; i < end; i++) {
			total += i + 1;
		}
		return total;
	}

//   Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
	int change(int number){
		return ++number;
	}
   
//   ���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
	String changeString(String string){
		String result = "";
		
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if(c >= 65 && c <= 90) {
				result += (char)(c + 32);
			}
			else if(c >= 97 && c <= 122) {
				result += (char)(c - 32);
			}
			else {
				result += c;
			}
		}
		return result;
	}
   
//   ���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
   int getCount(String string, char target) {
      int count = 0;
      for (int i = 0; i < string.length(); i++) {
         char c = string.charAt(i);
         if(c == target) {
            count++;
         }
      }
      return count;
   }
   
//   5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
   int getValue(int[] arData, int index) {
      return arData[index];
   }
   
//   �ѱ��� ������ �ٲ��ִ� �޼ҵ� (�ϰ��̻� -> 1024)
   int changeToInteger(String hangle) {
      String hangleOriginal = "�����̻�����ĥ�ȱ�";
      String result = "";
      
      for (int i = 0; i < hangle.length(); i++) {
         result += hangleOriginal.indexOf(hangle.charAt(i));
      }
      return Integer.parseInt(result);
   }
   
//   5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
//   int[] getMaxAndMin(int[] arData) {
//      int[] results = new int[2];
//      
//      results[0] = arData[0];
//      results[1] = arData[0];
//      
//      for (int i = 1; i < arData.length; i++) {
//         if(results[0] < arData[i]) { results[0] = arData[i]; }
//         if(results[1] > arData[i]) { results[1] = arData[i]; }
//      }
//      
//      return results;
//   }
   
//   5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
   void getMaxAndMin(int[] arData, int[] results) {
      results[0] = arData[0];
      results[1] = arData[0];
      
      for (int i = 1; i < arData.length; i++) {
         if(results[0] < arData[i]) { results[0] = arData[i]; }
         if(results[1] > arData[i]) { results[1] = arData[i]; }
      }
   }
   
//   indexOf() �����
   int indexOf(String string, char target) {
      for (int i = 0; i < string.length(); i++) {
         char c = string.charAt(i);
         
         if(c == target) {
            return i;
         }
      }
      return -1;
   }
   
   public static void main(String[] args) {
      MethodTask methodTask = new MethodTask();
      
      int[] arData = {2, 5, 7, 3, 1};
      int[] result = new int[2];
      
      methodTask.getMaxAndMin(arData, result);
      
      System.out.println("�ִ밪: " + result[0]);
      System.out.println("�ּҰ�: " + result[1]);
   }
}
























