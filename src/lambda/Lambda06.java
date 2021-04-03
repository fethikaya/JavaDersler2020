package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda06 {

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
		
		System.out.println(avgScrBuyuk92 (courseList));
		System.out.println(ogrSayi120Az (courseList));
		System.out.println(kursSezonSpring (courseList));
		System.out.println(ogrSayiKursRev  (courseList));
		System.out.println(avgScorevgIlkUc  (courseList));
		System.out.println(ogrSayiEnAzIkinci (courseList));
		
	}
	
	// Average score'lar�n tamamini 92 den b�y�k olup olmad���n� kontrol eden bir program yaz�n�z
	
	public static boolean avgScrBuyuk92 (List<Course> courseList) {
		return courseList.stream().allMatch(t->t.getAverageScore()>92);
	}
	
// 	Ogrenci say�lar�n�n hi�birin 120'den az olmad���n� kontrol eden bir program yaz�n�z
	
	
	public static boolean ogrSayi120Az (List<Course> courseList) {
		return courseList.stream().noneMatch(t->t.getNumberOfStudents()<120);
	}
	
// Kurs sezonlar�n�n herhangi birinin "Spring"	olup olmad���n� kontrol eden program yaz�n
	
	public static boolean kursSezonSpring (List<Course> courseList) {
		return courseList.stream().anyMatch(t->t.getSeason().equals("Spring"));
	}
	
// Kurslar� ��renci say�lar�na g�re buyukten kucuge s�ralay�n�z
	
	public static List <Course> ogrSayiKursRev (List<Course> courseList){
		return courseList.stream().
				sorted (Comparator.comparing (Course::getNumberOfStudents)).
				collect(Collectors.toList());
	}
	
// Kurslar� averaga scorlar�na g�re b�y�kten k����e g�re s�ralay�n ve ilk ���n g�steriniz
	
	public static List <Course> avgScorevgIlkUc(List<Course> courseList) {
		return courseList.stream().sorted (Comparator.comparing(Course::getAverageScore).reversed()).
		limit(3).
		collect (Collectors.toList());
	}
	
// Kurslardan ��renci say�s� en az olan ikinci kursu ekrana yazd�r�n�z
	
	public static List <Course> ogrSayiEnAzIkinci (List<Course> courseList) {
		return courseList.stream().sorted(Comparator.comparing(Course::getNumberOfStudents)).
		limit(2).skip(1). // limit ile ilk ikisini al�p, skip ile birincisini atlad�k
		collect (Collectors.toList());
	}
	
}
