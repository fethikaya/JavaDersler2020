package lambda;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Lambda07 {

	public static void main(String[] args) {

		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
		
		List<Course> courseList = new ArrayList<>();
		courseList.add(courseTurkishDay);
		courseList.add(courseTurkishNight);
		courseList.add(courseEnglishDay);
		courseList.add(courseEnglishNight);
		
		
		System.out.println(avrScor93Fazla1 (courseList));
		System.out.println(ogrSayi140FazlaOrtalama (courseList));
		System.out.println(dayTimeKursSayi (courseList));
		System.out.println(ogrSayi130FazlaOrtalama (courseList));
		System.out.println(ogrSayi150AzOrtalama (courseList));
		//System.out.println(avrScor93Fazla1 (courseList));
		//System.out.println(avrScor93Fazla1 (courseList));
		//System.out.println(avrScor93Fazla1 (courseList));
		//System.out.println(avrScor93Fazla1 (courseList));
		
	}
	
	// Averaga Scorlar� 93 den fazla olan kurslar�n ��renci say�lar�n�n toplam�n� bulunuz
	
	public static int avrScor93Fazla1 (List<Course> courseList) {
	return courseList.stream().filter(t->t.getAverageScore()>93).
		map(t->t.getNumberOfStudents()).reduce(0, Integer::sum);
	}
	// 2.yol
	public static int avrScor93Fazla2 (List<Course> courseList) {
		return courseList.stream().filter(t->t.getAverageScore()>93).
			mapToInt(t->t.getNumberOfStudents()).sum();
		// mapToInt methodu sum() kabul eder. mapToInt ile toplama yapabiliyoruz. reduce gerek yok
		}
	
	
	
	// ��renci say�lar� 140 dan fazla olan kurslar�n average scoronu bulunuz.
	
	public static OptionalDouble ogrSayi140FazlaOrtalama (List<Course> courseList) {
		return courseList.stream().filter(t->t.getNumberOfStudents()>140).
		mapToDouble(t->t.getAverageScore()).average();
	}
	
	// Day time kurslar�n�n say�s�n� bulan bir prgoram yaz�n�z
	
	public static long dayTimeKursSayi (List<Course> courseList) {
		return courseList.stream().filter(t->t.getCourseName().contains("Day")).count();
	}
	
	// ��renci say�lar� 130 dan fazla olan kurslar�n�n max average skorlar�n� bulunuz
	
	public static OptionalDouble ogrSayi130FazlaOrtalama (List<Course> courseList) {
		return courseList.stream().filter(t->t.getNumberOfStudents()>130).
		mapToDouble(Course::getAverageScore).max();
	}
	
	// ��renci say�lar� 150 dan fazla olan kurslar�n�n min average skorlar�n� bulunuz
	
	public static OptionalDouble ogrSayi150AzOrtalama (List<Course> courseList) {
		return courseList.stream().filter(t->t.getNumberOfStudents()<150).
		mapToDouble(Course::getAverageScore).min();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
