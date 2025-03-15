public class CompositePatternDemo {
	public static void main(String[] args) {
		Directory root = new Directory("Root");
		Directory documents = new Directory("Documents");
		Directory images = new Directory("Images");

		File file1 = new File("Resume.pdf", 120);
		File file2 = new File("Photo.jpg", 500);
		File file3 = new File("Music.mp3", 3000);

		documents.add(file1);
		images.add(file2);
		root.add(documents);
		root.add(images);
		root.add(file3);

		root.showInfo();
	}
}