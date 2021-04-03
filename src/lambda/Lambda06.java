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
	
	// Average score'larýn tamamini 92 den büyük olup olmadýðýný kontrol eden bir program yazýnýz
	
	public static boolean avgScrBuyuk92 (List<Course> courseList) {
		return courseList.stream().allMatch(t->t.getAverageScore()>92);
	}
	
// 	Ogrenci sayýlarýnýn hiçbirin 120'den az olmadýðýný kontrol eden bir program yazýnýz
	
	
	public static boolean ogrSayi120Az (List<Course> courseList) {
		return courseList.stream().noneMatch(t->t.getNumberOfStudents()<120);
	}
	
// Kurs sezonlarýnýn herhangi birinin "Spring"	olup olmadýðýný kontrol eden program yazýn
	
	public static boolean kursSezonSpring (List<Course> courseList) {
		return courseList.stream().anyMatch(t->t.getSeason().equals("Spring"));
	}
	
// Kurslarý öðrenci sayýlarýna göre buyukten kucuge sýralayýnýz
	
	public static List <Course> ogrSayiKursRev (List<Course> courseList){
		return courseList.stream().
				sorted (Comparator.comparing (Course::getNumberOfStudents)).
				collect(Collectors.toList());
	}
	
// Kurslarý averaga scorlarýna göre büyükten küçüðe göre sýralayýn ve ilk üçün gösteriniz
	
	public static List <Course> avgScorevgIlkUc(List<Course> courseList) {
		return courseList.stream().sorted (Comparator.comparing(Course::getAverageScore).reversed()).
		limit(3).
		collect (Collectors.toList());
	}
	
// Kurslardan öðrenci sayýsý en az olan ikinci kursu ekrana yazdýrýnýz
	
	public static List <Course> ogrSayiEnAzIkinci (List<Course> courseList) {
		return courseList.stream().sorted(Comparator.comparing(Course::getNumberOfStudents)).
		limit(2).skip(1). // limit ile ilk ikisini alýp, skip ile birincisini atladýk
		collect (Collectors.toList());
	}
	
}
