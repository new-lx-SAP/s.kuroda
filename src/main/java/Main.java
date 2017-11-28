import java.util.*;
// TODO バブルソートを行うBubbleSortクラスを実装する
/**
 * Main class
 */
public class Main {
	/**
	 * The entry point to the application
	 */
	public static void main(String[] args){
		
		//リスト作成
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++){
			list.add((int)(Math.random()*100));
		}
		
		//ソート前のリストの要素を出力
		System.out.println("---ソート前---");
		output(list);
		
		final BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(list);
		
		// ソート後のリストの要素を出力
		System.out.println("---ソート後---");
		output(list);
	}
	
	//画面出力
	public static void output(List<Integer> list){
		for(Integer i : list){
			System.out.println(i);
		}
	}

}


// TODO このクラスを継承してBubbleSortクラスを作る
/**
 * Base sort class
 */
abstract class Sort {
	//abstract 戻り値　処理名（引数）;
	public abstract List<Integer> sort(List<Integer> list);
}

class BubbleSort extends Sort{
	public List<Integer> sort(List<Integer> list){
		//バブルソート
		for(int i = 0;i<list.size()-1;i++){
			for(int j=i+1 ;j<list.size();j++){
				if((int)list.get(i) > (int)list.get(j)){
					int K = list.get(i);
					list.set(i,list.get(j));
					list.set(j,K);
				}
			}
		}
		return list;
	}
}