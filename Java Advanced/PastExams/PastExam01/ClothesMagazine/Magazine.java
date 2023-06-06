package JavaAdvance.PastExams.PastExam01.magazine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Magazine {
    private List<Cloth> data;
    private String type;
    private int capacity;

    public Magazine(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addCloth(Cloth cloth) {
        if (this.data.size() < capacity) {
            this.data.add(cloth);
        }
    }

    public boolean removeCloth(String color) {
        boolean hasColor = false;
        for (Cloth currentCloth : this.data) {
            if (currentCloth.getColor().equals(color)) {
                hasColor = true;
                data.remove(currentCloth);
            }
        }
        return hasColor;
    }

    public Cloth getSmallestCloth() {
        int smallestClothSize = Integer.MAX_VALUE;
        Cloth smallestCloth = null;
        for (Cloth currentCloth : this.data) {
            if (smallestClothSize >= currentCloth.getSize()) {
                smallestClothSize = currentCloth.getSize();
                smallestCloth = currentCloth;
            }
        }
        return smallestCloth;
    }

    public Cloth getCloth(String color) {
        for (Cloth currentCloth : this.data) {
            if (currentCloth.getColor().equals(color)) {
                return currentCloth;
            }
        }
        return null;
    }

    public int getCount() {
        return this.data.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (Cloth currentCloth : data) {
            sb.append(currentCloth);
            sb.append("\n");
        }
        sb = new StringBuilder(sb.toString().trim());
        return String.format("%s magazine contains:%n%s", this.type, sb);
    }
}
