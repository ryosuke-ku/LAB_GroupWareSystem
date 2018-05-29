package kadai;
public class Labo{ //研究室
	String Name;
	int LaboNumber;
	static Student[] GakuseiList = StudentList.StudentMeibo();
	static Student[] LaboStudent = new Student[100];

public void setName(String newSetName){
	Name = newSetName;
}

public int LaboNumber(){
	return LaboNumber;
}

public static Student[] MakeList(int j){ //所属学生一覧
	int i = 0;

	for(int k = 0; k < LaboStudent.length; k++){
        LaboStudent[k] = new Student();
	}

	for(int h = 0 ; h < GakuseiList.length ; h++){
		if(j == GakuseiList[h].LaboNumber){
			LaboStudent[i] = GakuseiList[h];
			i++;
		}
	}
		return LaboStudent;
}
public static int SumStudent(int j){ //所属学生の人数を返す処理
	int sum = 0;

	for(int a = 0 ; a < GakuseiList.length ; a++){
		if(j == GakuseiList[a].LaboNumber){
			sum++;
		}
	}
	return sum;
}





}
