package ch07_interface;

public class Ex25 {
	public static void main(String args[]) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("documents.xml");
	}
}

interface Parseable {
	public abstract void parse(String fileName);
}

//interface를 구현하면서 추상 메서드를 구현
class XMLParser implements Parseable {
	public void parse(String fileName) {
		System.out.println(fileName + " - XML parsing completed.");
	}
}

class HTMLParser implements Parseable {

	public void parse(String fileName) {
		System.out.println(fileName + " - HTML parsing completed.");
	}
}

class ParserManager {
	// XMLParser, HTMLParser 모두 Parseable interface를 구현했으므로 반환 가능
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			return new HTMLParser();
		}
	}
}