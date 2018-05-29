package kadai;

public class ResearchThemeGroup { //研究分野集合

	public static ResearchTheme[] Theme(){

	ResearchTheme[] Kenkyu = new ResearchTheme[6];

	for(int i = 0; i < Kenkyu.length; i++){
        Kenkyu[i] = new ResearchTheme();
	}

	Kenkyu[0].setTitle("スマートデバイス・WEB");
	Kenkyu[0].ThemeNumber = 1;

	Kenkyu[1].setTitle("組込み");
	Kenkyu[1].ThemeNumber = 2;

	Kenkyu[2].setTitle("IoT");
	Kenkyu[2].ThemeNumber = 3;

	Kenkyu[3].setTitle("アーキテクチャ");
	Kenkyu[3].ThemeNumber = 4;

	Kenkyu[4].setTitle("環境");
	Kenkyu[4].ThemeNumber = 5;

	Kenkyu[5].setTitle("フォーマル");
	Kenkyu[5].ThemeNumber = 6;

	return Kenkyu;

	}
	}