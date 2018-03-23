
public class a114_reverse_a_sentance {

	public static void main(String[] args) {
		String sent = "I am practicing this small coding problems now.",senttt = "";
		String[] sentt = sent.split(" ");
		for(int i = sentt.length-1; i>=0; i--) {
			senttt += sentt[i]+" ";
		}
		System.out.println(senttt);
	}

}
