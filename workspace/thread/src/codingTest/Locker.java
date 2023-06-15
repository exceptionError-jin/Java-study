package codingTest;

public class Locker {
//	���ݼ� p
//	��� s
//	number : 82195 - ���ݼ�
//	target : 64723 - ���
	public int solution(String p, String s) {
		int answer = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int numP = p.charAt(i), targetS = s.charAt(i);
			
//			targetS - numP�� ���� ������� ����� 10������, ������ 10�� ����
			int result = targetS - numP < 0 ? 10 + (targetS - numP) : 10 - (targetS - numP);
			
//			����� ���밪�� 5���� ũ�� ���� ��� �״��, 5���� ������ 10�� ���� �ʰ� �� ���� ���밪
			answer += Math.abs(targetS - numP) > 5 ? result : Math.abs(targetS - numP);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(new Locker().solution("00000000000000000000", "91919191919191919191"));
	}
	
	
}