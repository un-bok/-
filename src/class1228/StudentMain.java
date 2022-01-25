package class1228;

import java.util.ArrayList;
import java.util.Random;

public class StudentMain {
	public static void main(String[] args) {
		String[] name = { "홍길동", "전우치", "유관순", "신사임당", "김유신" };
		int[] age = { 100, 200, 300, 400, 500 };
		char[] gender = { '남', '여' };
		String[] address = { "대구시", "대전시", "서울시", "부산시", "광주시" };

		Random r = new Random();
		r.setSeed(System.currentTimeMillis());
//		for (int i=0; i<5; i++) {
//			//int n = r.nextInt(5);
//			System.out.println(name[r.nextInt(5)]);
//		}
	/*	ArrayList<Student> stList = new ArrayList<Student>();
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1);
			stList.add(new Student(
					name[r.nextInt(5)],
					age[r.nextInt(5)],
					gender[r.nextInt(2)],
					address[r.nextInt(5)]));
			// Student s = stList.get(i);
			// s.showStudentInfo();
			stList.get(i).showStudentInfo();

			System.out.println("-----------");
		}
		System.out.println("삭제");
		int size = stList.size();
		for (int i = 0; i < stList.size(); i++) {
			Student st = stList.get(i);
			String delName = st.getName();
			if (stList.get(i).getName().equals("김유신")) {
				stList.remove(i);
				i--;
			}
		}
		for (int i = 0; i < stList.size(); i++) {
			System.out.println(i + 1);
			stList.get(i).showStudentInfo();
			System.out.println("-----------");
		}*/
	Student[] st = new Student[5];
	for (int i = 0; i < st.length; i++) {
		System.out.println(i + 1);
		st[i] = new Student(i+100,name[r.nextInt(5)], age[r.nextInt(5)], gender[r.nextInt(2)], address[r.nextInt(5)]);
		st[i].showStudentInfo();
		System.out.println("-----------");
	}
	System.out.println("삭");
	for (int i = 0; i < st.length; i++) {
		System.out.println(i + 1);
		if (st[i].getName().equals("유관순")) {
			st[i] = null;
			System.out.println("정보삭제");
		}
		if(st[i] != null){
		st[i].showStudentInfo();
		}
		System.out.println("-----------");
	}
}
}
