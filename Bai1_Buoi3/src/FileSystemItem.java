import java.util.ArrayList;
import java.util.List;

public abstract class FileSystemItem {
	protected String name;

	public FileSystemItem(String name) {
		this.name = name;
	}

	public abstract void showInfo();
}