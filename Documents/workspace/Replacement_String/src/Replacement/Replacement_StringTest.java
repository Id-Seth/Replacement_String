package Replacement;

import static org.junit.Assert.*;
import org.junit.Test;

public class Replacement_StringTest extends Replacement_String {

	@Test
	public void test() {
		
		//全角英字から半角英字(a〜z)へ置換のテストパターン
		assertEquals("ａ", new Replacement_String().Replacement_Em("a"));
		assertEquals("ｂ", new Replacement_String().Replacement_Em("b"));
		assertEquals("ｃ", new Replacement_String().Replacement_Em("c"));
		assertEquals("ｄ", new Replacement_String().Replacement_Em("d"));
		assertEquals("ｅ", new Replacement_String().Replacement_Em("e"));
		assertEquals("ｆ", new Replacement_String().Replacement_Em("f"));
		assertEquals("ｇ", new Replacement_String().Replacement_Em("g"));
		assertEquals("ｈ", new Replacement_String().Replacement_Em("h"));
		assertEquals("ｉ", new Replacement_String().Replacement_Em("i"));
		assertEquals("ｊ", new Replacement_String().Replacement_Em("j"));
		assertEquals("ｋ", new Replacement_String().Replacement_Em("k"));
		assertEquals("ｌ", new Replacement_String().Replacement_Em("l"));
		assertEquals("ｍ", new Replacement_String().Replacement_Em("m"));
		assertEquals("ｎ", new Replacement_String().Replacement_Em("n"));
		assertEquals("ｏ", new Replacement_String().Replacement_Em("o"));
		assertEquals("ｐ", new Replacement_String().Replacement_Em("p"));
		assertEquals("ｑ", new Replacement_String().Replacement_Em("q"));
		assertEquals("ｒ", new Replacement_String().Replacement_Em("r"));
		assertEquals("ｓ", new Replacement_String().Replacement_Em("s"));
		assertEquals("ｔ", new Replacement_String().Replacement_Em("t"));
		assertEquals("ｕ", new Replacement_String().Replacement_Em("u"));
		assertEquals("ｖ", new Replacement_String().Replacement_Em("v"));
		assertEquals("ｗ", new Replacement_String().Replacement_Em("w"));
		assertEquals("ｘ", new Replacement_String().Replacement_Em("x"));
		assertEquals("ｙ", new Replacement_String().Replacement_Em("y"));
		assertEquals("ｚ", new Replacement_String().Replacement_Em("z"));
		
		//半角英字から全角英字(Ａ〜Ｚ)の置換のテストパターン
		assertEquals("a", new Replacement_String().Replacement_En("ａ"));
		assertEquals("b", new Replacement_String().Replacement_En("ｂ"));
		assertEquals("c", new Replacement_String().Replacement_En("ｃ"));
		assertEquals("d", new Replacement_String().Replacement_En("ｄ"));
		assertEquals("e", new Replacement_String().Replacement_En("ｅ"));
		assertEquals("f", new Replacement_String().Replacement_En("ｆ"));
		assertEquals("g", new Replacement_String().Replacement_En("ｇ"));
		assertEquals("h", new Replacement_String().Replacement_En("ｈ"));
		assertEquals("i", new Replacement_String().Replacement_En("ｉ"));
		assertEquals("j", new Replacement_String().Replacement_En("ｊ"));
		assertEquals("k", new Replacement_String().Replacement_En("ｋ"));
		assertEquals("l", new Replacement_String().Replacement_En("ｌ"));
		assertEquals("m", new Replacement_String().Replacement_En("ｍ"));
		assertEquals("n", new Replacement_String().Replacement_En("ｎ"));
		assertEquals("o", new Replacement_String().Replacement_En("ｏ"));
		assertEquals("p", new Replacement_String().Replacement_En("ｐ"));
		assertEquals("q", new Replacement_String().Replacement_En("ｑ"));
		assertEquals("r", new Replacement_String().Replacement_En("ｒ"));
		assertEquals("s", new Replacement_String().Replacement_En("ｓ"));
		assertEquals("t", new Replacement_String().Replacement_En("ｔ"));
		assertEquals("u", new Replacement_String().Replacement_En("ｕ"));
		assertEquals("v", new Replacement_String().Replacement_En("ｖ"));
		assertEquals("w", new Replacement_String().Replacement_En("ｗ"));
		assertEquals("x", new Replacement_String().Replacement_En("ｘ"));
		assertEquals("y", new Replacement_String().Replacement_En("ｙ"));
		assertEquals("z", new Replacement_String().Replacement_En("ｚ"));
		
		/*エラーが発生するテストパターン
		assertEquals("a", new Replacement_String().Replacement_En("ｂ"));
		assertEquals("BenＱ", new Replacement_String().Replacement_En("BenQ"));
		assertEquals("144Hz", new Replacement_String().Replacement_Em("１４４Ｈｚ"));
		assertEquals("jpeg@", new Replacement_String().Replacement_Em("jpeg"));
		assertEquals("pｎg", new Replacement_String().Replacement_En("ｐng"));
		assertEquals("GTX980", new Replacement_String().Replacement_Em("GTＸ980"));
		assertEquals("144Hz", new Replacement_String().Replacement_Em("１４４Ｈｚ");
		 */
		
		
		/*
		assertEquals("Java", new Replacement_String().Replacement_En("Ｊａｖａ"));
		assertEquals("PHP", new Replacement_String().Replacement_En("ＰＨＰ"));
		assertEquals("JAva", new Replacement_String().Replacement_En("ＪＡｖａ"));
		assertEquals("Ｊａｖａ", new Replacement_String().Replacement_Em("Java"));
		*/
	}

}
