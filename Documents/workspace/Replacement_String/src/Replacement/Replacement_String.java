package Replacement;

public class Replacement_String {
	/**
	 * 全角英字を半角英字に置換する処理
	 * 全角英字(ａ〜ｚ)を判定する
	 */
	public String Replacement_En(String str) {
		//StringBufferクラスのオブジェクトを生成
		StringBuffer sb = new StringBuffer(str);
		//対象の文字数分、ループ処理を行う
		for(int i = 0; i < sb.length(); i++) {
			//対象文字列よりi番目の文字をchar型で取得しEn変数に代入
			char En = sb.charAt(i);
			if (En >= 'ａ' && En <= 'ｚ') {
				//i番目の文字をchar型変換の半角英字(小文字)に置換する
				sb.setCharAt(i, (char)(En - 'ａ' + 'a'));
			} else if(En >= 'Ａ' && En <= 'Ｚ') {
				//i番目の文字をchar型変換の半角英字(大文字)に置換する
				sb.setCharAt(i, (char)(En - 'Ａ' + 'A'));
			}
		}
		//対象文字列をString型で返す
		return sb.toString();
	}
	
	/**
	 * 半角英字を全角英字に置換する処理
	 * 半角英字(a〜z)を判定する
	 */
	public String Replacement_Em(String str) {
		//StringBufferクラスのオブジェクト生成
		StringBuffer sb = new StringBuffer(str);
		//対象の文字数分、ループ処理を行う
		for(int i = 0; i < sb.length(); i++) {
			////対象文字列よりi番目の文字をchar型で取得しEm変数に代入
			char Em = sb.charAt(i);
			if(Em >= 'a' && Em <= 'z') {
				//i番目の文字をchar型変換の全角英字(小文字)に置換する
				sb.setCharAt(i, (char)(Em - 'a' + 'ａ'));
			} else if (Em >= 'A' && Em <= 'Z') {
				//i番目の文字をchar型変換の全角英字(大文字)に置換する
				sb.setCharAt(i, (char)(Em - 'A' + 'Ａ'));
			}
		}
		//対象文字列をString型で返す
		return sb.toString();
	}
}

