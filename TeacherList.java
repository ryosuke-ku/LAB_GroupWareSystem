package kadai;
public class TeacherList{ // メンバー名簿

	public static Teacher[] TeacherMeibo(){ //所属教員一覧
		Teacher[] member = new Teacher[3];

		for(int i = 0; i < member.length; i++){
	        member[i] = new Teacher();
		}
		member[0].setName("野呂昌満");
		member[0].setTelephoneNumber("080-5106-4249");
		member[0].setMailAddress("yoshie@it.nanzan-u.ac.jp");
		member[0].LaboNumber = 1;

		member[1].setName("沢田篤史");
		member[1].setTelephoneNumber("090-5049-6785");
		member[1].setMailAddress("sawada@nanzan-u.ac.jp");
		member[1].LaboNumber = 2;

		member[2].setName("張漢明");
		member[2].setTelephoneNumber("080-6904-3315");
		member[2].setMailAddress("chang@nanzan-u.ac.jp");
		member[2].LaboNumber = 3;

		return member;

	}
}




