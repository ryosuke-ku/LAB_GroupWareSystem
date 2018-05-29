package kadai;


public class Member{ // 研究室構成員
	public String Name; //名前
	public String TelephoneNumber; //電話番号
	public String MailAddress; //メールアドレス
	public int LaboNumber; //研究室割当番号

	public void setName(String newSetName) { //名前のインスタンス化
		Name = newSetName;
	}

	public void setTelephoneNumber(String newSetTelephoneNumber) { //電話番号のインスタンス化
		TelephoneNumber = newSetTelephoneNumber;
		}

	public void setMailAddress(String newSetMailAddress) { //メールアドレスのインスタンス化
		MailAddress = newSetMailAddress;

	}
	public int LaboNumber(){ //研究室割当番号を返す
		return LaboNumber;
	}

}
