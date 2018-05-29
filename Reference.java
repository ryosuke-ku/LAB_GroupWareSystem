package kadai;


public class Reference { //参考文献
	public String Source; //出典
	public String Date; //出版日
	public String Title; //タイトル
	public String Author; //著者
	public String Type; //分野
	public int TypeNumber; //分野番号

	public void setTitle(String newSetTitle) { //タイトルのインスタンス化
		Title = newSetTitle;
	}

	public void setSource(String newSetSource) { //出典のインスタンス化
		Source = newSetSource;
	}

	public void setDate(String newSetDate) { //出版日のインスタンス化
		Date = newSetDate;
	}

	public void setAuthor(String newSetAuthor) { //著者のインスタンス化
		Author = newSetAuthor;
	}

	public void setType(String newSetType) { //分野のインスタンス化
		Type = newSetType;
	}

	public int TypeNumber(){ //分野番号を返す
		return TypeNumber;
	}
}