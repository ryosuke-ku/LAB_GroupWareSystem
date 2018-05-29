package kadai;


public class References { //参考文献目録
	static Reference[] BunkenList = Mokuroku.BunkenMokuroku();
	static Reference[] SankouBunken = new Reference[100];


	public static Reference[] MakeBunkenList(int j){ //文献のリスト化
		int i = 0;

		for(int k = 0; k < SankouBunken.length; k++){
	        SankouBunken[k] = new Reference();
		}

		for(int h = 0 ; h < BunkenList.length ; h++){
			if(j == BunkenList[h].TypeNumber){
				SankouBunken[i] = BunkenList[h];
				i++;
			}
		}
			return SankouBunken;
	}
	public static int SumBunken(int j){ //文献の数を返す処理
		int sum = 0;

		for(int a = 0 ; a < SankouBunken.length ; a++){
			if(j == BunkenList[a].TypeNumber){
				sum++;
			}
		}
		return sum;
	}



}
