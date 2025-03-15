class File extends FileSystemItem {
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void showInfo() {
        System.out.println("File: " + name + " (Size: " + size + " KB)");
    }
}