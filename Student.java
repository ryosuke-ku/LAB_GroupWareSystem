package kadai;


public class Student extends Member{ //学生
	public String StudentNumber; //学生番号
	public String ChargeTeacher; //担当教員


	public void setStudentNumber(String newSetStudentNumber) { //学生番号のインスタンス化
		StudentNumber = newSetStudentNumber;
	}
	public void setChargeTeacher(String newSetChargeTeacher) { //担当教員のインスタンス化
		ChargeTeacher = newSetChargeTeacher;
	}


}

