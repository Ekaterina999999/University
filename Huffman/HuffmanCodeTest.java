public class HuffmanCodeTest {

	public static void main(String[] args) {
		String text = "Hi! My name is Kate! What is your name? Where are from? What nationality are you?";

		// ��� �������� ��������, ��� ���������� �������� �� ����������� 256
		double[] charFrequencies = new double[1500];
		// ��������� ������� � ������� �� �������
		for (char c : text.toCharArray()) {
			charFrequencies[c]++;
		}

		// ������ ������
		HuffmanTree tree = HuffmanTree.buildHuffmanTree(charFrequencies);
		System.out.printf("size before compression = %d%n", text.length() * 8);
		String incoded = tree.incode(text);
		System.out.println("incoded result = " + incoded);
		System.out.printf("size after compression = %d%n", incoded.length());
		String decoded = tree.decode(incoded);
		System.out.println(decoded);

		// ����� ������� �������
		tree.printCodes();
	}

}