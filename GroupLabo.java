package kadai;
public class GroupLabo { //合同研究室

	public static Labo[] LaboMeibo(){
	Labo[] labo = new Labo[3];

	for(int i = 0; i < labo.length; i++){
        labo[i] = new Labo();
	}
	labo[0].setName("野呂");
	labo[0].LaboNumber = 1;

	labo[1].setName("沢田");
	labo[1].LaboNumber = 2;

	labo[2].setName("張");
	labo[2].LaboNumber = 3;

	return labo;
	}

}