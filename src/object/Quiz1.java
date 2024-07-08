package object;

public class Quiz1 {

	public static void main(String[] args) {

		// 학생 정보.
		Student student = new Student("둘리", 5000);
		Student student2 = new Student("도우너", 10000);
		
		// 대중교통 정보.
		Bus bus = new Bus(100);
		Subway subway = new Subway("2호선");
		
		// 학생의 대중교통 이용정보
		student.takeBus(bus);
		student2.takeSubway(subway);
		
		// 학생 정보 출력
		student.showInfo();
		student2.showInfo();
		
		// 대중교통 정보 출력
		bus.showInfo();
		subway.showInfo();
	}

}
