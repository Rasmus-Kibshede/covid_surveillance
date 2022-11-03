public class Covid19Data implements Comparable<Covid19Data> {
    private String region;
    private String ageGroup;
    private int totalCoincidences;
    private int numberOfDead;
    private int numberOfIntensive;
    private int numberOfHospitalized;
    private String date;

    public Covid19Data(String region, String ageGroup, int totalCoincidences, int numberOfDead, int numberOfIntensive, int numberOfHospitalized, String date) {
        this.region = region;
        this.ageGroup = ageGroup;
        this.totalCoincidences = totalCoincidences;
        this.numberOfDead = numberOfDead;
        this.numberOfIntensive = numberOfIntensive;
        this.numberOfHospitalized = numberOfHospitalized;
        this.date = date;
    }

    public String getRegion() {
        return region;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public int getTotalCoincidences() {
        return totalCoincidences;
    }

    public int getNumberOfDead() {
        return numberOfDead;
    }

    public int getNumberOfIntensive() {
        return numberOfIntensive;
    }

    public int getNumberOfHospitalized() {
        return numberOfHospitalized;
    }

    public String getDate() {
        return date;
    }

    @Override
    public int compareTo(Covid19Data o) {
        return region.compareTo(o.getRegion());
    }

    @Override
    public String toString() {
        return "Covid19Data{" + '\n' +
                "region= " + (region.isEmpty() ? "Empty" : region) + '\n' +
                "ageGroup= " + (ageGroup.isEmpty() ? "Empty" : ageGroup) + '\n' +
                "totalCoincidences= " + totalCoincidences + '\n' +
                "numberOfDead= " + numberOfDead + '\n' +
                "numberOfIntensive= " + numberOfIntensive + '\n' +
                "numberOfHospitalized= " + numberOfHospitalized + '\n' +
                "date= " + (date.isEmpty() ? "Empty" : date) + '\n' +
                '}';
    }
}
