package SetConcepts;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumClass {

	// It is not synchronized
	// It is high performance java collection framework member
	// Faster than HashSet
	// All the method are implemented using bitwise Arithmetic operations

	enum Lang {
		JAVA, PHYTHON, C, RUBY, XML
	}

	public static void main(String[] args) {

		// Create new ENUM set using ENUM
		System.out.println("*******************Create Full ENUM set***************************************");
	
		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println("ENUM Language Map :: " + langs);

		System.out.println("*******************Create empty ENUM set***************************************");
		// Create empty ENUM set

		EnumSet<Lang> emptyLang = EnumSet.noneOf(Lang.class);
		System.out.println("Empty ENUM set :: " + emptyLang);

		System.out.println("*******************range (e1,e2)***************************************");

		// range (e1,e2)
		EnumSet<Lang> rangeValues = EnumSet.range(Lang.JAVA, Lang.RUBY);
		System.out.println("Range values :: " + rangeValues);

		System.out.println("*******************Of (e1,e2)***************************************");

		// Of (e1,e2)
		EnumSet<Lang> oFValue = EnumSet.of(Lang.XML);
		System.out.println("Of values :: " + oFValue);

		// Multiple ENUM
		System.out.println("*******************Multiple ENUM***************************************");
		EnumSet<Lang> multipleEnum = EnumSet.of(Lang.PHYTHON, Lang.XML);
		System.out.println("MultipleEnum values :: " + multipleEnum);

		System.out.println("*******************Add and AddAll***************************************");

		// Add and AddAll
		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
		lang2.add(Lang.RUBY);
		System.out.println("Lang2 Languages after Add:: " + lang2);
		lang2.addAll(lang1);
		System.out.println("Lang2 Languages after Add all :: " + lang2);

		System.out.println("*******************Iterator***************************************");
		// Iterator
		EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);
		Iterator<Lang> it =fullLang.iterator();
		while(it.hasNext())
		{
			System.out.println("Iterator output :: " + it.next());
		}
		
		// Remove () and RemoveAll ()
		
		System.out.println("*******************Remove() and RemoveAll()***************************************");		
		EnumSet<Lang> newLang = EnumSet.allOf(Lang.class);
		System.out.println("NewLang values :: " + newLang);
		boolean b = newLang.remove(Lang.XML);
		System.err.println("Single ENUM removed :: " + b);
		System.out.println("NewLang values after removing XML value:: " + newLang);
		
		boolean b1 = newLang.removeAll(newLang);
		System.err.println("All ENUM removed :: " + b1);
		System.out.println("NewLang values after removing all ENUM :: " + newLang);
		
	}
}
