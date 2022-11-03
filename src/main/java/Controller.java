public class Controller {
    private FileHandler fileHandler = new FileHandler();

    public void loadDataFromFile() {
        fileHandler.loadData();
    }

    public void sort(String type, String direction) {
        fileHandler.sortBy(type, direction);
    }

    public String showData() {
        return fileHandler.showData();
    }
}
