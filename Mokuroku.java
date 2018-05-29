package kadai;


public class Mokuroku { //参考文献一覧


	public static Reference[] BunkenMokuroku(){ //参考文献一覧
		Reference[] bunken = new Reference[100];

		for(int i = 0; i < bunken.length; i++){
	        bunken[i] = new Reference();
		}

		bunken[0].setTitle("モダンWeb");
		bunken[0].setSource("The Mobile Industry in Numbers");
		bunken[0].setDate("2014/09/09");
		bunken[0].setAuthor("Peter Gasston");
		bunken[0].setType("スマートデバイス");
		bunken[0].TypeNumber = 1;

		bunken[1].setTitle("インタラクティブシステムのための共通アーキテクチャに基づくソースコードの自動生成に関する研究");
		bunken[1].setSource("インタラクティブソフトウェアの提案");
		bunken[1].setDate("2017/○/○");
		bunken[1].setAuthor("水田大貴 村瀬賢");
		bunken[1].setType("アーキテクチャ");
		bunken[1].TypeNumber = 4;

		bunken[2].setTitle("コンテキストを考慮した組込みシステムのアスペクト指向アーキテクチャに関する研究");
		bunken[2].setSource("組込みソフトウェア非正常系の概念モデル");
		bunken[2].setDate("2016/○/○");
		bunken[2].setAuthor("小林純大 宮木華奈 井上航汰");
		bunken[2].setType("組込み");
		bunken[2].TypeNumber = 2;

		bunken[3].setTitle("SOA大全 サービス指向アーキテクチャ導入・設計・構築の指針");
		bunken[3].setSource("Enterprise SOA");
		bunken[3].setDate("2005/11/28");
		bunken[3].setAuthor("ディルク・クラフツィック カール・バンク ディルク・スラマ");
		bunken[3].setType("アーキテクチャ");
		bunken[3].TypeNumber = 4;

		bunken[4].setTitle("ソフトウェア工学の道具としての形式手法-彷徨える形式手法-");
		bunken[4].setSource("ソフトウェア工学の現状と動向");
		bunken[4].setDate("2007/07/○");
		bunken[4].setAuthor("中島震");
		bunken[4].setType("フォーマル");
		bunken[4].TypeNumber = 6;

		bunken[5].setTitle("コンパイラのファジング");
		bunken[5].setSource("The Plum Hall validation suite for C");
		bunken[5].setDate("20xx/○/○");
		bunken[5].setAuthor("石浦菜岐佐");
		bunken[5].setType("環境");
		bunken[5].TypeNumber = 5;

		bunken[6].setTitle("IoT1");
		bunken[6].setSource("IoT reference");
		bunken[6].setDate("20xx/○/○");
		bunken[6].setAuthor("IoTMAN");
		bunken[6].setType("IoT");
		bunken[6].TypeNumber = 3;

		return bunken;

	}
}
