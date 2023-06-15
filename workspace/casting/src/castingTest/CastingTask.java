package castingTest;

//���ø���
//�ִϸ��̼�, ��ȭ, ��� Ŭ���� ����
//����ڰ� ������ ������
//�ִϸ��̼��̶�� "�ڸ� ����" ��� ���
//��ȭ��� "4D" ��� ���
//��󸶶�� "����" ��� ���
public class CastingTask {
	public void checkVideo(Video video) {
		if(video instanceof Animation) {
			Animation animation = new Animation();
			animation.animation();
		}
		else if(video instanceof Movie) {
			Movie movie = new Movie();
			movie.movie();
		}
		else if(video instanceof Film) {
			Film film = new Film();
			film.film();
		}
	}
	
	public static void main(String[] args) {
		CastingTask castingTask = new CastingTask();
		Video[] videos = {
			new Animation()
			, new Movie()
			, new Film()
		};
		
		for (int i = 0; i < videos.length; i++) {
			castingTask.checkVideo(videos[i]);
		}
	}
}











