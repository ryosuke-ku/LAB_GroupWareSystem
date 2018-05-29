package kadai;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	static Student[] LaboStudentList= new Student[100];
	static Teacher[] SenseiList = TeacherList.TeacherMeibo();
	static Reference[] BookList = new Reference[100];
	static Labo[] LaboList = GroupLabo.LaboMeibo();
	static ResearchTheme[] ThemeList = ResearchThemeGroup.Theme();

	public static void main(String[] args) {

		System.out.println("【操作を選択】");
		System.out.println("1:研究室構成員一覧表示");
		System.out.println("2:参考文献一覧表示");
		System.out.println("");
		System.out.println("該当する番号を入力してください");

		scanner = new Scanner(System.in);
		int p1 = scanner.nextInt();

		if(p1 == 1){
			StudentListDisp();
		}
		else if(p1 == 2){
			ReferencesListDisp();
		}else{
			System.out.println("※その入力は無効です");
		}
		scanner.close();

	}

	private static void StudentListDisp(){ //学生一覧と教員の情報を表示する処理
		System.out.println("【操作を選択】");

		for(int a = 0 ; a < LaboList.length ; a++){
					System.out.println(LaboList[a].LaboNumber +":"+ LaboList[a].Name + "研究室に所属する学生一覧");
				}

		System.out.println("");
		System.out.println("該当する番号を入力してください");

		for(int k = 0; k <LaboStudentList.length; k++){
	        LaboStudentList[k] = new Student();
		}

		int p2 = scanner.nextInt(); //入力した数字
		LaboStudentList = Labo.MakeList(p2);

		int k = 0;

			TeacherDisplay(p2 - 1);

			for(int j = 0 ;j < Labo.SumStudent(p2) ; j++){
					if(k == 0){
						System.out.println(LaboStudentList[j].ChargeTeacher + "の研究室に所属する学生の一覧です。");
						System.out.println("");
					}
					StudentDisplay(j);
					k++;

				}
		if(k == 0){ //例外処理
			System.out.println("※該当する教員が存在しないか、学生が登録されていません");
	}
	}


	private static void ReferencesListDisp(){ //参考文献の一覧を表示する処理
		System.out.println("【研究分野を選択】");

		for(int a = 0 ; a <ThemeList.length ; a++){
			System.out.println(ThemeList[a].ThemeNumber +":"+ ThemeList[a].ThemeTitle);
		}

		System.out.println("");
		System.out.println("検索したい分野の番号を入力してください");

		for(int k = 0; k <BookList.length; k++){
	        BookList[k] = new Reference();
		}

		int p3 = scanner.nextInt();
		BookList = References.MakeBunkenList(p3);

		int k = 0;

		for(int j = 0 ; j < References.SumBunken(p3) ; j++){
				if(k == 0){
				System.out.println(BookList[j].Type + "に関しての参考文献一覧です。");
				System.out.println("");
				}
				BookDisplay(j);
				k++;
	}
		if(k == 0){ //例外処理
			System.out.println("※該当する分野が存在しないか、文献がありません");
	}
	}


	private static void StudentDisplay(int mem) { //生徒の情報を表示

		System.out.println("名前 : "+ LaboStudentList[mem].Name);
		System.out.println("学生番号 : "+ LaboStudentList[mem].StudentNumber);
		System.out.println("電話番号 : "+ LaboStudentList[mem].TelephoneNumber);
		System.out.println("メールアドレス : "+ LaboStudentList[mem].MailAddress);
		System.out.println("担当教員 : "+ LaboStudentList[mem].ChargeTeacher);
		System.out.println("");
	}

	private static void BookDisplay(int num) { //文献の情報を表示

		System.out.println("タイトル : "+ BookList[num].Title);
		System.out.println("著者 : "+ BookList[num].Author);
		System.out.println("出版日 : "+ BookList[num].Date);
		System.out.println("出典 : "+ BookList[num].Source);
		System.out.println("分野 : "+ BookList[num].Type);
		System.out.println("");
	}

	private static void TeacherDisplay(int mem) { //教員の情報を表示

		System.out.println("名前 : "+ SenseiList[mem].Name);
		System.out.println("電話番号 : "+ SenseiList[mem].TelephoneNumber);
		System.out.println("メールアドレス : "+ SenseiList[mem].MailAddress);
		System.out.println("");
	}

}