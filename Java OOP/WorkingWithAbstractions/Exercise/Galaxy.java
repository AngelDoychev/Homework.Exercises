package JavaOOP.WorkingWithAbstraction.Exercise.jediGalaxy;

public class Galaxy {
    private int[][] galaxy;
    private int row;
    private int col;

    public Galaxy(int row, int col) {
        this.row = row;
        this.col = col;
        this.galaxy = new int[row][col];
    }
    public void fillGalaxy(int rows, int cols) {
        int starsInCurrent = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                galaxy[i][j] = starsInCurrent++;
            }
        }
    }
    public int getLengthRow(){
        return galaxy.length;
    }
    public int getLengthCol(){
        return galaxy[row-1].length;
    }
    public int getStars(int rows, int cols){
        return this.galaxy[rows][cols];
    }
    public int[][] getGalaxy(){
        return this.galaxy;
    }
    public void setStars(int rows, int cols, int stars){
        this.galaxy[rows][cols] = stars;
    }
    public void moveEvil(Galaxy galaxy, int rowEvil, int colEvil) {
        while (rowEvil >= 0 && colEvil >= 0) {
            if (isInRange(rowEvil, colEvil, galaxy)) {
                galaxy.setStars(rowEvil, colEvil, 0);
            }
            rowEvil--;
            colEvil--;
        }
    }
    public boolean isInRange(int rows, int cols, Galaxy galaxy) {
        return rows >= 0 && cols >= 0 && rows < galaxy.getLengthRow() && cols < galaxy.getLengthCol();
    }
    public long moveJedi(Galaxy galaxy, long totalStars, int rowJedi, int colJedi) {
        while (rowJedi >= 0 && colJedi < galaxy.getLengthCol()) {
            if (isInRange(rowJedi, colJedi, galaxy)) {
                totalStars += galaxy.getStars(rowJedi, colJedi);
            }
            colJedi++;
            rowJedi--;
        }
        return totalStars;
    }

}
