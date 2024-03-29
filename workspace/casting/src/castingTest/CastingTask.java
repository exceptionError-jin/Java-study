package castingTest;

//넷플릭스
//애니메이션, 영화, 드라마 클래스 선언
//사용자가 선택한 영상이
//애니메이션이라면 "자막 지원" 기능 사용
//영화라면 "4D" 기능 사용
//드라마라면 "굿즈" 기능 사용
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











