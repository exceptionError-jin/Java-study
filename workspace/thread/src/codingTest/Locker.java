package codingTest;

public class Locker {
//	눈금선 p
//	비번 s
//	number : 82195 - 눈금선
//	target : 64723 - 비번
	public int solution(String p, String s) {
		int answer = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int numP = p.charAt(i), targetS = s.charAt(i);
			
//			targetS - numP의 값이 음수라면 결과에 10더해줌, 양수라면 10을 빼줌
			int result = targetS - numP < 0 ? 10 + (targetS - numP) : 10 - (targetS - numP);
			
//			결과의 절대값이 5보다 크면 위에 결과 그대로, 5보다 작으면 10을 빼지 않고 뺀 값의 절대값
			answer += Math.abs(targetS - numP) > 5 ? result : Math.abs(targetS - numP);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(new Locker().solution("00000000000000000000", "91919191919191919191"));
	}
	
	
}