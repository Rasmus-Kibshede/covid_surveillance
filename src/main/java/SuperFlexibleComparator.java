import java.util.Comparator;

public class SuperFlexibleComparator implements Comparator<Covid19Data> {

    private String direction = "DESC";
    private String type;

    public SuperFlexibleComparator(String type, String direction) {
        this.type = type;
        this.direction = direction;
    }

    public void setDirection(String direction) {
        if (direction.equals("TOGGLE")) {
            if (this.direction.equals("ASC")) {
                this.direction = "DESC";
            } else {
                this.direction = "ASC";
            }
        } else {
            this.direction = direction;
        }
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public int compare(Covid19Data o1, Covid19Data o2) {
        int result = switch (type) {
            case "region" -> o1.getRegion().compareTo(o2.getRegion());
            case "ageGroup" -> o1.getAgeGroup().compareTo(o2.getAgeGroup());
            case "numberOfDead" -> Integer.compare(o1.getNumberOfDead(), o2.getNumberOfDead());
            default -> o1.getRegion().compareTo(o2.getRegion());
        };

        if (direction.equals("DESC")) {
            result = result * -1;
        }

        return result;
    }
}
