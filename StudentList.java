package kadai;


public class StudentList { // メンバー名簿

	public static Student[] StudentMeibo(){ //所属学生一覧
		Student[] member = new Student[100];

		for(int i = 0; i < member.length; i++){
	        member[i] = new Student();
		}
		member[0].setName("水谷康佑");
		member[0].setTelephoneNumber("080-6904-0221");
		member[0].setMailAddress("14se068@m.nanzan-u.ac.jp");
		member[0].setStudentNumber("2014SE068");
		member[0].setChargeTeacher("張先生");
		member[0].LaboNumber = 3;

		member[1].setName("近藤諒");
		member[1].setTelephoneNumber("080-1561-1970");
		member[1].setMailAddress("14se054@m.nanzan-u.ac.jp");
		member[1].setStudentNumber("2014SE054");
		member[1].setChargeTeacher("張先生");
		member[1].LaboNumber = 3;

		member[2].setName("古川敦啓");
		member[2].setTelephoneNumber("090-6577-4933");
		member[2].setMailAddress("14se012@m.nanzan-u.ac.jp");
		member[2].setStudentNumber("2014SE012");
		member[2].setChargeTeacher("張先生");
		member[2].LaboNumber = 3;

		member[3].setName("竹内優斗");
		member[3].setTelephoneNumber("090-6599-7372");
		member[3].setMailAddress("14se099@m.nanzan-u.ac.jp");
		member[3].setStudentNumber("2014SE099");
		member[3].setChargeTeacher("沢田先生");
		member[3].LaboNumber = 2;

		member[4].setName("東浦倭光");
		member[4].setTelephoneNumber("080-4300-6790");
		member[4].setMailAddress("ex14.ak69.orz@ezweb.ne.jp");
		member[4].setStudentNumber("2014SE018");
		member[4].setChargeTeacher("野呂先生");
		member[4].LaboNumber = 1;

		member[5].setName("石塚雄太");
		member[5].setTelephoneNumber("080-1565-0870");
		member[5].setMailAddress("black.yuta_f-06b@docomo.ne.jp");
		member[5].setStudentNumber("2014SE031");
		member[5].setChargeTeacher("野呂先生");
		member[5].LaboNumber = 1;

		member[6].setName("北川智久");
		member[6].setTelephoneNumber("090-5605-6723");
		member[6].setMailAddress("mk22xxxadaman@yahoo.co.jp");
		member[6].setStudentNumber("2014SE049");
		member[6].setChargeTeacher("野呂先生");
		member[6].LaboNumber = 1;

		member[7].setName("石井聖大");
		member[7].setTelephoneNumber("080-3630-9600");
		member[7].setMailAddress("crabang9416@gmail.com");
		member[7].setStudentNumber("2014SE029");
		member[7].setChargeTeacher("沢田先生");
		member[7].LaboNumber = 2;

		member[8].setName("北野大地");
		member[8].setTelephoneNumber("090-4792-7478");
		member[8].setMailAddress("lear.gotten@iCloud.com");
		member[8].setStudentNumber("2014SE050");
		member[8].setChargeTeacher("沢田先生");
		member[8].LaboNumber = 2;

		member[9].setName("北山裕斗");
		member[9].setTelephoneNumber("080-4221-4468");
		member[9].setMailAddress("yutuuuu-10110608@i.softbank.jp");
		member[9].setStudentNumber("2014SE051");
		member[9].setChargeTeacher("沢田先生");
		member[9].LaboNumber = 2;

		member[10].setName("倉地亮介");
		member[10].setTelephoneNumber("080-5168-1341");
		member[10].setMailAddress("bbass1020@yahoo.co.jp");
		member[10].setStudentNumber("2014SE056");
		member[10].setChargeTeacher("沢田先生");
		member[10].LaboNumber = 2;

		member[11].setName("三井卓弥");
		member[11].setTelephoneNumber("080-6782-3720");
		member[11].setMailAddress("m.takuya-soccer@ezweb.ne.jp");
		member[11].setStudentNumber("2014SE063");
		member[11].setChargeTeacher("沢田先生");
		member[11].LaboNumber = 2;

		member[12].setName("佐野達也");
		member[12].setTelephoneNumber("090-2266-5836");
		member[12].setMailAddress("t.s1995-green@i.softbank.jp");
		member[12].setStudentNumber("2014SE085");
		member[12].setChargeTeacher("沢田先生");
		member[12].LaboNumber = 2;

		member[13].setName("澤木結香");
		member[13].setTelephoneNumber("090-3959-1536");
		member[13].setMailAddress("futa.ty13@gmail.com");
		member[13].setStudentNumber("2014SE088");
		member[13].setChargeTeacher("沢田先生");
		member[13].LaboNumber = 2;

		return member;

	}

}




