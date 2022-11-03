public class Controller {
    private FileHandler fileHandler = new FileHandler();




    public void loadDataFromFile() {
        fileHandler.loadData();
    }

    public String showData() {
        return fileHandler.showData();
    }
}
