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

//interface�� �����ϸ鼭 �߻� �޼��带 ����
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
	// XMLParser, HTMLParser ��� Parseable interface�� ���������Ƿ� ��ȯ ����
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			return new HTMLParser();
		}
	}
}